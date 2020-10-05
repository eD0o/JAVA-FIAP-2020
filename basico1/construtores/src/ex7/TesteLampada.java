package ex7;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada();
		Lampada lampada2 = new Lampada("Vermelha");
		Lampada lampada3 = new Lampada("Vermelha",true);
		
		System.out.println("Status Lampada 1:" + lampada1.getCor() + lampada1.isLigada());
		System.out.println("Status Lampada 2:" + lampada2.getCor() + lampada2.isLigada());
		System.out.println("Status Lampada 3:" + lampada3.getCor() + lampada3.isLigada());
	}
}
