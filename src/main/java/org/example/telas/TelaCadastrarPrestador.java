package org.example.telas;

import org.example.entidades.Prestador;

public class TelaCadastrarPrestador {
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
        System.out.println("Informe a sua especialização");
        String especializacao = scanner.next();

        Prestador prestador = new Prestador(nome, sobrenome, CPF, endereco, telefone);
        prestador.setEspecializacao = especializacao;
        loja.setPrestador(prestador);
        System.out.println("Prestador cadastrado com sucesso!");
    }
}
