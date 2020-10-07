package br.com.sprint.beans;

public class Endereco {
	
	private String logradouro = new String();
	private String cidade = new String();
	private String uf = new String();
	private String numero = new String();
	private String bairro = new String();
	private String cep = new String();
	private int idEndereco;
	private String complemento = new String();
	
	public Endereco() {}
	
	public Endereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public Endereco(String logradouro, String cidade, String uf, String numero, String bairro, String cep, String complemento) {
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.uf = uf;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.complemento = complemento;
	}
	
	public Endereco(String logradouro, String cidade, String uf, String numero, String bairro, String cep, int idEndereco, String complemento) {
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.uf = uf;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.idEndereco = idEndereco;
		this.complemento = complemento;
	}
	
	public String getAll() {
		return logradouro + "\n" + cidade + "\n" + uf + "\n" + numero + "\n" + bairro + "\n" + cep + "\n" + idEndereco + "\n" + complemento;
	}
	
	public void setAll(String logradouro, String cidade, String uf, String numero, String bairro, String cep, int idEndereco, String complemento) {
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.uf = uf;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.idEndereco = idEndereco;
		this.complemento = complemento;
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
	public String getNumero() {
		return numero;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCep() {
		return cep;
	}
	public int getIdEndereco() {
		return idEndereco;
	}
	public String getComplemento() {
		return complemento;
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
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}