package org.example.persistencia;

import org.example.entidades.Cliente;
import org.example.entidades.OS;
import org.example.entidades.Prestador;

import java.util.ArrayList;

public class OSPersistencia {
    private static ArrayList<OS> ordemdeservico = new ArrayList<>();

    public static void adicionarOS(OS os) {
        ordemdeservico.add(os);
    }

    public static void exibeOS() {
        for (OS o : ordemdeservico) {
            System.out.println("Status " + o.getStatusOS());
            System.out.println("Codigo " + o.getCodigoOS());
        }
    }
    //public void atualizarPrestador(OS os, Prestador prestadorOS, String status){
    // for(OS item : ordemdeservico){
    //      if(item.getCodigoOS().equals(os.getCodigoOS())){

    //          }
//          item.setStatusOS(status);
//              item.setPrestadorOS(prestadorOS);
}