package br.com.sprint.bo;

import br.com.sprint.beans.Endereco;
import br.com.sprint.dao.EnderecoDAO;

public class EnderecoBO {

	private static boolean definirUf(String uf) {
		Endereco endco = new Endereco();
		if (endco.getUf().length()<1 || endco.getUf().length()>2) {
			return false;
		}
		return true;
	}
	
	private static boolean objetoNulo(String nulo) {
		Endereco endco = new Endereco();
		if (endco.getAll() == null) {
			return false;
		}
		return true;
	}
	
	public static String novo(Endereco objeto) throws Exception {
		//requisitos funcionais (tudo que impede o sistema de cair, dados duplicados em pk, etc)
		
		EnderecoDAO endDAO = new EnderecoDAO();
			
		Endereco resposta = endDAO.getEnderecoById(objeto.getIdEndereco());
		if (resposta.getIdEndereco()!=0) {
			return "ID já existe";
		}
		//regra possível ou estou delirando? 
		if (objetoNulo(resposta.getAll()) == false) {
			return "Objeto nulo";
		}
		
		//regras de negocio (ecossistemas do negócio, funcionalidade, como funciona)
		if (objeto.getIdEndereco()<1) {
			return "ID inválido";
		}
		if (objeto.getCep().length()<8 || objeto.getCep().length()>9) {
			return "CEP inválido";
		}
		if (definirUf(objeto.getUf()) == false) {
			return "UF inválido";
		}
		
		//padronização (formato de data/hora, caracteres string maiusculo/minusculo)
		objeto.setLogradouro(objeto.getLogradouro().toUpperCase());
		objeto.setCidade(objeto.getCidade().toUpperCase());
		objeto.setUf(objeto.getUf().toUpperCase());
		objeto.setBairro(objeto.getBairro().toUpperCase());
		objeto.setComplemento(objeto.getComplemento().toUpperCase());
				
		endDAO.close();
		
		return "Cadastrado com sucesso";
	}
}
