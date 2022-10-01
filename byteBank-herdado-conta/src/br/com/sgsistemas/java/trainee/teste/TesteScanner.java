package br.com.sgsistemas.java.trainee.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNext()){
         String linha = scanner.nextLine();
         Scanner scannerLinha = new Scanner(linha);

         scannerLinha.useDelimiter(",");
         String tipoConta = scannerLinha.next();
         int agencia = scannerLinha.nextInt();
         int numero = scannerLinha.nextInt();
         String titular = scannerLinha.next();
         double saldo = scannerLinha.nextDouble();

        }



    }
}
