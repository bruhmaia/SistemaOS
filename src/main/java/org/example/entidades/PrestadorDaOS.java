package org.example.entidades;

public class PrestadorDaOS {
    Prestador prestadorAtual;
    Prestador prestadorAntigo;
    String Descricao;
    OS Ordemdeservico;

    private PrestadorDaOS(Prestador prestadorAtual, Prestador prestadorAntigo, String Descricao, OS Ordemdeservico){
        this.Descricao=Descricao;
        this.prestadorAtual=prestadorAtual;
        this.prestadorAntigo=prestadorAntigo;
        this.Ordemdeservico=Ordemdeservico;
    }

    public Prestador getPrestadorAntigo() {
        return prestadorAntigo;
    }

    public void setPrestadorAntigo(Prestador prestadorAntigo) {

        this.prestadorAntigo = prestadorAntigo;
    }

    public Prestador getPrestadorAtual() {
        return prestadorAtual;
    }

    public void setPrestadorAtual(Prestador prestadorAtual) {
        this.prestadorAtual = prestadorAtual;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public OS getOrdemdeservico() {
        return Ordemdeservico;
    }

    public void setOrdemdeservico(OS ordemdeservico) {
        Ordemdeservico = ordemdeservico;
    }

}
