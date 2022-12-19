package org.example.entidades;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String CPF;
    private String Endereco;
    private String telefone;


    public Pessoa(String nome, String sobrenome, String CPF, String endereco, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        Endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
