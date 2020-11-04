package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Documento;
import br.com.sprint.beans.Motorista;
import br.com.sprint.dao.DocumentoDAO;
import br.com.sprint.dao.MotoristaDAO;
import br.com.sprint.excecao.Excecoes;

public class AdicionarDocumento {

	public static void main(String [] args) {
		
		try {
			DocumentoDAO dao = new DocumentoDAO();
			MotoristaDAO motoristaDAO = new MotoristaDAO();
			
			Documento documento = new Documento();
			Motorista motorista = new Motorista();
			motorista = motoristaDAO.getMotoristaById(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do motorista")));
			documento.setIdDocumento(Integer.parseInt(JOptionPane.showInputDialog("Informe o id do documento")));
			documento.setTipo(JOptionPane.showInputDialog("Informe o tipo do documento").toUpperCase());
			documento.setUrl(JOptionPane.showInputDialog("Informe a url do documento").toLowerCase());
			documento.setUltimaModificacao(JOptionPane.showInputDialog("Informe a data de hoje"));
			documento.setDtVencimento(JOptionPane.showInputDialog("Informe a data de vencimento do documento"));
			documento.setMotorista(motorista);
			
			System.out.println("Documentos adicionados: " + dao.adicionarDocumento(documento));
			
			
			
			dao.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
