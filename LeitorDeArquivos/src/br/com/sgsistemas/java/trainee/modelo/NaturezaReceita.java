package br.com.sgsistemas.java.trainee.modelo;

import java.text.NumberFormat;

public class NaturezaReceita {


    private String codigo;
    private String descricaoProduto;
    private String dataInicio;
    private String dataFim;
    private String ncm;
    private String ncmEx;
    private String ExIpi;
    private Double alicotaPis = 0.00;
    private Double alicotaCofin = 0.00;


    public NaturezaReceita(String naturezaReceitaLinha){
        String[] linha = naturezaReceitaLinha.split("\\|",10);

        this.codigo = linha[0];
        this.descricaoProduto = linha[1];
        this.dataInicio = linha[2];
        this.dataFim = linha[3];
        this.ncm = linha[4];
        this.ncmEx = linha[5];
        this.ExIpi = linha[6];
        if(linha.length > 7 ) {
            this.alicotaPis = Double.parseDouble(linha[7].replace(",", "."));
            this.alicotaCofin = Double.parseDouble(linha[8].replace(",", "."));
        }
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }


    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public void setNcmEx(String ncmEx) {
        this.ncmEx = ncmEx;
    }

    public void setExIpi(String exIpi) {
        ExIpi = exIpi;
    }

    public void setAlicotaPis(Double alicotaPis) {
        this.alicotaPis = alicotaPis;
    }

    public void setAlicotaCofin(Double alicotaCofin) {
        this.alicotaCofin = alicotaCofin;
    }

    @Override
    public String toString() {
        return  '\n'+"NaturezaReceita:" +
                '\n'+ "Codigo: " + codigo +
                '\n'+ "Descricao Produto: " + descricaoProduto +
                '\n'+ "DtIni: " + dataFim +
                '\n'+ "DtFim: " + dataInicio +
                '\n'+ "NCM: " + ncm +
                '\n'+ "NCMEX: " + ncmEx +
                '\n'+ "ExIpi: " + ExIpi +
                '\n'+ "AlicotaPis: " + alicotaPis +
                '\n'+ "AlicotaCofin: " + alicotaCofin
                + '\n';
    }

}
