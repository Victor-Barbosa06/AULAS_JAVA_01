package aula_4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// IPI
		//variaveis
		double ipi=1.25,p1=300.00,p2=250.50,p3=100.75,p4=50.50,P1=0,P2=0,valor=0;
		int qtd1=0,qtd2=0,op=0,op2=0;
		
		//entrada de dados
		JOptionPane.showMessageDialog(null, "Valor das peças");
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a primeira peça:\n1-Peça1= R$ "+p1+"\n2-Peça2= R$ "+p2+"\n3-Peça3= R$ "+p3+"\n4-Peça4= R$ "+p4+"\n"));
		qtd1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:\n"));
		op2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a segunda peça:\n1-Peça1= R$ "+p1+"\n2-Peça2= R$ "+p2+"\n3-Peça3= R$ "+p3+"\n4-Peça4= R$ "+p4+"\n"));
		qtd2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:\n"));
		//processamento de dados
		switch(op)
		{
			case 1:{
				P1 = p1;
				break;
			}
			case 2:{
				P1 = p2;
				break;
			}
			case 3:{
				P1 = p3;
				break;
			}
			case 4:{
				P1 = p4;
				break;
			}
		}
		switch(op2)
			{
			case 1:{
				P2 = p1;
				break;
			}
			case 2:{
				P2 = p2;
				break;
			}
			case 3:{
				P2 = p3;
				break;
			}
			case 4:{
				P2 = p4;
				break;
			}
		}
		valor = ((P1*qtd1)+(P2*qtd2))*ipi;
		//saida de dados
		JOptionPane.showMessageDialog(null, "Peça1: R$"+P1+" x "+qtd1+"uni"+"\nPeça2: R$ "+P2+" x "+qtd2+"uni\n\nValor com IPI: R$"+valor);
	}

}
