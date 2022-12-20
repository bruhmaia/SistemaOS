package org.example.telas;

import org.example.entidades.Servico;
import org.example.entidades.TipoServico;
import org.example.exceptions.ServicoNaoEncontradoException;
import org.example.persistencia.ServicoPersistencia;

import java.util.Scanner;

public class TelaCadastrarServico implements TelaServico {
    private static int SEQUENCIAL_CODIGO_SERVICO = 1;
    @Override
    public void executar(Scanner scanner) throws ServicoNaoEncontradoException {
        System.out.println("Informe o código do tipo do serviço desejado: ");
        for(TipoServico tipoServico : TipoServico.values()){
            System.out.println("Tipo Serviço: " + tipoServico.getLabel() + " | Código: " + tipoServico.getOpcao() + " \n");
        }

        TipoServico tipoServico = TipoServico.retornaOpcao(scanner.nextInt());
        System.out.println("Informe a descrição do serviço: ");
        scanner.nextLine();
        String descricao = scanner.nextLine();
        System.out.println(descricao);

        Servico servico = new Servico(SEQUENCIAL_CODIGO_SERVICO, tipoServico, descricao);

        ServicoPersistencia.adicionarServico(servico);

        System.out.println("Serviço Cadastrado. Dados do serviço: \n | Código: " + SEQUENCIAL_CODIGO_SERVICO + " |\n | Tipo Serviço: " + tipoServico.getLabel() + " |\n | Descrição: " + descricao + " | \n");
        SEQUENCIAL_CODIGO_SERVICO++;
    }
}
