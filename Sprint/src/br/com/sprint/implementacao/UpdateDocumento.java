package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.dao.DocumentoDAO;
import br.com.sprint.excecao.Excecoes;

public class UpdateDocumento{

	public static void main(String[] args) {
		
		try {
			DocumentoDAO dao = new DocumentoDAO();
			System.out.println("Endereços atualizados: " + dao.atualizarVencimento(JOptionPane.showInputDialog("Informe a URL do documento que deseja atualizar"),
																				   JOptionPane.showInputDialog("Informe a atualização no vencimento")));
		    dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}