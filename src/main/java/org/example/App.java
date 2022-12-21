package org.example;

import org.example.entidades.OS;
import org.example.entidades.Servico;
import org.example.exceptions.ServicoNaoEncontradoException;
import org.example.telas.*;
import org.example.persistencia.Loja;
import org.example.telas.TelaCadastrarOS;


import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ServicoNaoEncontradoException {
        // Exemplo de Utilização da implementação de Serviço - Misael
        /*
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            TelaServico telaCadastroServico = new TelaCadastrarServico();
            telaCadastroServico.executar(scanner);

            TelaServico telaBuscarServico = new TelaBuscarServico();
            telaBuscarServico.executar(scanner);
        } */

        System.out.println("Bem vindo ao sistema de abertura de ordem de serviço");
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("escolha a opção que você deseja");
            System.out.println(" (1) - Cadastrar nova Ordem de serviço (2) - Atualizar Ordem de Serviço (3) - Buscar Ordem de Serviço  " +
                    "\n (4) Cadastrar um novo Cliente  (5) - Listar Clientes \n " +
                    " (6) - Cadastrar Serviço  (7) - Buscar Serviço \n" +
                    "(8) - Cadastrar Prestador (9) - Trocar Prestador da OS" );
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    TelaCadastrarOS.cadastrarOS(scanner, new Loja());
                    // Cadastrar nova ordem de serviço
                    break;
                case 2:
                    TelaAtualizarOS.atualizarOS(scanner);
                    break;
                case 3:
                    TelaBuscarOS.buscarCodigoOS(scanner);
                    break;
                case 4:
                    TelaCadastroCliente.cadastro(scanner, new Loja());
                    break;
                case 5:
                    Loja.exibeClientes();
                    break;
                case 6:
                    for (int i = 0; i < 5; i++) {
                        TelaServico telaCadastroServico = new TelaCadastrarServico();
                        telaCadastroServico.executar(scanner);}
                        break;
                case 7:
                        TelaBuscarServico telaBuscarServico = new TelaBuscarServico();
                        telaBuscarServico.executar(scanner);

                case 8:
                    TelaCadastrarPrestador.cadastro(scanner, new Loja());

                case 9:

                case 0:
                            System.out.println("Até mais");
                            break;
                        default:
                            System.out.println("Opção invalida");
                    }
        } while (opcao > 0);
    }
}