package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.dao.EnderecoDAO;
import br.com.sprint.excecao.Excecoes;

public class DeletarEndereco {

	public static void main(String [] args) {
		
		try {
			EnderecoDAO dao = new EnderecoDAO();
			System.out.println("Endereços deletados: " + dao.deletePorId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID que deseja remover"))));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
