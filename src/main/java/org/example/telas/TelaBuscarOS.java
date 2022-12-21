package org.example.telas;

import org.example.entidades.OS;
import org.example.persistencia.Loja;

import java.util.Scanner;

public class TelaBuscarOS {

    public static void buscarOS(Scanner scanner, Loja loja) {
        System.out.println("Digite o nome do cliente que solicitou o serviço: ");
        String nome = scanner.next();
        for (OS ordemDeServico : loja.exibeOS()) {
            if (OS.getCliente().equals(nome)) {
                System.out.println("--- Ordem de Serviço: ---");
                System.out.printf("Código da OS: %s \n", OS.getCodigoOS());
                System.out.printf("Código do serviço: %s \n", OS.getServico());
                return ordemDeServico;
            }
        }
    }

    public static void buscarCodigoOS(Scanner scanner, Loja loja) {
        System.out.println("Digite o código da ordem de serviço: ");
        String codOS = scanner.next();
        for (OS ordemDeServico : loja.exibeOS()) {
            if (OS.getCodigoOS().equals(codOS)) {
                System.out.println("--- Ordem de Serviço: ---");
                System.out.printf("Código da OS: %s \n", OS.getCodigoOS());
                System.out.printf("Código do serviço: %s \n", OS.getServico());
                return ordemDeServico;
            }
    }

}
