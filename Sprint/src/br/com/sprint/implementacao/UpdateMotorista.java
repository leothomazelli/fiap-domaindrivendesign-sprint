package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.dao.MotoristaDAO;
import br.com.sprint.excecao.Excecoes;

public class UpdateMotorista {

	public static void main(String [] args) {
		
		try {
			MotoristaDAO dao = new MotoristaDAO();
			System.out.println("Motoristas atualizados: " + dao.atualizarTelefone(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do motorista que deseja atualizar")),
					 															                   JOptionPane.showInputDialog("Informe o telefone atualizado")));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
