package aula_3;

import javax.swing.JOptionPane;

public class Main {
	//operações matematicas
	public static double Soma(float n1,float n2) {
		return n1+n2;
	}
	public static double Subtrai(float n1,float n2) {
		return n1-n2;
	}
	public static double Multiplica(float n1,float n2) {
		return n1 * n2;
	}
	public static double Divide(float n1,float n2) {
		return n1 / n2;
	}
	public static void main(String[] args) {
		// Calculadora
		//variaveis
		int n1=0,n2=0;
		
		JOptionPane.showMessageDialog(null, "Calculadora virtual");
		n1 = Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro numero:\n"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("informe o segundo numero:\n"));
		JOptionPane.showMessageDialog(null, n1+" + "+n2+" = "+Soma(n1, n2));
		JOptionPane.showMessageDialog(null, n1+" - "+n2+" = "+Subtrai(n1, n2));
		JOptionPane.showMessageDialog(null, n1+" x "+n2+" = "+Multiplica(n1, n2));
		JOptionPane.showMessageDialog(null, n1+" / "+n2+" = "+Divide(n1, n2));
	}

}
