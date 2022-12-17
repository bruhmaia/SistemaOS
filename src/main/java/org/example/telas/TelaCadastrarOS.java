package org.example.telas;

import org.example.entidades.Cliente;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TelaCadastrarOS {
    public static void cadastrarOS (Scanner scanner) {
        Cliente cliente = TelaBuscarCliente.buscar(scanner);

        System.out.println("Informe a data de abertura da solicitação (dd/MM/yyyy): ");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //Date dataSolicitacao = formato.parse(scanner.next());
        System.out.println("Informe o código do serviço: ");
        String codServico = scanner.next();
        System.out.println("Informe o código do cliente: ");
        String codCliente = scanner.next();
        System.out.println("Informe o código do prestador de serviço: ");
        String codPrestador = scanner.next();

        //OrdemDeServico ordemDeServico = new OrdemDeServico(codServico, codCliente, codPrestador, dataSolicitacao);

    }
}
