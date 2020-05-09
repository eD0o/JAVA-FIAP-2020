package for_each;

import java.util.ArrayList;
import java.util.List;

public class exemp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listaDePalavras = new ArrayList<>();
		
		listaDePalavras.add("aa");
		listaDePalavras.add("bb");
		listaDePalavras.add("vvc");
		
		
		//a variável "palavra" é mais que um contador
		for(String palavra: listaDePalavras) {
			System.out.println(palavra);
		}
	}
}
