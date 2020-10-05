package ex8;

public class Ponto {
	private float x,y;
	
	public Ponto() {
		x = 0;
		y = 0;
	}
	
	public Ponto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public double calculaDistancia(float x1, float x2, float y2, float y1) {
		
		float dx = x2 - x1;
		float dy = y2 - y1;
		
		double distancia = Math.sqrt(dx*dx + dy*dy);
		
		return distancia;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
}
