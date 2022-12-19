package org.example.entidades;

public class Servico {
    private int codigoServico;
    private TipoServico tipoServico;
    private String descricao;

    public Servico(int codigoServico, TipoServico tipoServico, String descricao){
        this.codigoServico = codigoServico;
        this.tipoServico = tipoServico;
        this.descricao = descricao;
    }

    public int getCodigoServico() {
        return codigoServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    /*
    public boolean adicionarTipoServico(int opcao){
        this.tipoServico = TipoServico.retornaOpcao(opcao);
        return this.tipoServico.getOpcao() > 0;
    } */


}
