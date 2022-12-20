package org.example.telas;

import org.example.persistencia.Loja;

import java.util.Scanner;

public class TelaAtualizarOS {

    public static void atualizarOS(Scanner scanner) {
        System.out.println("Digite (1) se deseja buscar a OS pelo nome do cliente ou (2) se deseja buscar pelo código da OS: ");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            TelaBuscarOS.buscarOS(scanner, new Loja());
        } else if (escolha == 2) {
            TelaBuscarOS.buscarCodigoOS(scanner, new Loja());
        }
    }

}
