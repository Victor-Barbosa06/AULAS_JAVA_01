package aula_4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// antecessor e sucessor
		//variaveis
		int n,na=0,ns=0;
		
		//entrada de dados
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:\n"));
		//processamento de dados
		na = n-1;
		ns = n+1;
		//saida de dados
		JOptionPane.showMessageDialog(null, "Antecessor de "+n+" é "+na);
		JOptionPane.showMessageDialog(null, "Sucessor de "+n+" é "+ns);

	}

}
