package tema_aula_2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// if, else if e else
		int idade=0;
		String nome,endereco,cidade;
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao registro eleitoral");
		nome = JOptionPane.showInputDialog("Informe seu nome:\n");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		cidade = JOptionPane.showInputDialog("Informe sua cidade:\n");
		endereco = JOptionPane.showInputDialog("Endereço:\n");
		
		JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nCidade: "+cidade+"\nEndereco: "+endereco);
		if(idade >=18 && idade <=70) {
			JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+"\nO voto é obrigaório");
		}
		else if(idade <18 && idade >=16 || idade >70 ) {
			JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+"\nO voto é opcional");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+"\nNão pode votar");
		}
	}
}
