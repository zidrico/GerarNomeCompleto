package com.api.gerarnomecompleto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.util.Scanner;


@SpringBootApplication

public class GerarNomeCompletoApplication {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu primeiro nome: ");
		String primeiro_nome = scanner.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobre_nome = scanner.nextLine();

		Pessoa pessoa = new Pessoa(primeiro_nome + " " + sobre_nome);

		System.out.println("Nome completo: " + pessoa.getNome() + " " + pessoa.getSobrenome());

		// Chama o script Python e passa o nome completo como argumento
		String command = "python script_imc.py " + pessoa.getNome() + " " + pessoa.getSobrenome();
		Process process = Runtime.getRuntime().exec(command);

		// Lê a saída do script Python
		Scanner scannerPython = new Scanner(process.getInputStream());
		while (scannerPython.hasNext()) {
			System.out.println(scannerPython.nextLine());
		}
	}
}