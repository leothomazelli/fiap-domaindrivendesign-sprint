package br.com.sprint.bo;

import br.com.sprint.beans.Motorista;
import br.com.sprint.dao.MotoristaDAO;

public class MotoristaBO {
	
	private static boolean contato(String ctto) {
		Motorista moto = new Motorista();
		if (moto.getTelefone().length()<11 || moto.getTelefone().length()>12) {
			return false;
		}
		return true;
	}
	
	public static String novo(Motorista objeto) throws Exception {
		//requisitos funcionais (tudo que impede o sistema de cair, dados duplicados em pk, etc)
		
		MotoristaDAO motDAO = new MotoristaDAO();
			
		Motorista resposta = motDAO.getMotoristaById(objeto.getIdMotorista());
		if (resposta.getIdMotorista()!=0) {
			return "ID já existe";
		}
		
		//regras de negocio (ecossistemas do negócio, funcionalidade, como funciona)
		if (objeto.getIdMotorista()<1) {
			return "ID inválido";
		}
		if (contato(objeto.getTelefone()) == false) {
			return "Formato de telefone inválido";
		}
		
		//padronização (formato de data/hora, caracteres string maiusculo/minusculo)
		objeto.setNome(objeto.getNome().toUpperCase());
		objeto.setEmail(objeto.getEmail().toUpperCase());
		objeto.setTelefone(objeto.getTelefone().toUpperCase());
		objeto.setSenha(objeto.getSenha().toUpperCase());
		
		motDAO.close();
		
		return "Cadastrado com sucesso";
	}
}
