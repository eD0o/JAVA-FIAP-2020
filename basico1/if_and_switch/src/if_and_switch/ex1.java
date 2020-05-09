package if_and_switch;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Qual o nome da pessoa 1?");
	String np1 = scanner.next();
	
	System.out.println("Qual a altura da pessoa 1?");
	float hp1 = scanner.nextFloat();
	
	System.out.println("Qual o peso da pessoa 1?");
	double wp1 = scanner.nextDouble();
	
	System.out.println("Qual o nome da pessoa 2?");
	String np2 = scanner.next();
	
	System.out.println("Qual a altura da pessoa 2?");
	float hp2 = scanner.nextFloat();
	
	System.out.println("Qual o peso da pessoa 2?");
	double wp2 = scanner.nextDouble();
	
	if(hp1>hp2) {
		System.out.println(np1 + " é mais alto.");
	}
	
	else if(hp1==hp2) {
		System.out.println(np1 + np2 + " possuem a mesma altura.");
	}
	
	else {
		System.out.println(np2 + " é mais alto.");
	}
	
	if(wp1>wp2) {
		System.out.println(np1 + " é mais pesado.");
	}
	
	else if(wp1==wp2) {
		System.out.println(np1 + np2 + "possuem o mesmo peso.");
	}
	
	else {
		System.out.println(np2 + " é mais pesado.");
	}
	
		
	}
}
