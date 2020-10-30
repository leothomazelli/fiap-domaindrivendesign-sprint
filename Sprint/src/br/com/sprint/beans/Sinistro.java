package br.com.sprint.beans;

public class Sinistro {

	private int idSinistro;
	private String data = new String();
	private String horarioDaOcorrencia = new String();
	private String descricaoEvento = new String();
	private String descricaoDanos = new String();
	private Motorista motorista = new Motorista();

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
	public Sinistro(String data, String horarioDaOcorrencia, String descricaoEvento, String descricaoDanos, Motorista motorista) {
		this.data = data;
		this.horarioDaOcorrencia = horarioDaOcorrencia;
		this.descricaoEvento = descricaoEvento;
		this.descricaoDanos = descricaoDanos;
		this.motorista = motorista;
	}
	public Sinistro(int idSinistro, String data, String horarioDaOcorrencia, String descricaoEvento, String descricaoDanos, Motorista motorista) {
		this.idSinistro = idSinistro;
		this.data = data;
		this.horarioDaOcorrencia = horarioDaOcorrencia;
		this.descricaoEvento = descricaoEvento;
		this.descricaoDanos = descricaoDanos;
		this.motorista = motorista;
	}
	
	public String getAll() {
		return idSinistro + "\n" + data + "\n" + horarioDaOcorrencia + "\n" + descricaoEvento + "\n" + descricaoDanos + "\n" + motorista.getAll();
	}
	public void setAll(int idSinistro, String data, String horarioDaOcorrencia, String descricaoEvento, String descricaoDanos, Motorista motorista) {
		this.idSinistro = idSinistro;
		this.data = data;
		this.horarioDaOcorrencia = horarioDaOcorrencia;
		this.descricaoEvento = descricaoEvento;
		this.descricaoDanos = descricaoDanos;
		this.motorista = motorista;
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
	public Motorista getMotorista() {
		return motorista;
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
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
}
