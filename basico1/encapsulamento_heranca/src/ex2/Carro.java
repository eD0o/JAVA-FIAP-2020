package ex2;

import java.io.Serializable;

public class Carro extends Veiculo implements Serializable{	

	private int quantidadePortas;
	private String placa;
	private double motor = 1.0;
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	
	
	
	
}
