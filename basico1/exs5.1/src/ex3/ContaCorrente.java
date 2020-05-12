package ex3;

public class ContaCorrente {
	private String titular = "Eduardo";
	private int agenciaContaCorrente;
	private String numeroContaCorrente;
	private double saldo;
	
	double saldoAtual;	
	
	public double depositar(double valor) {
		saldoAtual = saldo + valor;
		System.out.println(saldoAtual);
		return saldoAtual;
	}
	
	public double sacar(double valor) {
		saldoAtual = saldo - valor;
		System.out.println(saldoAtual);
		return saldoAtual;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void exibirSaldo() {
		System.out.println("Olá " + titular + ", o seu saldo é de: R$" + saldoAtual);
	}	
}
