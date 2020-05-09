
public class Mascara {

	private String tipoTecido;
	private boolean tamanhoAdulto;
	
	public String exibirInstrucoes() {
		if(tipoTecido.equals("algodão")) {
			return "Use por 2 horas e seque bem após lavar.";	
		}
		
		else {
			return "Máscara deve ser descartada após o uso.";
		}
		
	}
	
	public String getTipoTecido() {
		return tipoTecido;
	}
	public void setTipoTecido(String tipoTecido) {
		this.tipoTecido = tipoTecido;
	}
	public boolean isTamanhoAdulto() {
		return tamanhoAdulto;
	}
	public void setTamanhoAdulto(boolean tamanhoAdulto) {
		this.tamanhoAdulto = tamanhoAdulto;
	}
	
	

}
