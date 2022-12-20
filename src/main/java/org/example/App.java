package org.example;

<<<<<<< HEAD
import org.example.entidades.Servico;
import org.example.exceptions.ServicoNaoEncontradoException;
import org.example.telas.TelaBuscarServico;
import org.example.telas.TelaCadastrarOS;
import org.example.telas.TelaCadastrarServico;
import org.example.telas.TelaServico;
=======
import org.example.persistencia.Loja;
import org.example.telas.TelaCadastrarOS;
import org.example.telas.TelaCadastroCliente;
>>>>>>> 7d612b8d54f04c682dcdd00babbaf327555fc84f

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
            System.out.println(" (1) - Cadastrar nova Ordem de serviço \n (2) - Buscar Ordem de Serviço \n (3) - Cadastrar um novo Cliente \n (4) - Listar Clientes \n (0) - Sair" );
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    TelaCadastrarOS.cadastrarOS(scanner, new Loja());
                    // Cadastrar nova ordem de serviço
                    break;

                case 2:
                    // Consultar ordem de serviço
                    break;
                case 3:
                    TelaCadastroCliente.cadastro(scanner,new Loja());
                    break;
                case 4:
                    Loja.exibeClientes();
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