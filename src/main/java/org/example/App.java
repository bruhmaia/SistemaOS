package org.example;

import org.example.telas.TelaCadastrarOS;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema de abertura de ordem de serviço");
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("escolha a opção que você deseja");
            System.out.println("(1)- Cadastrar nova Ordem de serviço \n (2) - Buscar Ordem de Serviço \n (0) - Sair" );
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    TelaCadastrarOS.cadastrarOS(scanner);
                    // Cadastrar nova ordem de serviço
                    break;

                case 2:
                    // Consultar ordem de serviço
                    break;
                case 0:
                    System.out.println("Até mais");
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (opcao > 0);
    }
}