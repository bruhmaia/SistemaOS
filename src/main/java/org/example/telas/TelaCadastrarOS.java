package org.example.telas;

import org.example.entidades.Cliente;
import org.example.persistencia.Loja;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TelaCadastrarOS {
    public static void cadastrarOS (Scanner scanner, Loja loja) {
       //Cliente cliente = TelaBuscarCliente.buscar(scanner, loja);

        System.out.println("Informe o código do serviço: ");
        String servicoOS = scanner.next();
        System.out.println("Informe o código do cliente: ");
        String clienteOS = scanner.next();
        System.out.println("Informe o código do prestador de serviço: ");
        String prestadorOS = scanner.next();
        System.out.println("Informe o status da OS: ");
        String statusOS = scanner.next();

        //OS ordemDeServico = new OS(servicoOS, clienteOS, prestadorOS, statusOS);

        //TODO: precisa adicionar OS na loja

    }
}
