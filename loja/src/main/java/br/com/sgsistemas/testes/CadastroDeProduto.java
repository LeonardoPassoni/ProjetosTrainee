package br.com.sgsistemas.testes;

import br.com.sgsistemas.dao.ProdutoDao;
import br.com.sgsistemas.modelo.Categoria;
import br.com.sgsistemas.modelo.Produto;
import br.com.sgsistemas.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {
//        produto.setNome("Xiaomi RedAlgumacoisa");
//        produto.setDescricao("5ABCD");
//        produto.setPreco(new BigDecimal("700.00"));



        EntityManager entityManager = JPAUtil.getEntityManager();
        Categoria categoria = new Categoria();
        Produto produto = new Produto("Xiaomi RedAlgumacoisa","5ABCD",new BigDecimal("700.00"),);

        ProdutoDao produtoDao = new ProdutoDao(entityManager);

        entityManager.getTransaction().begin();
        produtoDao.cadastrar(produto);
        entityManager.getTransaction().commit();

    }
}
