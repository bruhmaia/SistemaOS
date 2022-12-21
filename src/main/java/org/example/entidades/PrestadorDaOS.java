package org.example.entidades;

import java.util.ArrayList;

public class PrestadorDaOS {
    ArrayList<Prestador> prestadoresOS;
    String Descricao;
    String CodOrdemdeservico;

    PrestadorDaOS(String Descricao, String CodOrdemdeservico){
        this.Descricao=Descricao;
        this.CodOrdemdeservico=CodOrdemdeservico;
        this.prestadoresOS=new ArrayList<>();
    }

    public void adicionarPrestador(Prestador prestador) {this.prestadoresOS.add(prestador);};

    public ArrayList<Prestador> getPrestadoresOS() {
        return prestadoresOS;
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

    public void setPrestadorAtual() {
    }
}
