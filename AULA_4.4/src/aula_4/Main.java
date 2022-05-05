package aula_4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// Salários
		//Variaveis
		double sal_min=1200.00,sal=0.00,smi=0;
		
		//entrada de dados
		JOptionPane.showInternalMessageDialog(null, "Salarios");
		sal = Double.parseDouble(JOptionPane.showInputDialog("Informe seu sálario:\nR$ "));
		//processamento de dados
		smi = sal/sal_min;
		//saida de dados
		JOptionPane.showMessageDialog(null, "Você recebe "+smi+" salários minimos");
	}

}
