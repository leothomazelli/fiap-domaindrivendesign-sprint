package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Endereco;
import br.com.sprint.dao.EnderecoDAO;
import br.com.sprint.excecao.Excecoes;

public class AdicionarEndereco {

	public static void main(String[] args) {
		
		try {
			EnderecoDAO dao = new EnderecoDAO();
			System.out.println("Endereços adicionados: " + dao.adicionarEndereco(new Endereco(JOptionPane.showInputDialog("Informe o CEP"),
																							  JOptionPane.showInputDialog("Informe o logradouro").toUpperCase(),
																							  JOptionPane.showInputDialog("Informe a cidade").toUpperCase(),
																							  JOptionPane.showInputDialog("Informe o UF").toUpperCase(),
																							  JOptionPane.showInputDialog("Informe o bairro").toUpperCase(),
																							  JOptionPane.showInputDialog("Informe o complemento").toUpperCase())));
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
