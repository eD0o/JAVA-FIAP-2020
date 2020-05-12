package ex3;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente contacorrente = new ContaCorrente();
		
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual valor você quer depositar?"));
		
		 contacorrente.depositar(valor);
		 contacorrente.exibirSaldo();
		
		 valor = Float.parseFloat(JOptionPane.showInputDialog("Qual valor você quer depositar?"));
		 
		 contacorrente.sacar(valor);
		 contacorrente.exibirSaldo();
	}
}
