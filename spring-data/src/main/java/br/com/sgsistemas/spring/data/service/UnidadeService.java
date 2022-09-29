package br.com.sgsistemas.spring.data.service;

import br.com.sgsistemas.spring.data.model.Unidade;
import br.com.sgsistemas.spring.data.repository.UnidadeRepository;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UnidadeService {

    private final UnidadeRepository unidadeRepository;
    private boolean system = true;

    public UnidadeService(UnidadeRepository unidadeRepository) {
        this.unidadeRepository = unidadeRepository;
    }



    public void inicial(Scanner scanner) {
        system = true;

        while (system) {

            System.out.println("\nQual acão quer executar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Salvar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Visualizar");
            System.out.println("4 - Deletar");
            System.out.println("5 - DeletarTodos");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    this.salvar(scanner);
                    break;

                case 2:
                    this.alterar(scanner);
                    break;

                case 3:
                    this.visualizar();
                    break;

                case 4:
                    this.deletarPorId(scanner);
                    break;

                case 5 :
                    this.deletarTodos();
                    break;
                default:
                    system = false;
            }


        }
    }


    private void salvar(Scanner scanner) {
        Unidade unidade = new Unidade();
        System.out.println("Digite a descricao: ");
        unidade.setDescricao(scanner.next());

        System.out.println("Digite o endereco: ");
        unidade.setEndereco(scanner.next());

        unidadeRepository.save(unidade);

        System.out.println("Salvo");
    }

    private void alterar(Scanner scanner) {
        Unidade unidade = new Unidade();
        System.out.println("Digite o id da unidade a ser alterada: ");
        unidade.setId(scanner.nextInt());

        System.out.println("Digite a nova descricao:");
        unidade.setDescricao(scanner.next());

        System.out.println("Digite o novo endereco");
        unidade.setEndereco(scanner.next());

        unidadeRepository.save(unidade);

        System.out.println("Alterado");
    }

    private void visualizar() {
       Iterable<Unidade> unidades = unidadeRepository.findAll();
       unidades.forEach(unidade -> System.out.println(unidade));
    }

    private void deletarPorId(Scanner scanner) {
        System.out.println("Digite o id a ser removido");
        int id = scanner.nextInt();
        unidadeRepository.deleteById(id);

        System.out.println("Removido");
    }

    private void deletarTodos() {

        unidadeRepository.deleteAll();

        System.out.println("Todas unidaddes removidas");
    }
}
