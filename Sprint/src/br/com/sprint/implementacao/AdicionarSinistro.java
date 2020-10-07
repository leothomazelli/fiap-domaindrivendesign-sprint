package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Sinistro;
import br.com.sprint.dao.SinistroDAO;
import br.com.sprint.excecao.Excecoes;

public class AdicionarSinistro {

	public static void main(String [] args) {
		
		try {
			SinistroDAO dao = new SinistroDAO();
			System.out.println("Ocorrencias adicionadas: " + dao.adicionarSinistro(new Sinistro(JOptionPane.showInputDialog("Informe a data de abertura"),
																								JOptionPane.showInputDialog("Informe o horário da ocorrência"),
																								JOptionPane.showInputDialog("Descreva o a ocorrência"),
																								JOptionPane.showInputDialog("Descreva os danos"))));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
