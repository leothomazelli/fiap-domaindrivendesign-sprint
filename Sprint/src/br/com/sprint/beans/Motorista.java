package br.com.sprint.beans;

public class Motorista {

	private int idMotorista;
	private String nome = new String();
	private String email = new String();
	private Endereco endereco = new Endereco();
	private String telefone = new String();
	private String senha = new String();
	private Documento documentos = new Documento();
	private Sinistro ocorrencia = new Sinistro();
	
	public Motorista() {}
	
	public Motorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}
	public Motorista(String nome, String email, String telefone, String senha) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}
	public Motorista(String nome, String email, Endereco endereco, String telefone, String senha, Documento documentos, Sinistro ocorrencia) {
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.senha = senha;
		this.documentos = documentos;
		this.ocorrencia = ocorrencia;
	}
	public Motorista(int idMotorista, String nome, String email, Endereco endereco, String telefone, String senha, Documento documentos, Sinistro ocorrencia) {
		this.idMotorista = idMotorista;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.senha = senha;
		this.documentos = documentos;
		this.ocorrencia = ocorrencia;
	}
	
	public String getAll() {
		return idMotorista + "\n" + nome + "\n" + email + "\n" + endereco.getAll() + "\n" + telefone + "\n" + senha + "\n" + documentos.getAll() + "\n" + ocorrencia.getAll();
	}
	public void setAll(int idMotorista, String nome, String email, Endereco endereco, String telefone, String senha, Documento documentos, Sinistro ocorrencia) {
		this.idMotorista = idMotorista;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.senha = senha;
		this.documentos = documentos;
		this.ocorrencia = ocorrencia;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getSenha() {
		return senha;
	}
	public Documento getDocumentos() {
		return documentos;
	}
	public Sinistro getOcorrencia() {
		return ocorrencia;
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
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setDocumentos(Documento documentos) {
		this.documentos = documentos;
	}
	public void setOcorrencia(Sinistro ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
}