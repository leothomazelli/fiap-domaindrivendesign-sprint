package br.com.sprint.implementacao;

import javax.swing.JOptionPane;

import br.com.sprint.beans.Motorista;
import br.com.sprint.beans.Sinistro;
import br.com.sprint.dao.MotoristaDAO;
import br.com.sprint.dao.SinistroDAO;
import br.com.sprint.excecao.Excecoes;

public class AdicionarSinistro {

	public static void main(String [] args) {
		
		try {
			SinistroDAO dao = new SinistroDAO();
			MotoristaDAO motoristaDAO = new MotoristaDAO();
			
			Sinistro sinistro = new Sinistro();
			
			sinistro.setIdSinistro(Integer.parseInt(JOptionPane.showInputDialog("Informe o id do sinistro")));
			sinistro.setData(JOptionPane.showInputDialog("Informe a data de abertura"));
			sinistro.setHorarioDaOcorrencia(JOptionPane.showInputDialog("Informe o horário da ocorrência"));
			sinistro.setDescricaoEvento(JOptionPane.showInputDialog("Descreva a ocorrência"));
			sinistro.setDescricaoDanos(JOptionPane.showInputDialog("Descreva os danos"));
			
			Motorista motorista = new Motorista();
			motorista = motoristaDAO.getMotoristaById(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do motorista")));
		
			sinistro.setMotorista(motorista);
			
			
			System.out.println("Ocorrencias adicionadas: " + dao.adicionarSinistro(sinistro));
			
			
			
			/*System.out.println("Ocorrencias adicionadas: " + dao.adicionarSinistro(new Sinistro(Integer.parseInt(JOptionPane.showInputDialog("Informe o id do sinistro")),
																								JOptionPane.showInputDialog("Informe a data de abertura"),
																								JOptionPane.showInputDialog("Informe o horário da ocorrência"),
																								JOptionPane.showInputDialog("Descreva a ocorrência"),
																								JOptionPane.showInputDialog("Descreva os danos"),
																								motoristaDAO.getMotoristaById(JOptionPane.showInputDialog("Informe o ID do motorista"))
				)));*/
			dao.close();
			motoristaDAO.close();
		}
		catch (Exception e) {
			System.out.println(Excecoes.tratarExcecao(e));
		}
	}
}
