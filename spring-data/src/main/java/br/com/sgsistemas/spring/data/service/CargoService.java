package br.com.sgsistemas.spring.data.service;

import br.com.sgsistemas.spring.data.model.Cargo;
import br.com.sgsistemas.spring.data.repository.CargoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



import java.util.Scanner;

@Service
public class CargoService {

    private final CargoRepository cargoRepository;
    private boolean system = true;

    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
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
                    this.visualizar(scanner);
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

    private void deletarTodos() {
        cargoRepository.deleteAll();
        System.out.println("Todos os registros foram deletados");
    }

    private void deletarPorId(Scanner scanner) {
        System.out.println("Digite o id do cargo a ser Deletado: ");
        int id = scanner.nextInt();
        cargoRepository.deleteById(id);

        System.out.println("Id " + id + " removido");


    }

    private void visualizar(Scanner scanner) {
        System.out.println("Qual Pagina voce deseja Visualizar");
        int page = scanner.nextInt();

        Pageable pageable = PageRequest.of(page,50, Sort.by(Sort.Direction.ASC,"id"));
        Page<Cargo> cargos =  cargoRepository.findAll(pageable);

        System.out.println("Cargos: ");

        cargos.forEach(cargo -> System.out.println(cargo));

        System.out.println("Pagina Atual: " + cargos.getNumber() + " of " + cargos.getTotalPages());
        System.out.println("Total Elementos: " + cargos.getTotalElements());
//        cargos.forEach(System.out::println);

    }

    private void salvar(Scanner scanner) {
        System.out.println("Descricao do Cargo");
        String descricao = scanner.next();


     //   for(int i = 0; i < 1000 ; i ++) {
            Cargo cargo = new Cargo();
      //      String descricao1 = descricao + i;
            cargo.setDescricao(descricao);
            this.cargoRepository.save(cargo);
      //  }
        System.out.println("Salvo");
    }

    private void alterar(Scanner scanner) {
        System.out.println("Digite o id do Cargo a ser Alterado:");
        int id = scanner.nextInt();

        System.out.println("Digite a nova descricao");
        String descricao = scanner.next();

        Cargo cargo = new Cargo();
        cargo.setId(id);
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);

        System.out.println("Alterado");


    }
}
