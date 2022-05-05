package aula_4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// medias
		//variaveis
		//notas
		double num1=8.9,num2=7,num3=4.5,num4=6;
		//medias
		double media1=0,media2=0,media_m=0;
		
		//processamento de dados
		media1 = (num1+num2)/2;
		media2 = (num3+num4)/2;
		media_m = (media1+media2)/2;
		//saida de dados
		JOptionPane.showMessageDialog(null, "Media entre "+num1+" e "+num2+" = "+media1);
		JOptionPane.showMessageDialog(null, "Media entre "+num3+" e "+num4+" = "+media2);
		JOptionPane.showMessageDialog(null, "Media entre as medias\n"+media1+" e "+media2+" = "+media_m);
	}

}
