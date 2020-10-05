package ex1;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente contaC = new ContaCorrente();
		ContaPoupanca contaP = new ContaPoupanca();
		
		contaC.depositar(1300);
		contaC.sacar(500);
		
		contaP.depositar(2300);
		contaP.sacar(1500);
			
	}
}
