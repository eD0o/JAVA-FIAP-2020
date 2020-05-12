package ex1;

public class EstacaoMetereologica {
	
	private int id;
	private String nome;
	private double latitude;
	private double longitude;
	private boolean emOperacao;
	
	public String relatarStatus() {
		return "";
	}
	
	public String relatarClima() {
		return "";
	}
	
	public void economizarEnergia() {
		
	}
	
	public void controlarRemoto(boolean controleRemoto) {
		
	}
	
	public boolean reconfigurar(int parametro, String valor, boolean reiniciar) {
		return true;
	}
	
	public int reiniciar(int delay, boolean interromperProcessos) {
		return 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public boolean isEmOperacao() {
		return emOperacao;
	}

	public void setEmOperacao(boolean emOperacao) {
		this.emOperacao = emOperacao;
	}
}
