package ex9;

public class Cor {
	private int red,green, blue;
	
	public Cor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		
	}
	
	public Cor(int red, int green) {
		this.red = red;
		this.green = green;
	}
	
	public Cor(int red) {
		this.red = red;
	}
	
	public Cor() {
		
	}
	
	public String obterCor() {
		String cores = getRed() + ","  + getGreen() + "," + getBlue();;
		return cores; 
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	
	
	
}
