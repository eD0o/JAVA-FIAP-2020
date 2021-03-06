package banco_fiap;

public class CaixaEletronico {
	
	private Conta contaAtiva;
	float saldoRestante;

	public float sacar(float valor) {
		
		if(contaAtiva.getSaldo()<valor) {
			System.out.println("Saldo insuficiente.");
		}
		
		else {
			saldoRestante = contaAtiva.getSaldo() - valor;
			//contaAtiva.setSaldo(contaAtiva.getSaldo() - valor);
			contaAtiva.setSaldo(saldoRestante);
			System.out.println("\nSaldo: " + contaAtiva.getSaldo());
		}
		
		return contaAtiva.getSaldo();
	}
	
	public float depositar(float valor) {
		
		if(valor<=0) {
			System.out.println("Insira um valor maior que 0");
		}
		
		else {
			saldoRestante = contaAtiva.getSaldo() + valor;
			contaAtiva.setSaldo(saldoRestante);
			System.out.println("\nSaldo: " + contaAtiva.getSaldo());
		}
		
		return contaAtiva.getSaldo();
	
	}
	
	public void imprimirDadosConta() {
		System.out.println(
			"\n-----------------------------------------" +
			"\nBANCO FIAP" +
			"\nNome: " + contaAtiva.getTitular().getNome() + 
			"\nConta: " + contaAtiva.getNumeroConta()+
			"\nSaldo: R$" + contaAtiva.getSaldo()+
			"\n-----------------------------------------"
			);
	}

	public Conta getContaAtiva() {
		return contaAtiva;
	}

	public void setContaAtiva(Conta contaAtiva) {
		this.contaAtiva = contaAtiva;
	}
	
	public float getSaldoRestante() {
		return saldoRestante;
	}

	public void setSaldoRestante(float saldoRestante) {
		this.saldoRestante = saldoRestante;
	}
}
