package ex1;

public class DadosMetereologicos {
	private double temperaturaAr;
	private double temperaturaChao;
	private double velocidadeVento;
	private DirecaoVento direcaoVento;
	private double pressao;
	private int precipitacaoChuva;
	
	public void coletar() {
		
	}
	
	public String resumir(int formato, String cabecalho, String rodape) {
		return "";
	}

	public double getTemperaturaAr() {
		return temperaturaAr;
	}

	public void setTemperaturaAr(double temperaturaAr) {
		this.temperaturaAr = temperaturaAr;
	}

	public double getTemperaturaChao() {
		return temperaturaChao;
	}

	public void setTemperaturaChao(double temperaturaChao) {
		this.temperaturaChao = temperaturaChao;
	}

	public double getVelocidadeVento() {
		return velocidadeVento;
	}

	public void setVelocidadeVento(double velocidadeVento) {
		this.velocidadeVento = velocidadeVento;
	}

	public DirecaoVento getDirecaoVento() {
		return direcaoVento;
	}

	public void setDirecaoVento(DirecaoVento direcaoVento) {
		this.direcaoVento = direcaoVento;
	}

	public double getPressao() {
		return pressao;
	}

	public void setPressao(double pressao) {
		this.pressao = pressao;
	}

	public int getPrecipitacaoChuva() {
		return precipitacaoChuva;
	}

	public void setPrecipitacaoChuva(int precipitacaoChuva) {
		this.precipitacaoChuva = precipitacaoChuva;
	}
}
