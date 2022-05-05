package aula_4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// reajuste de 1%
		//variaveis
		double saldo=0,reajuste=0;
		
		//entrada de dados
		JOptionPane.showMessageDialog(null, "Calculo de reajuste");
		//processamento de dados
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe seu saldo:\n"));
		reajuste = saldo * 1.01;
		//saida de dados
		JOptionPane.showMessageDialog(null, "Saldo informado: "+saldo+"\nSaldo reajustado: "+reajuste);
		
	}

}
