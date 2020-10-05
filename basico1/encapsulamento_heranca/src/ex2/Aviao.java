package ex2;

import java.io.Serializable;

public class Aviao extends Veiculo implements Serializable{
	
	private String prefixo;
	private int quantidadeTurbinas;

	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	
	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}
	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}
	
	
	
	
}
