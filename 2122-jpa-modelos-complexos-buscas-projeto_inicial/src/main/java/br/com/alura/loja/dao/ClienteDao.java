package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Cliente;

import javax.persistence.EntityManager;

public class ClienteDao {

    private EntityManager entityManager;
    public ClienteDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Cliente buscarPorId(long lid) {
        String jpql = "SELECT cleinte from Clinte cliente";
        return this.entityManager.createQuery(jpql, Cliente.class).getSingleResult();
    }
}
