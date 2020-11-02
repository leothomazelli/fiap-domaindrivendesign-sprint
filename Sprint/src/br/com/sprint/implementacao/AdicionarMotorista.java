package br.com.sprint.implementacao;

import javax.swing.JOptionPane;
import br.com.sprint.beans.Motorista;
import br.com.sprint.dao.MotoristaDAO;
import br.com.sprint.excecao.Excecoes;

public class AdicionarMotorista {

	public static void main(String[] args) {
		
		try {
			MotoristaDAO dao = new MotoristaDAO();
			System.out.println("Motoristas adicionados: " + dao.adicionarMotorista(new Motorista(JOptionPane.showInputDialog("Informe o nome do motorista").toUpperCase(),
																								 JOptionPane.showInputDialog("Informe o email").toUpperCase(),
																								 JOptionPane.showInputDialog("Informe o telefone"),
																								 JOptionPane.showInputDialog("Informe a senha"),
																								 JOptionPane.showInputDialog("Informe o número do logradouro"),
																								 JOptionPane.showInputDialog("Informe o cep")
																								 )));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
