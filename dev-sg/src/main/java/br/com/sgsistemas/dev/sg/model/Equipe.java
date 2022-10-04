package br.com.sgsistemas.dev.sg.modelo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Equipe {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @OneToMany(mappedBy = "equipe")
    private List<Pessoa> pessoas;

    @ManyToMany(mappedBy = "equipes")
    private List<Linguagem> linguagens;

}
