package aula_5;

import javax.swing.JOptionPane;

public class Main {
	public static double Media(double n1,double n2,double n3) {
		double resultado;
		
		resultado = (n1+n2+n3)/3;
		return resultado;
	}
	public static void main(String[] args) {
		// Matriz
		//variaveis
		int i=0,c=0;
		//matrizes
		String [][] turma = new String[8][5];
		double [][] notas = new double[8][3];
		
		//entrada de dados (Nomes)
		for(i=0;i<8;i++) {
			turma[i][0] = JOptionPane.showInputDialog("Informe o nome do aluno "+(i+1)+":\n");
		}
		//entrada de dados (Notas)
		for(i=0;i<8;i++) {
			for(c=0;c<3;c++) {
				notas[i][c] = Double.parseDouble(JOptionPane.showInputDialog(turma[i][0]+": Nota "+(c+1)+"\n"));
				turma[i][c+1] = String.valueOf(notas[i][c]);
				turma[i][4] = String.valueOf(Media(notas[i][0], notas[i][1], notas[i][2]));
			}
		}
		//saida de dados
		for(i=0;i<8;i++) {
			for(c=0;i<5;i++) {
				JOptionPane.showMessageDialog(null, turma[i][0]+":\n\nNota 1: "+turma[i][1]+"\nNota 2: "+turma[i][2]+"\nNota 3: "+turma[i][3]+"\n\nMedia: "+turma[i][4]);
			}
		}
	}
}
