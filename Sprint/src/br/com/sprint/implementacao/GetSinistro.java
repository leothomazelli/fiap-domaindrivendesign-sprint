package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Sinistro;
import br.com.sprint.dao.SinistroDAO;
import br.com.sprint.excecao.Excecoes;

public class GetSinistro {

	public static void main(String [] args) {
		
		try {
			SinistroDAO dao = new SinistroDAO();
			Sinistro resposta = dao.getSinistro(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da ocorr�ncia que deseja buscar")));
			System.out.println("ID da ocorr�ncia: " + resposta.getIdSinistro());
			System.out.println("Data: " + resposta.getData());
			System.out.println("Hor�rio da ocorr�ncia: " + resposta.getHorarioDaOcorrencia());
			System.out.println("Descri��o do evento: " + resposta.getDescricaoEvento());
			System.out.println("Descri��o dos danos: " + resposta.getDescricaoDanos());
			System.out.println("URL dos documentos do respons�vel: " + resposta.getDocumentosMotorista().getUrl());
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
