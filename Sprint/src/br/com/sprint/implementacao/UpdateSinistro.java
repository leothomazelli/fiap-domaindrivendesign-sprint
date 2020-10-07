package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.dao.SinistroDAO;
import br.com.sprint.excecao.Excecoes;

public class UpdateSinistro {

	public static void main(String [] args) {
		
		try {
			SinistroDAO dao = new SinistroDAO();
			System.out.println("Ocorrências atualizadas: " + dao.atualizarDescricaoEvento(JOptionPane.showInputDialog("Descreva a ocorrência atualizada"),
																	Integer.parseInt(JOptionPane.showInputDialog("Informe o ID "))));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
