package br.com.sprint.beans;

public class Motorista {

	private int idMotorista;
	private String nome = new String();
	private String email = new String();
	private String telefone = new String();
	private String senha = new String();
	private String numLogradouro = new String();
	private Endereco endereco = new Endereco();
	private Documento documentos = new Documento();
	
	public Motorista() {}
	
	public Motorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}
	public Motorista(String nome, String email, String telefone, String senha, String numLogradouro) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.numLogradouro = numLogradouro;
	}
	public Motorista(String nome, String email, String telefone, String senha, String numLogradouro, Endereco endereco, Documento documentos) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.numLogradouro = numLogradouro;
		this.endereco = endereco;
		this.documentos = documentos;
	}
	public Motorista(int idMotorista, String nome, String email, String telefone, String senha, String numLogradouro, Endereco endereco, Documento documentos) {
		this.idMotorista = idMotorista;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.numLogradouro = numLogradouro;
		this.endereco = endereco;
		this.documentos = documentos;
	}
	
	public String getAll() {
		return idMotorista + "\n" + nome + "\n" + email + "\n" +  telefone + "\n" + senha + "\n" + numLogradouro + "\n" + endereco.getAll() + "\n" + documentos.getAll();
	}
	public void setAll(int idMotorista, String nome, String email, String telefone, String senha, String numLogradouro, Endereco endereco, Documento documentos) {
		this.idMotorista = idMotorista;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.senha = senha;
		this.numLogradouro = numLogradouro;
		this.documentos = documentos;
	}
	
	public int getIdMotorista() {
		return idMotorista;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getSenha() {
		return senha;
	}
	public String getNumLogradouro() {
		return numLogradouro;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public Documento getDocumentos() {
		return documentos;
	}
	public void setIdMotorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setNumLogradouro(String numLogradouro) {
		this.numLogradouro = numLogradouro;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setDocumentos(Documento documentos) {
		this.documentos = documentos;
	}
}
