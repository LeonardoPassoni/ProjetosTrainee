package br.com.sgsistemas.java.trainee.modelo;

public class NaturezaReceita {


    private int codigo;
    private String descricaoProduto;
    private String dtIni;
    private String dtFim;
    private String ncm;
    private String ncmEx;
    private String ExIpi = null;
    private Double alicotaPis = 0.00;
    private Double alicotaCofin = 0.00;


//    public NaturezaReceita(String naturezaReceitaLine){
//
//    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setDtIni(String dtIni) {
        this.dtIni = dtIni;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
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
                '\n'+ "DtIni: " + dtIni +
                '\n'+ "DtFim: " + dtFim +
                '\n'+ "NCM: " + ncm +
                '\n'+ "NCMEX: " + ncmEx +
                '\n'+ "ExIpi: " + ExIpi +
                '\n'+ "AlicotaPis: " + alicotaPis +
                '\n'+ "AlicotaCofin: " + alicotaCofin
                + '\n';
    }

}
