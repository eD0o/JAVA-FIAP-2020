package ex2;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String marca,String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public boolean validacao(int ano) {
		
		if(ano>=1900 && ano<=2020) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
