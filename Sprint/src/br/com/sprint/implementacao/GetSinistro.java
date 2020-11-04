package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Sinistro;
import br.com.sprint.dao.SinistroDAO;
import br.com.sprint.excecao.Excecoes;

public class GetSinistro {

	public static void main(String [] args) {
		
		try {
			
			SinistroDAO dao = new SinistroDAO();
			Sinistro resposta = dao.getSinistro(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da ocorrência que deseja buscar")));
			System.out.println(resposta.getAll());
			
			System.out.println("ID da ocorrência: " + resposta.getIdSinistro());
			System.out.println("Data: " + resposta.getData());
			System.out.println("Horário da ocorrência: " + resposta.getHorarioDaOcorrencia());
			System.out.println("Descrição do evento: " + resposta.getDescricaoEvento());
			System.out.println("Descrição dos danos: " + resposta.getDescricaoDanos());
			System.out.println("URL dos documentos do responsável: " + resposta.getMotorista().getIdMotorista());
			//System.out.println("URL dos documentos do responsável: " + resposta.getDocumentosMotorista().getUrl());
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
