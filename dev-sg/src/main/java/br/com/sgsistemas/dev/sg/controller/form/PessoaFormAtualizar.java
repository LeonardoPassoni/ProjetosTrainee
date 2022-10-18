package br.com.sgsistemas.dev.sg.controller.form;


import br.com.sgsistemas.dev.sg.model.Cargo;
import br.com.sgsistemas.dev.sg.model.Pessoa;
import br.com.sgsistemas.dev.sg.repository.PessoaRepository;
import lombok.Data;

@Data
public class PessoaForm {

    private String nome;
    private String cargo;







    public Pessoa converter(PessoaRepository pessoaRepository){
        return new Pessoa(nome,Cargo.valueOf(cargo));
    }
}

