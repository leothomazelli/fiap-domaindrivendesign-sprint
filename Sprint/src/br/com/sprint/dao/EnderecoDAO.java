package br.com.sprint.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.sprint.beans.Endereco;
import br.com.sprint.conexao.Conexao;

public class EnderecoDAO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public void close() throws Exception {
		con.close();
	}
	public EnderecoDAO() throws Exception{
			con = Conexao.conectar();
		}
	public int deletePorCep(String cep) throws Exception{
		stmt = con.prepareStatement("DELETE FROM ENDERECOS WHERE CEP = ?");
		stmt.setString(1, cep);
		return stmt.executeUpdate();
	}
	public int adicionarEndereco(Endereco objeto) throws Exception{
		stmt = con.prepareStatement("INSERT INTO ENDERECOS(CEP, LOGRADOURO, CIDADE, UF, BAIRRO, COMPLEMENTO) VALUES(?,?,?,?,?,?)");
		
		stmt.setString(1, objeto.getCep());
		stmt.setString(2, objeto.getLogradouro());
		stmt.setString(3, objeto.getCidade());
		stmt.setString(4, objeto.getUf());
		stmt.setString(5, objeto.getBairro());
		stmt.setString(6, objeto.getComplemento());
		return stmt.executeUpdate();
	}
	public int atualizarLogradouro(String cep, String logradouro) throws Exception{
		stmt = con.prepareStatement("UPDATE ENDERECOS SET LOGRADOURO = ? WHERE CEP = ?");
		
		stmt.setString(1, logradouro);
		stmt.setString(2, cep);
		return stmt.executeUpdate();
	}
	public Endereco getEnderecoByCep(String cep) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM ENDERECOS WHERE CEP = ?");
		
		stmt.setString(1, cep);
		rs = stmt.executeQuery();
		Endereco obj = new Endereco();
		if(rs.next()) {
			obj.setLogradouro(rs.getString("LOGRADOURO"));
			obj.setCidade(rs.getString("CIDADE"));
			obj.setUf(rs.getString("UF"));
			obj.setBairro(rs.getString("BAIRRO"));
			obj.setComplemento(rs.getString("COMPLEMENTO"));
		}
		return obj;
	}
	
	public Endereco getEndereco(String cep) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM ENDERECOS WHERE CEP = ?");
		
		stmt.setString(1, cep);
		rs = stmt.executeQuery();
		Endereco objeto = new Endereco();
		if(rs.next()) {
			objeto.setLogradouro(rs.getString("LOGRADOURO"));
			objeto.setCidade(rs.getString("CIDADE"));
			objeto.setUf(rs.getString("UF"));
			objeto.setBairro(rs.getString("BAIRRO"));
			objeto.setComplemento(rs.getString("COMPLEMENTO"));
		}
		return objeto;
	}
}
