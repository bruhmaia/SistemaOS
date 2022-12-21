package org.example.entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

    public class OS {
        ArrayList<PrestadorDaOS> prestadores;
        static String CodigoOS;
        Cliente cliente;
        Servico servico;
        LocalDateTime DataSolicitacao;
        String DataConclusao;
        String statusOS;

        public OS(String CodigoOS, Cliente cliente, Servico servico, LocalDateTime DataSolicitacao, String statusOS) {
            this.CodigoOS = UUID.randomUUID().toString();
            DataSolicitacao = LocalDateTime.now();
            this.cliente = cliente;
            this.servico = servico;
            this.statusOS = statusOS;
        }

        public OS(Optional<PrestadorDaOS> first) {
        }

        public String getStatusOS(){
            return statusOS;
        }

        public void setServico(Servico servico) {
            this.servico = servico;
        }

        public void setStatusOS(String statusOS) {
            this.statusOS = statusOS;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public String getCodigoOS(){
            return CodigoOS;
        }

        private void setCodigoOS (String CodigoOS) {
            this.CodigoOS = CodigoOS;
        }

        public ArrayList<PrestadorDaOS> getPrestadores() {
            return prestadores;
        }

        public void setPrestadores(ArrayList<PrestadorDaOS> prestadores) {
            this.prestadores = prestadores;
        }

        public LocalDateTime DataSolicitacao(){
            return DataSolicitacao;
        }

        public void setDataSolicitacao () {
            this.DataSolicitacao = DataSolicitacao;
        }

        public void setPrestadores(String novoPrestador) {
        }
    }
