package ex2;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo veiculo = new Veiculo();
		
		veiculo.setPlaca("KLF-5235");
		veiculo.setPlaca("Chevrolet");
		veiculo.setModelo("Onix");
		veiculo.setAno(2020);
		
		System.out.println("Status de valida��o do ve�culo: " + veiculo.validacao(veiculo.getAno()));
	}

}
