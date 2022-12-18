package org.example.telas;

import org.example.entidades.Cliente;
import org.example.persistencia.Loja;

import java.util.Scanner;

public class TelaCadastroCliente {
    public static void cadastro(Scanner scanner, Loja loja) {
        System.out.println("Informe o seu nome");
        String nome = scanner.next();
        System.out.println("Informe o seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Informe o seu CPF");
        String CPF = scanner.next();
        System.out.println("Informe o seu endereço");
        String endereco = scanner.next();
        System.out.println("Informe o seu telefone");
        String telefone = scanner.next();
        Cliente cliente = new Cliente(nome, sobrenome, CPF, endereco, telefone);
        loja.adicionar(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
}
