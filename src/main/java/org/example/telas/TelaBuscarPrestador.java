package org.example.telas;

import org.example.entidades.Prestador;
import org.example.persistencia.Loja;

import java.util.Scanner;

public class TelaBuscarPrestador {
    public static Prestador buscar(Scanner scanner, Loja loja) {
        System.out.println("Digite o nome do prestador que deseja buscar: ");
        String nome = scanner.next();
        for (Prestador prestador: loja.getPrestador()) {
            if (prestador.getNome().equals(nome)) {
                System.out.println("--- Prestador: ---");
                System.out.printf("Nome: %s %s\n", prestador.getNome(), prestador.getSobrenome());
                System.out.printf("Especialização: %s\n", prestador.getEspecializacao());
                System.out.printf("Telefone: %s\n", prestador.getTelefone());
                return prestador;
            }
        }
        System.out.println("Prestador não encontrado!");
        return null;
    }
}
