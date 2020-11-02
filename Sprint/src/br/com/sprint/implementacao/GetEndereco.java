package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Endereco;
import br.com.sprint.dao.EnderecoDAO;
import br.com.sprint.excecao.Excecoes;

public class GetEndereco {

	public static void main(String [] args) {
		
		try {
			EnderecoDAO dao = new EnderecoDAO();
			Endereco resposta = dao.getEndereco(JOptionPane.showInputDialog("Informe o CEP que deseja buscar"));
			System.out.println("Logradouro: " + resposta.getLogradouro());
			System.out.println("Cidade: " + resposta.getCidade());
			System.out.println("UF: " + resposta.getUf());
			System.out.println("Bairro: " + resposta.getBairro());
			System.out.println("CEP: " + resposta.getComplemento());
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
