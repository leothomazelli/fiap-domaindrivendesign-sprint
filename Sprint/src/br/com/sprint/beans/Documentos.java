package br.com.sprint.beans;

public class Documentos {

	private int idDocumento;
	private String tipo = new String();
	private String url = new String();
	private String ultimaModificacao = new String();
	private String dtVencimento = new String();
	
	public Documentos() {}
	
	public Documentos(int idDocumento) {
		this.idDocumento = idDocumento;
	}
	public Documentos(String tipo, String url, String ultimaModificacao, String dtVencimento) {
		this.tipo = tipo;
		this.url = url;
		this.ultimaModificacao = ultimaModificacao;
		this.dtVencimento = dtVencimento;
	}
	public Documentos(int idDocumento, String tipo, String url, String ultimaModificacao, String dtVencimento) {
		this.idDocumento = idDocumento;
		this.tipo = tipo;
		this.url = url;
		this.ultimaModificacao = ultimaModificacao;
		this.dtVencimento = dtVencimento;
	}
	
	public String getAll() {
		return idDocumento + "\n" + tipo + "\n" + url + "\n" + ultimaModificacao + "\n" + dtVencimento;
	}
	public void setAll(int idDocumento, String tipo, String url, String ultimaModificacao, String dtVencimento) {
		this.idDocumento = idDocumento;
		this.tipo = tipo;
		this.url = url;
		this.ultimaModificacao = ultimaModificacao;
		this.dtVencimento = dtVencimento;
	}
	
	public int getIdDocumento() {
		return idDocumento;
	}
	public String getTipo() {
		return tipo;
	}
	public String getUrl() {
		return url;
	}

	public String getUltimaModificacao() {
		return ultimaModificacao;
	}
	public String getDtVencimento() {
		return dtVencimento;
	}
	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUltimaModificacao(String ultimaModificacao) {
		this.ultimaModificacao = ultimaModificacao;
	}
	public void setDataVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
}
