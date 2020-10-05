package ex5;

public class TesteTriangulo {

	public static void main(String[] args) {
		
		TrianguloRetangulo triangulo1 = new TrianguloRetangulo();
		TrianguloRetangulo triangulo2 = new TrianguloRetangulo();
		
		triangulo1.setCateto1(5);
		triangulo1.setCateto2(10);
		
		triangulo2.setCateto1(4);
		triangulo2.setCateto2(5);
		
		System.out.println("Triangulo 1: " + triangulo1.calcularHipotenusa());
		System.out.println("Triangulo 2: " + triangulo2.calcularHipotenusa());
		
	}
}
