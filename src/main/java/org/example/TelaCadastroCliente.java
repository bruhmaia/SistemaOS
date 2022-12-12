package org.example;

import java.util.Scanner;

public class TelaCadastroCliente {
    public Cliente DadosCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        String nome = scanner.next();
        System.out.println("Informe o seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Informe o seu CPF");
        String CPF = scanner.next();
        System.out.println("Informe o seu telefone");
        String telefone = scanner.next();

        return new Cliente();
    }
}
