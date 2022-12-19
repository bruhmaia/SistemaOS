package org.example.persistencia;

import org.example.entidades.Servico;

import java.util.ArrayList;
import java.util.Optional;

public class ServicoPersistencia {
    private static ArrayList<Servico> servicos = new ArrayList<Servico>();

    public static void adicionarServico(Servico servico){
        servicos.add(servico);
    }

    public static Optional<Servico> pesquisarPorCodigo(int codigo){
        return servicos.stream().filter(servico -> servico.getCodigoServico() == codigo).findFirst();
    }
}
