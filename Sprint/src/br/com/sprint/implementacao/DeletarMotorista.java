package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.dao.MotoristaDAO;
import br.com.sprint.excecao.Excecoes;

public class DeletarMotorista {

	public static void main(String [] args) {
		
		try {
			MotoristaDAO dao = new MotoristaDAO();
			System.out.println("Motoristas removidos: " + dao.deletePorId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID que deseja remover"))));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
