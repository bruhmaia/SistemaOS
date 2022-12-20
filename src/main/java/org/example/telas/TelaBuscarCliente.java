package org.example.telas;

import org.example.entidades.Cliente;
import org.example.persistencia.Loja;

import java.util.Scanner;

public class TelaBuscarCliente {
    public static Cliente buscar(Scanner scanner, Loja loja){
        System.out.println("Digite o nome do cliente que deseja buscar: ");
        String nome = scanner.next();
        for (Cliente cliente: loja.getClientes()) {
            if (cliente.getNome().equals(nome)) {
                System.out.println("--- Cliente: ---");
                System.out.printf("Nome: %s %s", cliente.getNome(), cliente.getSobrenome());
                System.out.printf("Endereço: %s", cliente.getEndereco());
                System.out.printf("Telefone: %s", cliente.getTelefone());
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado!");
        return null;
    }
}
