package com.api.gerarnomecompleto;

public class Pessoa {
    private String primeiro_nome;
    private String sobre_nome;

    public Pessoa(String nomeCompleto) {
        String[] nomeSobrenome = nomeCompleto.split(" ");
        this.primeiro_nome = nomeSobrenome[0];
        this.sobre_nome = nomeSobrenome[1];
    }

    public String getNome() {
        return primeiro_nome;
    }

    public void setNome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getSobrenome() {
        return sobre_nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobre_nome = sobrenome;
    }
}
