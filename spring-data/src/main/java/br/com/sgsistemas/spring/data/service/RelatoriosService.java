package br.com.sgsistemas.spring.data.service;

import br.com.sgsistemas.spring.data.model.Funcionario;
import br.com.sgsistemas.spring.data.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class RelatoriosService {

    private final FuncionarioRepository funcionarioRepository;
    private boolean system;

    public RelatoriosService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public void inicial(Scanner scanner) {
        system = true;
        while (system){

            System.out.println("\nQual acão quer executar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Buscar Funcionario por Nome");


            int action = scanner.nextInt();

            switch (action){
                case 1:
                    buscarFuncionarioNome(scanner);
                    break;

                default:
                    system = false;
            }

        }
    }

    private void buscarFuncionarioNome(Scanner scanner) {
        System.out.println("Qual voce deseja pesquisar");
        List<Funcionario> funcionarios = funcionarioRepository.findByNomeLike(scanner.next());
        funcionarios.forEach(funcionario -> System.out.println(funcionario));
    }

}
