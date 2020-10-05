package ex9;

public class TesteCor {

	public static void main(String[] args) {
		
		Cor cor1 = new Cor(10,100,20);
		Cor cor2 = new Cor(125,30);
		Cor cor3 = new Cor(50);
		Cor cor4 = new Cor();
		
		System.out.println(cor1.obterCor());
		System.out.println(cor2.obterCor());
		System.out.println(cor3.obterCor());
		System.out.println(cor4.obterCor());
		

	}

}
