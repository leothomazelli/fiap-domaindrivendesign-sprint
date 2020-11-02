package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.dao.EnderecoDAO;
import br.com.sprint.excecao.Excecoes;

public class UpdateEndereco {

	public static void main(String[] args) {

		try {
			EnderecoDAO dao = new EnderecoDAO();
			System.out.println("Endereços atualizados: " + dao.atualizarLogradouro(JOptionPane.showInputDialog("Informe o CEP do logradouro que deseja atualizar"),
																				   JOptionPane.showInputDialog("Informe o logradouro atualizado")));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}

}

