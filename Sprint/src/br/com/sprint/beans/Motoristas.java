package br.com.sprint.beans;

public class Motoristas {

	private int idMotorista;
	private String nome = new String();
	private String email = new String();
	private String telefone = new String();
	private String senha = new String();
	private String numLogradouro = new String();
	private Enderecos endereco = new Enderecos();
	private Documentos documentos = new Documentos();
	
	public Motoristas() {}
	
	public Motoristas(int idMotorista) {
		this.idMotorista = idMotorista;
	}
	public Motoristas(String nome, String email, String telefone, String senha, String numLogradouro) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.numLogradouro = numLogradouro;
	}
	public Motoristas(String nome, String email, String telefone, String senha, String numLogradouro, Enderecos endereco, Documentos documentos) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.numLogradouro = numLogradouro;
		this.endereco = endereco;
		this.documentos = documentos;
	}
	public Motoristas(int idMotorista, String nome, String email, String telefone, String senha, String numLogradouro, Enderecos endereco, Documentos documentos) {
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
	public void setAll(int idMotorista, String nome, String email, String telefone, String senha, String numLogradouro, Enderecos endereco, Documentos documentos) {
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
	public Enderecos getEndereco() {
		return endereco;
	}
	public Documentos getDocumentos() {
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
	public void setEndereco(Enderecos endereco) {
		this.endereco = endereco;
	}
	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}
}
