package br.com.sgsistemas.java.trainee.teste;
import br.com.sgsistemas.java.trainee.modelo.ContaCorrente;
import br.com.sgsistemas.java.trainee.modelo.ContaPoupanca;


/**
 * @author Leonardo
 */

public class TesteContas {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111,222);
		cc.deposita(100.00);

		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.00);


		try {
			cc.saca(900.0);
		}catch (Exception exception){
			System.out.println(exception.getMessage());
		}

		//cc.transfere(10.00,cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}
