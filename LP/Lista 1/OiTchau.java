package Lista1;

import javax.swing.JOptionPane;

public class OiTchau {
	public static void main(String args[]) {
		/* Barbara dos Santos Mingatos */
		
		/* Crie duas classes com m�todo main chamadas Oi e Tchau. Ao executar a classe Oi, a mensagem
		Oi deve ser exibida na sa�da padr�o. Ao executar a classe Tchau, a mensagem Tchau deve ser
		exibida na sa�da padr�o. O c�digo fonte dessas duas classes deve ser armazenado em um arquivo
		chamado OiTchau.java.*/
		
		int resp=Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para Oi\nDigite 1 para Tchau"));
		
		if (resp == 0) {
			System.out.println("Oi");
		} else {
			System.out.println("Tchau");
		}
	}

}
