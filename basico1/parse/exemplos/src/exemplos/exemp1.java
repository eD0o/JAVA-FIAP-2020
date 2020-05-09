package exemplos;

import javax.swing.JOptionPane;

public class exemp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textoNumero = JOptionPane.showInputDialog("Digite sua idade:");
		JOptionPane.showMessageDialog(null, "Número digitado: " + textoNumero);
		
		byte valorByte = Byte.parseByte(textoNumero);
		short valorShort = Short.parseShort(textoNumero);
		int valorInt = Integer.parseInt(textoNumero);
		long valorLong = Long.parseLong(textoNumero);
		float valorFloat = Float.parseFloat(textoNumero);
		double valorDouble = Double.parseDouble(textoNumero);
		boolean valorBoolean = Boolean.parseBoolean(textoNumero);
		
		JOptionPane.showMessageDialog(null,"Números convertidos da String: "
				+ "\nByte: " + valorByte
				+ "\nShort: " + valorShort
				+ "\nInt: " + valorInt
				+ "\nLong: " + valorLong
				+ "\nFloat: " + valorFloat
				+ "\nDouble: " + valorDouble
				+ "\nBoolean: " + valorBoolean);
	}
}
