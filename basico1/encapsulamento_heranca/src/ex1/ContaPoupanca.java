package ex1;

import java.io.Serializable;

public class ContaPoupanca extends ContaBancaria implements Serializable{
	
	private double taxaJuros;
	ContaBancaria conta = new ContaBancaria();
	
	
	public ContaPoupanca() {
		
	}
	
	
	public void atualizarSaldo() {
		conta.setSaldo( conta.getSaldo() + ( conta.getSaldo()* (getTaxaJuros()/100)));
	}


	public double getTaxaJuros() {
		return taxaJuros;
	}


	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	
}
