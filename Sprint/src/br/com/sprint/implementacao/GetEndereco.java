package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Motorista;
import br.com.sprint.dao.MotoristaDAO;
import br.com.sprint.excecao.Excecoes;

public class GetMotorista {

	public static void main(String [] args) {
		
		try {
			MotoristaDAO dao = new MotoristaDAO();
			Motorista resposta = dao.getMotoristaById(Integer.parseInt(JOptionPane.showInputDialog("Informe o id que deseja buscar")));
			System.out.println("Nome do motorista: " + resposta.getNome());
			System.out.println("E-mail: " + resposta.getEmail());
			System.out.println("Telefone: " + resposta.getTelefone());
			System.out.println("Número do logradouro: " + resposta.getNumLogradouro());
			System.out.println("CEP: " + resposta.getEndereco().getCep());
			System.out.println("Logradouro: " + resposta.getEndereco().getLogradouro());
			System.out.println("Cidade: " + resposta.getEndereco().getCidade());
			System.out.println("UF: " + resposta.getEndereco().getUf());
			System.out.println("Bairro: " + resposta.getEndereco().getBairro());
			System.out.println("Complemento: " + resposta.getEndereco().getComplemento());
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
