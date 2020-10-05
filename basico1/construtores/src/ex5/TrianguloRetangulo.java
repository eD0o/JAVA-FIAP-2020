package ex5;

public class TrianguloRetangulo {
	private float cateto1;
	private float cateto2;
	
	public TrianguloRetangulo() {
		
	}
	
	public TrianguloRetangulo(float cateto1, float cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	
	public double calcularHipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));
		return hipotenusa;
	}

	public float getCateto1() {
		return cateto1;
	}

	public void setCateto1(float cateto1) {
		this.cateto1 = cateto1;
	}

	public float getCateto2() {
		return cateto2;
	}

	public void setCateto2(float cateto2) {
		this.cateto2 = cateto2;
	}
	
	
}
