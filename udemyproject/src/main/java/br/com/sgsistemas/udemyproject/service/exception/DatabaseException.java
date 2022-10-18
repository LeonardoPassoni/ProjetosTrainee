package br.com.sgsistemas.udemyproject.service.exception;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String message) {
        super(message);
    }
}
