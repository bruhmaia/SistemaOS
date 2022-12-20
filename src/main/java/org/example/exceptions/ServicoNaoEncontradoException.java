package org.example.exceptions;

public class ServicoNaoEncontradoException extends  Exception{
    public ServicoNaoEncontradoException(){
        super("Serviço não encontrado!");
    }
}
