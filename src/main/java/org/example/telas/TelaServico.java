package org.example.telas;

import org.example.exceptions.ServicoNaoEncontradoException;

import java.util.Scanner;

public interface TelaServico {
    void executar(Scanner scanner) throws ServicoNaoEncontradoException;
}
