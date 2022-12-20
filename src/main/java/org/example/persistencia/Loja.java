package org.example.persistencia;

import org.example.entidades.Cliente;
import org.example.entidades.OS;
import org.example.entidades.Prestador;

import java.util.*;

public class Loja {

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public static void exibeClientes() {
        // Percorre o ArrayList de objetos Cliente
        for (Cliente c : clientes) {
            // Exibe os valores dos atributos de cada objeto Cliente
            System.out.println("Código Cliente: " + c.getCodigoCliente());
            System.out.println("Nome: " + c.getNome());
            System.out.println("Sobrenome: " + c.getSobrenome());
            System.out.println("CPF: " + c.getCPF());
            System.out.println("Endereço: " + c.getEndereco());
            System.out.println("Telefone: " + c.getTelefone());
            System.out.println("------");
        }
    }

    private static ArrayList<OS> ordemdeservico = new ArrayList<>();

    public static void adicionarOS(OS os) {ordemdeservico.add(os);
    }

    public static void exibeOS() {
        for (OS os : ordemdeservico) {
            System.out.println("Status " + os.getStatusOS());
            System.out.println("Codigo " + os.getCodigoOS());
            System.out.println("Cliente" + os.getCliente().getNome());
            System.out.println("Prestadores" + os.getPrestadores());
        }
    }

    public static Optional<OS> procurarPorCodigo(String codOS){
        if(Objects.isNull(ordemdeservico)){
            throw new RuntimeException("Não há ordem de serviço cadastradas");
        }
        for (OS os : ordemdeservico) {
            if(os.getCodigoOS().equals(codOS)){
                return Optional.of(os);
            }
        }
        return Optional.empty();
    }

    public static void editarPrestador(OS os, Scanner scanner) {
            System.out.println("Digite o Codigo da OS");
            String CodigodaOS = scanner.next();
            for (OS c : ordemdeservico) {
                if (CodigodaOS.equals(os.getCodigoOS())) {
                    System.out.println("Digite o nome do atual prestador");
                    String atualPrestador = scanner.next();
                    System.out.println("Digite o nome do novo prestador");
                    String novoPrestador = scanner.next();
                    ordemdeservico.stream().filter(os1-> c.getPrestadores().equals(atualPrestador)).findFirst().ifPresent(o->o.setPrestadores(novoPrestador));
                    }
                }
            }
        }




