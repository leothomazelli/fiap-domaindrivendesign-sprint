package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.dao.DocumentoDAO;
import br.com.sprint.excecao.Excecoes;

public class DeletarDocumento {

	public static void main(String [] args) {
		
		try {
			DocumentoDAO dao = new DocumentoDAO();
			System.out.println("Documentos removidos: " + dao.deletePorId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID que deseja remover"))));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}