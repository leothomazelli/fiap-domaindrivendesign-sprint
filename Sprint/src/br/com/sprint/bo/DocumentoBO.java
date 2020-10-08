package br.com.sprint.bo;

import br.com.sprint.beans.Documento;
import br.com.sprint.dao.DocumentoDAO;

public class DocumentoBO {

	private static boolean validarData(String data) {
		byte dia = Byte.parseByte(data.substring(0,2));
		byte mes = Byte.parseByte(data.substring(3,5));
		short ano = Short.parseShort(data.substring(6));
		if (dia<1 || mes<1 || dia>31 || mes>12) {
			return false;
		}
		if (ano<1900) {
			return false;
		}
		return true;
	}
	
	private static boolean documentacao(String doc) {
		Documento docmt = new Documento();
		if (docmt.getTipo().length()<2 || docmt.getTipo().length()>3) {
			return false;
		}
		return true;
	}
	
	public static String novo(Documento objeto) throws Exception {
		//requisitos funcionais (tudo que impede o sistema de cair, dados duplicados em pk, etc)
		
		DocumentoDAO docDAO = new DocumentoDAO();
			
		Documento resposta = docDAO.getDocumento(objeto.getIdDocumento());
		if (resposta.getIdDocumento()!=0) {
			return "ID já existe";
		}
		
		//regras de negocio (ecossistemas do negócio, funcionalidade, como funciona)
		if (objeto.getIdDocumento()<1) {
			return "ID inválido";
		}
		if (objeto.getUrl().length()<10) {
			return "URL inválida";
		}
		//verificar unificação dos três if validarData abaixo
		if (validarData(objeto.getDataCriacao()) == false) {
			return "Data inválida";
		}
		if (validarData(objeto.getDataVencimento()) == false) {
			return "Data inválida";
		}
		if (validarData(objeto.getUltimaModificacao()) == false) {
			return "Data inválida";
		}
		if (documentacao(objeto.getTipo()) == false) {
			return "Tipo de documento inválido";
		}
		
		//padronização (formato de data/hora, caracteres string maiusculo/minusculo)
		objeto.setTipo(objeto.getTipo().toUpperCase());
				
		docDAO.close();
		
		return "Cadastrado com sucesso";
	}
}
