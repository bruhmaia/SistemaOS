package org.example.telas;

import org.example.entidades.Cliente;
import org.example.entidades.PrestadorDaOS;
import org.example.persistencia.Loja;

import java.util.Scanner;

public class TelaPrestadorOS {
    public static void TrocarPrestador(Scanner scanner, PrestadorDaOS prestadorDaOS) {
        System.out.println("Informe o codigo da Ordem de servico");
        String codigoOS = scanner.next();
        System.out.println("Informe o seu nome");
        String nomeprestadorAantigo = scanner.next();
        System.out.println("Informe para quem deseja trocar");
        String nomeprestadorAtual = scanner.next();
        System.out.println("Informe o Parecer");
        String Parecer = scanner.next();

    }
}