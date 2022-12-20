package org.example.telas;

import org.example.entidades.Cliente;
import org.example.entidades.OS;
import org.example.entidades.PrestadorDaOS;
import org.example.entidades.Servico;
import org.example.exceptions.ServicoNaoEncontradoException;
import org.example.persistencia.BancoDadosPrestadorOS;
import org.example.persistencia.Loja;
import org.example.persistencia.ServicoPersistencia;

import java.util.Scanner;

public class TelaPrestadorOS {
    public static void TrocarPrestador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aréa para troca de prestador da Ordem de Serviço");
    }
}