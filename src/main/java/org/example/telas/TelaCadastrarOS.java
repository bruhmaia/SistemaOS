package org.example.telas;

import org.example.entidades.Cliente;
import org.example.entidades.OS;
import org.example.entidades.Servico;
import org.example.exceptions.ServicoNaoEncontradoException;
import org.example.persistencia.Loja;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class TelaCadastrarOS {
    public static OS cadastrarOS (Scanner scanner, Loja loja) throws ServicoNaoEncontradoException {
        Cliente cliente = TelaBuscarCliente.buscar(scanner, loja);

        TelaCadastrarServico telaCadastrarServico = new TelaCadastrarServico();
        telaCadastrarServico.executar(scanner);
        TelaBuscarServico telaBuscarServico = new TelaBuscarServico();
        Servico servico = telaBuscarServico.executarBusca(scanner);

        System.out.println("Informe o código da ordem de serviço: ");
        String codigo = scanner.next();
        System.out.println("Informe o status da OS: ");
        String statusOS = scanner.next();

        OS ordemDeServico = new OS(codigo, cliente, servico, LocalDateTime.now(), statusOS);

        Loja.adicionarOS(ordemDeServico);
        System.out.println("Ordem de serviço cadastrada");
        return ordemDeServico;

    }
}
