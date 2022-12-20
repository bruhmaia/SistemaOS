package org.example.telas;

import org.example.entidades.OS;
import org.example.persistencia.Loja;

import java.util.Scanner;

public class TelaBuscarOS {

    public static void buscarOS(Scanner scanner) {
        System.out.println("Digite o nome do cliente que solicitou o serviço: ");
        String nome = scanner.next();
    }

    public static OS buscarCodigoOS(Scanner scanner) {
        System.out.println("Digite o código da ordem de serviço: ");
        Loja loja = new Loja();
        return Loja.procurarPorCodigo(scanner.next()).orElseThrow(()-> new RuntimeException("Ordem de Serviço não encontrada"));
    }

}
