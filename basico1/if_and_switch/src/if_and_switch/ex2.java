package if_and_switch;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = scanner.next();
		
		System.out.println("Qual a sua idade?");
		int age = scanner.nextInt();
		
		if(age<16) {
			System.out.println("Voc� n�o pode votar.");
		}
		
		else if(age>=18 && age<=65) {
			System.out.println("Eleitor obrigat�rio.");
		}
		
		else if(age>=16 && age<18 || age>65){
			System.out.println("Eleitor facultativo.");
		}
	}
}