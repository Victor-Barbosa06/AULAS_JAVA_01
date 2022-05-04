package aula_3;

import javax.swing.JOptionPane;

public class Main {
	//Calculo do IMC
	public static double CalculaIMC(float peso,float altura) {
		return peso/Math.pow(altura, 2);
	}
	
	public static void main(String[] args) {
		// IMC
		//Variaveis
		float peso=0,altura=0;
		double IMC=0;
		
		//entrada de dados
		JOptionPane.showInternalMessageDialog(null, "Bem-vindo ao calculo de IMC");
		peso = Float.parseFloat(JOptionPane.showInputDialog("Informe seu peso:\n"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura:\n"));
		IMC = CalculaIMC(peso, altura);
		
		//retono dos dados
		if (IMC <= 18.4) {
			JOptionPane.showMessageDialog(null, "IMC: "+IMC+"\nAbaixo do peso");
		}
		if (IMC >=18.5 && IMC <=24.9) {
			JOptionPane.showMessageDialog(null, "IMC: "+IMC+"\nPeso normal");
		}
		if (IMC >=25 && IMC <=29.9) {
			JOptionPane.showMessageDialog(null, "IMC: "+IMC+"\nSobrepeso");
		}
		if (IMC >= 30 && IMC <=34.9) {
			JOptionPane.showMessageDialog(null, "IMC: "+IMC+"\nObesidade Grau I");
		}
		if (IMC >= 35 && IMC <=39.9) {
			JOptionPane.showMessageDialog(null, "IMC: "+IMC+"\nObesidade Grau II");
		}
		if (IMC >=40) {
			JOptionPane.showMessageDialog(null, "IMC: "+IMC+"\nObesidade Grau III");
		}
		
	}

}
