package br.com.sgsistemas.dev.sg.modelo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
public class Linguagem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @ManyToMany
    private List<Equipe> equipes;

}
