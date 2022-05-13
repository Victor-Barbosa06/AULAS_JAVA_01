package interface_;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Calculo c = new FormasGeometricas() {};
		int qtd=0,op=0;
		
		qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas formas deseja criar?\n"));
		String[] formas = new String[qtd];
		
		for(int i=0;i<qtd;i++) {
			op=Integer.parseInt(JOptionPane.showInputDialog("1-Quadrilátero\n2-Quadrado\n3-Retângulo\n4-Circulo"));
			switch(op) {
				case 1:{
					double l1 =Double.parseDouble(JOptionPane.showInputDialog("Tamanho do lado1:\n"));  
					double l2 =Double.parseDouble(JOptionPane.showInputDialog("Tamanho do lado2:\n"));  
					double l3 =Double.parseDouble(JOptionPane.showInputDialog("Tamanho do lado3:\n"));  
					double l4 =Double.parseDouble(JOptionPane.showInputDialog("Tamanho do lado4:\n"));
					formas[i]="Quadrilátero\n\nPerimetro: "+c.Quadrilatero(l1, l2, l3, l4);
					break;
				}
				case 2:{
					double lado =Double.parseDouble(JOptionPane.showInputDialog("Tamanho do lado:\n"));
					formas[i]="Quadrado\n      Area: "+c.AreaQuadrado(lado)+"\n      Perimetro: "+c.Quadrado(lado)+"\n\n";
					break;
				}
				case 3:{
					double base =Double.parseDouble(JOptionPane.showInputDialog("Tamanho da base:\n"));
					double altura =Double.parseDouble(JOptionPane.showInputDialog("Altura:\n"));
					formas[i]="Retângulo\n      Area: "+c.AreaRetangulo(base, altura)+"\n      Perimetro: "+c.Retangulo(base, altura)+"\n\n";
					break;
				}
				case 4:{
					double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio:\n"));
					formas[i]="Circulo\n      Area: "+c.AreaCirculo(raio)+"\n      Perimetro: "+c.Circulo(raio)+"\n\n";
					break;
				}
			}
		}
		JOptionPane.showMessageDialog(null, formas);
	}

}
