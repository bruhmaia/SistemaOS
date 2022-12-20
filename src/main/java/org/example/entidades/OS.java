package org.example.entidades;

import java.time.LocalDateTime;
import java.util.UUID;

    public class OS {
        String CodigoOS;
        Prestador prestadorOS;
        Cliente clienteOS;
        Servico servicoOS;
        LocalDateTime DataSolicitacao;
        String DataConclusao;
        String statusOS;

        private OS(String CodigoOS, Prestador prestadorOS, Cliente clienteOS, Servico servicoOS, LocalDateTime DataSolicitacao, String statusOS) {
            this.CodigoOS = UUID.randomUUID().toString();
            DataSolicitacao = LocalDateTime.now();
            this.clienteOS = clienteOS;
            this.prestadorOS = prestadorOS;
            this.servicoOS = servicoOS;
            this.statusOS = statusOS;
        }

        public String getStatusOS(){
            return statusOS;
        }

        public void setStatusOS(String statusOS) {
            this.statusOS = statusOS;
        }


        private Cliente getClienteOS(){
            return clienteOS;
            //return new Cliente(clienteOS.getCodigoCliente(), clienteOS.getNome()); - deu erro dizendo que ta sem construtor
        }

        public void setClienteOS(Cliente clienteOS) {
            this.clienteOS = clienteOS;
        }

        private Prestador getPrestadorOS() {
            return prestadorOS;
            //return new Prestador(prestadorOS.getNome(), prestadorOS.getNumeroInscricao())
        }

        public void setPrestadorOS(Prestador prestadorOS) {
            this.prestadorOS = prestadorOS;
        }


        private Servico getServicoOS(){
            return servicoOS;
        }

        public String getCodigoOS(){
            return CodigoOS;
        }

        private void setCodigoOS (String CodigoOS) {
            this.CodigoOS = CodigoOS;
        }

        public LocalDateTime DataSolicitacao(){
            return DataSolicitacao;
        }

        public void setDataSolicitacao () {
            this.DataSolicitacao = DataSolicitacao;
        }
}
