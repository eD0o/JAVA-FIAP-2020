package ex1;

import java.time.LocalDate;

public class Conta {
	private Aluno titular;
	private float saldo;
	private String numeroConta;
	
	public Aluno getTitular() {
		return titular;
	}
	public void setTitular(Aluno titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
}
