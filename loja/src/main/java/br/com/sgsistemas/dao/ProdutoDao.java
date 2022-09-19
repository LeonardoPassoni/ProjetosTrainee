package br.com.sgsistemas.dao;

import br.com.sgsistemas.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ProdutoDao {

    private EntityManager entityManager;

    public ProdutoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Produto produto) {
        this.entityManager.persist(produto);
    }
}
