package ex3;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data data = new Data();
		
		data.setDia(-1);
		data.setMes(-12);
		data.setAno(-1999);
		
		data.validacaoDia();
		data.validacaoMes();
		data.validacaoAno();
		
		data.nomeDoMes();
		
		data.formatoData();
	}

}
