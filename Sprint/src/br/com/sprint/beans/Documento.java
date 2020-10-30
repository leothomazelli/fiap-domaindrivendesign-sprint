package br.com.sprint.beans;

public class Documento {

	private int idDocumento;
	private String tipo = new String();
	private String url = new String();
	private String ultimaModificacao = new String();
	private String dtVencimento = new String();
	private Motorista motorista = new Motorista();
	private Sinistro sinistro = new Sinistro();
	
	public Documento() {}
	
	public Documento(int idDocumento) {
		this.idDocumento = idDocumento;
	}
	public Documento(String tipo, String url, String ultimaModificacao, String dtVencimento) {
		this.tipo = tipo;
		this.url = url;
		this.ultimaModificacao = ultimaModificacao;
		this.dtVencimento = dtVencimento;
	}
	public Documento(int idDocumento, String tipo, String url, String ultimaModificacao, String dtVencimento, Motorista motorista, Sinistro sinistro) {
		this.idDocumento = idDocumento;
		this.tipo = tipo;
		this.url = url;
		this.ultimaModificacao = ultimaModificacao;
		this.dtVencimento = dtVencimento;
		this.motorista = motorista;
		this.sinistro = sinistro;
	}
	public String getAll() {
		return idDocumento + "\n" + tipo + "\n" + url + "\n" + ultimaModificacao + "\n" + dtVencimento;
	}
	public void setAll(int idDocumento, String tipo, String url, String ultimaModificacao, String dtVencimento, Motorista motorista, Sinistro sinistro) {
		this.idDocumento = idDocumento;
		this.tipo = tipo;
		this.url = url;
		this.ultimaModificacao = ultimaModificacao;
		this.dtVencimento = dtVencimento;
		this.motorista = motorista;
		this.sinistro = sinistro;
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
	public Motorista getMotorista() {
		return motorista;
	}
	public Sinistro getSinistro() {
		return sinistro;
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
	public void setDtVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public void setSinistro(Sinistro sinistro) {
		this.sinistro = sinistro;
	}
}
