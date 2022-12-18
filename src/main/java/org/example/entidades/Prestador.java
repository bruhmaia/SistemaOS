package org.example.entidades;

public class Prestador extends Pessoa{

    private int numeroInscricao;

    public Prestador(int numeroInscricao, String nome, String sobrenome, String CPF, String endereco, String telefone) {
        this.setNumeroInscricao(numeroInscricao);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setCPF(CPF);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }
}
