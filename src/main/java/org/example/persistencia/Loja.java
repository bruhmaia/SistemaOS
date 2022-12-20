package org.example.persistencia;

import org.example.entidades.Cliente;
import org.example.entidades.OS;
import org.example.entidades.Prestador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public static void adicionarOS(OS os) {
        ordemdeservico.add(os);
    }

    public static void exibeOS() {
        for (OS os : ordemdeservico) {
            System.out.println("Status " + os.getStatusOS());
            System.out.println("Codigo " + os.getCodigoOS());
            System.out.println("Cliente" + os.getCliente().getNome());
            System.out.println("Prestadores" + os.getPrestadores());
        }
    }

    public void editarPrestador(OS os) {
        if (os == null) {
            boolean encontrou = false;
        }
        for (OS os : ordemdeservico) {
            if (os.getCodigoOS() == ordemdeservico.get())

                encontrou = true;
                break;
            }
        }

        }


