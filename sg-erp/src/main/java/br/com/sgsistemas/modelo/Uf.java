package br.com.sgsistemas.modelo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uf")
public class Uf {

    @Id
    private String sigla;
    private String descricao;


}
