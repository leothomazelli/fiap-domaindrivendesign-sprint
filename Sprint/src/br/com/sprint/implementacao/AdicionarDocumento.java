package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Documento;
import br.com.sprint.dao.DocumentoDAO;
import br.com.sprint.excecao.Excecoes;

public class AdicionarDocumento {

	public static void main(String [] args) {
		
		try {
			DocumentoDAO dao = new DocumentoDAO();
			System.out.println("Documentos adicionados: " + dao.adicionarDocumento(new Documento(JOptionPane.showInputDialog("Informe o tipo do documento").toUpperCase(),
																							     JOptionPane.showInputDialog("Informe a url"),
																							     JOptionPane.showInputDialog("Informe a data de criação"),
																							     JOptionPane.showInputDialog("Informe a ultima modificação"),
																							     JOptionPane.showInputDialog("Informe a data de vencimento"))));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
