package br.com.sprint.beans;

public class Endereco {
	private String cep;
	private String logradouro = new String();
	private String cidade = new String();
	private String uf = new String();
	private String bairro = new String();
	private String complemento = new String();
	
	public Endereco() {}

	public Endereco(String cep, String logradouro, String cidade, String uf, String bairro, String complemento) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.uf = uf;
		this.bairro = bairro;
		this.complemento = complemento;
	}
	
	public String getAll() {
		return cep + "\n" + logradouro + "\n" + cidade + "\n" + uf + "\n" + bairro + "\n" + complemento;
	}
	
	public void setAll(String cep, String logradouro, String cidade, String uf, String bairro, String complemento) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.uf = uf;
		this.bairro = bairro;
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getUf() {
		return uf;
	}
	public String getBairro() {
		return bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
