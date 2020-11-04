package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Documento;
import br.com.sprint.dao.DocumentoDAO;
import br.com.sprint.excecao.Excecoes;

public class GetDocumento {

	public static void main(String [] args) {
		
		try {
			DocumentoDAO dao = new DocumentoDAO();
			
			Documento resposta = dao.getDocumento(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID que deseja buscar")));
			System.out.println("ID do documento: " + resposta.getIdDocumento());
			System.out.println("Tipo do documento: " + resposta.getTipo());
			System.out.println("URL: " + resposta.getUrl());
			System.out.println("Ultima modificação: " + resposta.getUltimaModificacao());
			System.out.println("Data de vencimento: " + resposta.getDtVencimento());
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
