package org.example.telas;

import org.example.entidades.Servico;
import org.example.exceptions.ServicoNaoEncontradoException;
import org.example.persistencia.ServicoPersistencia;

import java.util.Scanner;

public class TelaBuscarServico implements TelaServico {
    @Override
    public void executar(Scanner scanner) throws ServicoNaoEncontradoException {

    }

    @Override
    public Servico executarBusca(Scanner scanner) throws ServicoNaoEncontradoException {
        System.out.println("Digite o código do Serviço a ser buscado: ");
        Servico servico = ServicoPersistencia.pesquisarPorCodigo(scanner.nextInt()).orElseThrow(ServicoNaoEncontradoException::new);
        System.out.println("O serviço encontrado é: " + servico.getTipoServico().getLabel() + " | Descrição: " + servico.getDescricao());
        return servico;
    }
}
