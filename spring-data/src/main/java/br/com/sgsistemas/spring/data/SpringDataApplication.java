package br.com.sgsistemas.spring.data;

import br.com.sgsistemas.spring.data.service.CargoService;
import br.com.sgsistemas.spring.data.service.FuncionarioService;
import br.com.sgsistemas.spring.data.service.UnidadeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    private final CargoService cargoService;
    private final FuncionarioService funcionarioService;

    private final UnidadeService unidadeService;
    private boolean system = true;

    public SpringDataApplication(CargoService cargoService, FuncionarioService funcionarioService, UnidadeService unidadeService) {
        this.cargoService = cargoService;

        this.funcionarioService = funcionarioService;
        this.unidadeService = unidadeService;
    }


    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        while (system) {
            System.out.println("Qual acão voce quer executar");
            System.out.println("0 - Sair");
            System.out.println("1 - Cargo");
            System.out.println("2 - Funcionario");
            System.out.println("3 - Unidade");

            int action = scanner.nextInt();



			switch (action){
				case 1:
					this.cargoService.inicial(scanner);
					break;

                case 2:
                    this.funcionarioService.inicial(scanner);
                    break;


                case 3:
                    this.unidadeService.inicial(scanner);
                    break;

				default:
					system = false;
			}



        }

//		Cargo cargo = new Cargo();
//		cargo.setDescricao("DESEVOLVEDOR DE SOFTWARE");
//		this.cargoService.save(cargo);

    }
}
