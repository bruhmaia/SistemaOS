package org.example.persistencia;

import org.example.entidades.OS;
import org.example.entidades.PrestadorDaOS;

import java.util.ArrayList;

public class BancoDadosPrestadorOS {
    private static ArrayList<PrestadorDaOS> prestadoresOS = new ArrayList<>();

    public static void adicionarPrestadoresOS(PrestadorDaOS prestadorDaOS) {
        prestadoresOS.add(prestadorDaOS);
    }

    public static void exibePrestadoresOS() {
        for (PrestadorDaOS op : prestadoresOS) {
            System.out.println("Nome " + op.getPrestadorAtual().getNome());
            System.out.println("Codigo " + op.getPrestadorAtual().getNumeroInscricao());
        }
    }
    public void atualizarPrestador(OS os, PrestadorDaOS prestadorAtual, String Descricao){
        for(PrestadorDaOS item : prestadoresOS){
            if(item.getOrdemdeservico().getCodigoOS().equals(os.getCodigoOS())){
               int indice = prestadoresOS.indexOf(prestadorAtual.getPrestadorAtual().getNome());
               prestadoresOS.get(indice).setPrestadorAtual();
            }
            }
        }
}
