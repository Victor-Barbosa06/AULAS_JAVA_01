package aula_4;

import javax.swing.JOptionPane;

public class Main {
	public static int CalculaDias(int anos,int meses,int dias) {
		int retorno=0;
		
		retorno += anos*365;
		retorno += meses*30;
		retorno += dias;
		return retorno;
	}
	public static void main(String[] args) {
		// dias de vida
		//variaveis
		int anos=0,meses=0,dias=0,dias_t=0;
		
		//entrada de dados
		JOptionPane.showMessageDialog(null, "Calculo de dias de vida");
		anos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos anos você tem:\n"));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos meses de vida você tem:\n"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos dias de vida você tem:\n"));
		//processamento de dados
		dias_t = CalculaDias(anos, meses, dias);
		//saida de dados
		JOptionPane.showMessageDialog(null, anos+" anos, "+meses+" meses e "+dias+" dias :: "+dias_t+" dias");
	}

}
