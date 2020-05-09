import java.awt.List;

public class Fabrica {
	
	private int qtdMateriaPrima;
	private boolean funcionarioTrabalhando;
	
	public List<Mascara> gerarMascaras(int qtd){
		
		List<Mascara> ListaMascaras = new ArrayList<>();
		
		for(int i=0;i<=qtd;i++) {
			Mascara mascara = new Mascara();
			mascara.setTipoTecido("algodão");
			mascara.setTamanhoAdulto(true);
			mascara.setTamanhoAdulto(true);
			
			listaMascaras.add(mascara);
		}
		
		return listaMascaras;
		
		
	}
	
	public int getQtdMateriaPrima() {
		return qtdMateriaPrima;
	}
	public void setQtdMateriaPrima(int qtdMateriaPrima) {
		this.qtdMateriaPrima = qtdMateriaPrima;
	}
	public boolean isFuncionarioTrabalhando() {
		return funcionarioTrabalhando;
	}
	public void setFuncionarioTrabalhando(boolean funcionarioTrabalhando) {
		this.funcionarioTrabalhando = funcionarioTrabalhando;
	}
	
	
	
}
