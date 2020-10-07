package br.com.sprint.beans;

public class Sinistro {

	private int idSinistro;
	private String data = new String();
	private String horarioDaOcorrencia = new String();
	private String descricaoEvento = new String();
	private String descricaoDanos = new String();
	private Documento documentosMotorista = new Documento();
	
	public Sinistro() {}
	
	public Sinistro(int idSinistro) {
		this.idSinistro = idSinistro;
	}
	public Sinistro(String data, String horarioDaOcorrencia, String descricaoEvento, String descricaoDanos) {
		this.data = data;
		this.horarioDaOcorrencia = horarioDaOcorrencia;
		this.descricaoEvento = descricaoEvento;
		this.descricaoDanos = descricaoDanos;
	}
	public Sinistro(String data, String horarioDaOcorrencia, String descricaoEvento, String descricaoDanos, Documento documentosMotorista) {
		this.data = data;
		this.horarioDaOcorrencia = horarioDaOcorrencia;
		this.descricaoEvento = descricaoEvento;
		this.descricaoDanos = descricaoDanos;
		this.documentosMotorista = documentosMotorista;
	}
	public Sinistro(int idSinistro, String data, String horarioDaOcorrencia, String descricaoEvento, String descricaoDanos, Documento documentosMotorista) {
		this.idSinistro = idSinistro;
		this.data = data;
		this.horarioDaOcorrencia = horarioDaOcorrencia;
		this.descricaoEvento = descricaoEvento;
		this.descricaoDanos = descricaoDanos;
		this.documentosMotorista = documentosMotorista;
	}
	
	public String getAll() {
		return idSinistro + "\n" + data + "\n" + horarioDaOcorrencia + "\n" + descricaoEvento + "\n" + descricaoDanos + "\n" + documentosMotorista.getAll();
	}
	public void setAll(int idSinistro, String data, String horarioDaOcorrencia, String descricaoEvento, String descricaoDanos, Documento documentosMotorista) {
		this.idSinistro = idSinistro;
		this.data = data;
		this.horarioDaOcorrencia = horarioDaOcorrencia;
		this.descricaoEvento = descricaoEvento;
		this.descricaoDanos = descricaoDanos;
		this.documentosMotorista = documentosMotorista;
	}
	
	public int getIdSinistro() {
		return idSinistro;
	}
	public String getData() {
		return data;
	}
	public String getHorarioDaOcorrencia() {
		return horarioDaOcorrencia;
	}
	public String getDescricaoEvento() {
		return descricaoEvento;
	}
	public String getDescricaoDanos() {
		return descricaoDanos;
	}
	public Documento getDocumentosMotorista() {
		return documentosMotorista;
	}
	public void setIdSinistro(int idSinistro) {
		this.idSinistro = idSinistro;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setHorarioDaOcorrencia(String horarioDaOcorrencia) {
		this.horarioDaOcorrencia = horarioDaOcorrencia;
	}
	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	public void setDescricaoDanos(String descricaoDanos) {
		this.descricaoDanos = descricaoDanos;
	}
	public void setDocumentosMotorista(Documento documentosMotorista) {
		this.documentosMotorista = documentosMotorista;
	}
}