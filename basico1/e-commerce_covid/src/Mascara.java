
public class Mascara {

	private String tipoTecido;
	private boolean tamanhoAdulto;
	
	public String exibirInstrucoes() {
		if(tipoTecido.equals("algod�o")) {
			return "Use por 2 horas e seque bem ap�s lavar.";	
		}
		
		else {
			return "M�scara deve ser descartada ap�s o uso.";
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
