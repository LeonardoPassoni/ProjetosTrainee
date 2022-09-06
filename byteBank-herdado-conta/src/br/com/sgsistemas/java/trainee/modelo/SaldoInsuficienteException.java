package br.com.sgsistemas.java.trainee.modelo;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
