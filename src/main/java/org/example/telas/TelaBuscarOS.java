package org.example.telas;

import java.util.Scanner;

public class TelaBuscarOS {

    public static void buscarOS(Scanner scanner) {
        System.out.println("Digite o nome do cliente que solicitou o serviço: ");
        String nome = scanner.next();
    }

    public static void buscarCodigoOS(Scanner scanner) {
        System.out.println("Digite o código da ordem de serviço: ");
        String codOS = scanner.next();
    }

}
