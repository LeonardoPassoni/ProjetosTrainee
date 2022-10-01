package br.com.sgsistemas.spring.data.service;

import br.com.sgsistemas.spring.data.model.Cargo;
import br.com.sgsistemas.spring.data.model.Funcionario;
import br.com.sgsistemas.spring.data.model.Unidade;
import br.com.sgsistemas.spring.data.repository.CargoRepository;
import br.com.sgsistemas.spring.data.repository.FuncionarioRepository;
import br.com.sgsistemas.spring.data.repository.UnidadeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;
    private final CargoRepository cargoRepository;
    private final UnidadeRepository unidadeRepository;
    private boolean system = true;

    public FuncionarioService(FuncionarioRepository funcionarioRepository, CargoRepository cargoRepository, UnidadeRepository unidadeRepository) {
        this.funcionarioRepository = funcionarioRepository;
        this.cargoRepository = cargoRepository;
        this.unidadeRepository = unidadeRepository;
    }


    public void inicial(Scanner scanner) {

        while (system){
            System.out.println("\nQual acão quer executar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Salvar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Visualizar");
            System.out.println("4 - Deletar");
            System.out.println("5 - DeletarTodos");

            int action = scanner.nextInt();

            switch (action){
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

    private void deletarTodos() {
        funcionarioRepository.deleteAll();
        System.out.println("Funcionarios removidos");
    }

    private void deletarPorId(Scanner scanner) {
        System.out.println("Digite o id a ser deletado: ");
        int id = scanner.nextInt();
        funcionarioRepository.deleteById(id);
        System.out.println("Id " + id + " Removido ");
    }

    private void visualizar() {
       Iterable<Funcionario> funcionarios = funcionarioRepository.findAll();
       funcionarios.forEach(funcionario -> System.out.println(funcionario));

    }

    private void alterar(Scanner scanner) {
        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o id:");
        funcionario.setId(scanner.nextInt());

        System.out.println("Digite o novo nome:");
        funcionario.setNome(scanner.next());

        funcionarioRepository.save(funcionario);

    }

    private void salvar(Scanner scanner) {
        Funcionario funcionario = new Funcionario();
        System.out.println("Nome:");
        funcionario.setNome(scanner.next());

        System.out.println("CPF:");
        funcionario.setCpf(scanner.next());

        System.out.println("Salario");
        funcionario.setSalario(scanner.nextBigDecimal());

        System.out.println("Data Contratação");
        funcionario.setDataContratacao(LocalDate.parse(scanner.next()));

        System.out.println("Digite o id do seu cargo:");
        Optional<Cargo> cargo = cargoRepository.findById(scanner.nextInt());
        funcionario.setCargo(cargo.get());

        List<Unidade> unidades = unidade(scanner);
        funcionario.setUnidades(unidades);

        funcionarioRepository.save(funcionario);



    }

    private List<Unidade> unidade (Scanner scanner){
        boolean isTrue = true;
        List<Unidade> unidades = new ArrayList<>();

        while (isTrue){
            System.out.println("Digite o id da unidade(Para sair 0)");
            Integer unidadeid = scanner.nextInt();

            if(unidadeid != 0 ){
                Optional<Unidade> unidade = unidadeRepository.findById(unidadeid);
                unidades.add(unidade.get());

            }else {
                isTrue = false;
            }
        }
        return unidades;
    }
}
