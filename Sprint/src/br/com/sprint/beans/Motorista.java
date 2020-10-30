package br.com.sprint.beans;

public class Motorista {

	private int idMotorista;
	private String nome = new String();
	private String email = new String();
	private String telefone = new String();
	private String senha = new String();
	private String numLogradouro = new String();
	private Endereco endereco = new Endereco();
	
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
	public Motorista(String nome, String email, String telefone, String senha, String numLogradouro, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.numLogradouro = numLogradouro;
		this.endereco = endereco;
	}
	public Motorista(int idMotorista, String nome, String email, String telefone, String senha, String numLogradouro, Endereco endereco) {
		this.idMotorista = idMotorista;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.numLogradouro = numLogradouro;
		this.endereco = endereco;
	}
	
	public String getAll() {
		return idMotorista + "\n" + nome + "\n" + email + "\n" +  telefone + "\n" + senha + "\n" + numLogradouro + "\n" + endereco.getAll();
	}
	public void setAll(int idMotorista, String nome, String email, String telefone, String senha, String numLogradouro, Endereco endereco) {
		this.idMotorista = idMotorista;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.senha = senha;
		this.numLogradouro = numLogradouro;
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
}
