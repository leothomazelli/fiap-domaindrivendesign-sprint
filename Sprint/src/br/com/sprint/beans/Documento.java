package br.com.sprint.beans;

public class Documento {

	private int idDocumento;
	private String tipo = new String();
	private String url = new String();
	private String dataCriacao = new String();
	private String ultimaModificacao = new String();
	private String dataVencimento = new String();
	
	public Documento() {}
	
	public Documento(int idDocumento) {
		this.idDocumento = idDocumento;
	}
	public Documento(String tipo, String url, String dataCriacao, String ultimaModificacao, String dataVencimento) {
		this.tipo = tipo;
		this.url = url;
		this.dataCriacao = dataCriacao;
		this.ultimaModificacao = ultimaModificacao;
		this.dataVencimento = dataVencimento;
	}
	public Documento(int idDocumento, String tipo, String url, String dataCriacao, String ultimaModificacao, String dataVencimento) {
		this.idDocumento = idDocumento;
		this.tipo = tipo;
		this.url = url;
		this.dataCriacao = dataCriacao;
		this.ultimaModificacao = ultimaModificacao;
		this.dataVencimento = dataVencimento;
	}
	
	public String getAll() {
		return idDocumento + "\n" + tipo + "\n" + url + "\n" + dataCriacao + "\n" + ultimaModificacao + "\n" + dataVencimento;
	}
	public void setAll(int idDocumento, String tipo, String url, String dataCriacao, String ultimaModificacao, String dataVencimento) {
		this.idDocumento = idDocumento;
		this.tipo = tipo;
		this.url = url;
		this.dataCriacao = dataCriacao;
		this.ultimaModificacao = ultimaModificacao;
		this.dataVencimento = dataVencimento;
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
	public String getDataCriacao() {
		return dataCriacao;
	}
	public String getUltimaModificacao() {
		return ultimaModificacao;
	}
	public String getDataVencimento() {
		return dataVencimento;
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
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public void setUltimaModificacao(String ultimaModificacao) {
		this.ultimaModificacao = ultimaModificacao;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}