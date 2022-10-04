package br.com.sgsistemas.dev.sg.modelo;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @Enumerated(EnumType.ORDINAL)
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

}
