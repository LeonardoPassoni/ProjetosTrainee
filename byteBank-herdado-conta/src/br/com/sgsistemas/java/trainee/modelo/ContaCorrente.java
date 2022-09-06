package br.com.sgsistemas.java.trainee.modelo;

//new br.com.sgsistemas.java.trainee.modelo.ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) /*throws br.com.sgsistemas.java.trainee.modelo.SaldoInsuficienteException*/ {
		double valorASacar = valor + 0.2;
		 super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
