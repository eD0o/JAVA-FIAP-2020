package for_each;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		//1 - Imprima todos os n�meros de 0 a 100 utilizando for, while e do/while.
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Digite a op��o desejada: ");
		opcao = scanner.nextInt();
		
		switch (opcao){
			case 1:
				for_1();
				break;
			case 2:
				while_2();
				break;
			case 3:
				dowhile_3();
				break;
			default:
				System.out.println("ERRO: Digite a op��o correta.");
		}
		
	}
	public static void for_1(){
		for(int i = 1; i<=100; i++) {
			System.out.println(i);
		}
	}
	
	public static void while_2() {
		int i = 1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		
	}
	
	public static void dowhile_3() {
		int i = 1;
		 do{
			System.out.println(i);
			i++;
		}while(i<=100);
	}
}
