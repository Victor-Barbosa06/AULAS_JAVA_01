package aula_3;

import javax.swing.JOptionPane;

public class Main {
	//calculo da Area
	public static double CalculaArea(double base,double altura) {
		return base*altura;
	}
	//calculo de Perimetro
	public static double CalculaPerimetro(double base,double altura) {
		return 2 * base + 2 * altura;
	}
	public static void main(String[] args) {
		// calculo de area
		int base=0,altura=0;
		
		JOptionPane.showMessageDialog(null, "Calculos de retangulo");
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base do retangulo:\n"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do retangulo:\n"));
		
		JOptionPane.showMessageDialog(null, "Area: "+CalculaArea(base, altura)+"\nPerimetro: "+CalculaPerimetro(base, altura));
	}

}
