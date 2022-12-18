package org.example.entidades;

import java.util.UUID;

public class Cliente extends Pessoa{
       private static int SEQUENCIAL_CODIGO_CLIENTE = 0;
       int codigoCliente;

       public int getCodigoCliente() {
              return codigoCliente;
       }

       public void setCodigoCliente(int codigoCliente) {
              this.codigoCliente = codigoCliente;
       }

       public Cliente(String nome, String sobrenome, String cpf, String endereco, String telefone) {
              this.setCodigoCliente(SEQUENCIAL_CODIGO_CLIENTE);
              SEQUENCIAL_CODIGO_CLIENTE++;
              this.setNome(nome);
              this.setSobrenome(sobrenome);
              this.setCPF(cpf);
              this.setEndereco(endereco);
              this.setTelefone(telefone);

       }



}
