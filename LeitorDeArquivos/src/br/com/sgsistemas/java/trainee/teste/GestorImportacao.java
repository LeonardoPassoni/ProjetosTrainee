package br.com.sgsistemas.java.trainee.teste;

import br.com.sgsistemas.java.trainee.modelo.NaturezaReceita;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GestorImportacao {

    private int totalVaresInexistentes = 0 ;


    public ArrayList<NaturezaReceita> getNaturezaReceitas() {
        return naturezaReceitas;
    }

    public void setNaturezaReceitas(ArrayList<NaturezaReceita> naturezaReceitas) {
        this.naturezaReceitas = naturezaReceitas;
    }

    private ArrayList<NaturezaReceita> naturezaReceitas = new ArrayList<NaturezaReceita>();

    public void importarArquivo(String nomeArquivo) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(nomeArquivo), "windows-1252");
        scanner.nextLine();
        NaturezaReceita naturezaReceita = null;
        
        while (scanner.hasNext()) {
            try {
                String conteudoLinha = scanner.nextLine();


//                Scanner scannerConteudoLinha = new Scanner(conteudoLinha);
//                scannerConteudoLinha.useDelimiter("\\|");


                naturezaReceita = new NaturezaReceita(conteudoLinha);

//                naturezaReceita.setCodigo((scannerConteudoLinha.next()));
//                naturezaReceita.setDescricaoProduto(scannerConteudoLinha.next());
//                naturezaReceita.setDtIni(scannerConteudoLinha.next());
//                naturezaReceita.setDtFim(scannerConteudoLinha.next());
//                naturezaReceita.setNcm(scannerConteudoLinha.next());
//                naturezaReceita.setNcmEx(scannerConteudoLinha.next());
//                naturezaReceita.setExIpi(scannerConteudoLinha.next());
//                naturezaReceita.setAlicotaPis(scannerConteudoLinha.nextDouble());
//                naturezaReceita.setAlicotaCofin(scannerConteudoLinha.nextDouble());


            } catch (NoSuchElementException e) {
                this.totalVaresInexistentes++;
            }finally {
                naturezaReceitas.add(naturezaReceita);
            }
        }
        scanner.close();
    }


    public int getTotalVaresInexistentes() {
        return totalVaresInexistentes;
    }

    public void imprimiLista(){
        this.naturezaReceitas.forEach(naturezaReceita -> System.out.println(naturezaReceita.toString()));
    }
}
