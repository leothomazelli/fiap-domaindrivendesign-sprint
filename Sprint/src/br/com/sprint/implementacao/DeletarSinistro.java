package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.dao.SinistroDAO;
import br.com.sprint.excecao.Excecoes;

public class DeletarSinistro {

	public static void main(String [] args) {
		
		try {
			SinistroDAO dao = new SinistroDAO();
			System.out.println("Ocorrências removidas: " + dao.deletePorId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID que deseja remover"))));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
