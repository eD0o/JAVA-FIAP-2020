package ex1;

public class CaixaEletronico {
	
	private Conta conta;
	
	public float sacar(float valor) {
		
		float saldo = conta.getSaldo();
		System.out.println("Operação de saque no valor de: " + valor);
		
		return saldo;
	}
	
	public float depositar(float valor) {
				
		float saldo = conta.getSaldo();
		
		return saldo;
	}
	
	public void imprimirDados() {
		
	}
}
