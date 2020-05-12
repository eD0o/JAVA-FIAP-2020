
public class LojaVitual {

	private int estoque;
	
	public boolean venderMascaras(int qtd){
		if(estoque>=qtd) {
			System.out.println("Vendendo" + qtd + "máscara(s).");
		}
		
		else {
			System.out.println("Quantidade insuficiente.");
		}
		return false;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
}
