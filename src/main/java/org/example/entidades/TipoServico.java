package org.example.entidades;

public enum TipoServico {
    FORMATACAO(1, "Formatação de Computador"), COMPONENTE(2, "Troca de Componente"), LIMPEZA(3, "Limpeza do Computador");

    private int opcao;
    private String label;

    TipoServico(int opcao, String label){
        this.label = label;
        this.opcao = opcao;
    }

    public int getOpcao() {
        return opcao;
    }

    public String getLabel() {
        return label;
    }

    public static TipoServico retornaOpcao(int opcao){
        for(TipoServico tipoServico : TipoServico.values()){
            if(tipoServico.opcao == opcao){
                return tipoServico;
            }
        }
        throw new RuntimeException(("Opção inválida!"));
    }
}
