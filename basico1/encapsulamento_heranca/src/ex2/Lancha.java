package ex2;

import java.io.Serializable;

public class Lancha extends Veiculo implements Serializable{
	
	private int quantidadeMotores;
	
	
	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}
	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
}
