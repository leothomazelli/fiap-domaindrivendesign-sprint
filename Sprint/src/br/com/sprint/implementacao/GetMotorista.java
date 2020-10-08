package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Motorista;
import br.com.sprint.dao.MotoristaDAO;
import br.com.sprint.excecao.Excecoes;

public class GetMotorista {

	public static void main(String [] args) {
		
		try {
			MotoristaDAO dao = new MotoristaDAO();
			Motorista resposta = dao.getMotorista(JOptionPane.showInputDialog("Informe o nome que deseja buscar").toUpperCase());
			System.out.println("ID do motorista: " + resposta.getIdMotorista());
			System.out.println("Nome: " + resposta.getNome());
			System.out.println("E-mail: " + resposta.getEmail());
			System.out.println("Logradouro: " + resposta.getEndereco().getLogradouro());
			System.out.println("Telefone: " + resposta.getTelefone());
			System.out.println("Senha: " + resposta.getSenha());
			System.out.println("Documentos: " + resposta.getDocumentos().getAll());
			System.out.println("Ocorrências: " + resposta.getOcorrencia().getDescricaoEvento());
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
