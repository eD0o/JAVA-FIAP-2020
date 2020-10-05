package ex1;

import java.io.Serializable;

public class ContaBancaria implements Serializable{
	
	private double saldo;
	private Titular titular;
	private int agencia;
	private String numeroConta;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void sacar(double valor) {
		setSaldo(getSaldo()-valor);
		System.out.println(getSaldo());
	}
	
	public void depositar(double valor) {
		setSaldo(getSaldo()+valor);
		System.out.println(getSaldo());
	}
	
}
