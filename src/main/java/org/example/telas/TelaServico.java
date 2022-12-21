package org.example.telas;

import org.example.entidades.Servico;
import org.example.exceptions.ServicoNaoEncontradoException;

import java.util.Scanner;

public interface TelaServico {
    void executar(Scanner scanner) throws ServicoNaoEncontradoException;

    Servico executarBusca(Scanner scanner) throws ServicoNaoEncontradoException;
}
