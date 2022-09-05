package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Compra {

    private  Date dataCompra;
    private  Cliente cliente;
    private  ArrayList<Produto> produtos;

    private double totalCompra;


    public  Compra (){
        produtos = new ArrayList<Produto>();
    }


    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }


    public double getTotalCompra() {
        return totalCompra;
    }

    public void calculaTotalCompra(){
        for (Produto produto : this.produtos){
            this.totalCompra += produto.getValor();
        }
    }

    public void imprimeListaProdutos(){
        int i = 1;
        System.out.println("-----------------------------------");
        for (Produto produto : this.produtos) {
            System.out.println(i++ + " - " + produto);

        }
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(String codigo){
        this.produtos.removeIf(produto -> produto.getCodigo().equals(codigo));
    }


    public void imprimiCompra(){
        System.out.println(this.toString());
        imprimeListaProdutos();
        System.out.println("----------------------------------- \n Total     ---->     " + this.totalCompra);

    }

    @Override
    public String toString() {
        return
                "                * COMPRA *     " + '\n' +
                "DataCompra  " + dataCompra + '\n' +
                 cliente + '\n' //+
             //    "Produtos: \n" + produtos +
               // "\nTotalCompra: " + totalCompra
                ;
    }
}
