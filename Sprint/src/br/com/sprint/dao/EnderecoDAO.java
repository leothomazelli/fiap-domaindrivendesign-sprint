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
	public int deletePorId(int id) throws Exception{
		stmt = con.prepareStatement("DELETE FROM TB_ENDERECO WHERE ID_ENDERECO = ?");
		stmt.setDouble(1, id);
		return stmt.executeUpdate();
	}
	public int adicionarEndereco(Endereco objeto) throws Exception{
		stmt = con.prepareStatement("INSERT INTO TB_ENDERECO(LOGRADOURO, CIDADE, UF, NUMERO, BAIRRO, CEP, COMPLEMENTO) VALUES(?,?,?,?,?,?,?)");
		
		stmt.setString(1, objeto.getLogradouro());
		stmt.setString(2, objeto.getCidade());
		stmt.setString(3, objeto.getUf());
		stmt.setString(4, objeto.getNumero());
		stmt.setString(5, objeto.getBairro());
		stmt.setString(6, objeto.getCep());
		stmt.setString(7, objeto.getComplemento());
		
		return stmt.executeUpdate();
	}
	public int atualizarLogradouro(String cep, String logradouro) throws Exception{
		stmt = con.prepareStatement("UPDATE TB_ENDERECO SET LOGRADOURO = ? WHERE CEP = ?");
		
		stmt.setString(1, logradouro);
		stmt.setString(2, cep);
		return stmt.executeUpdate();
	}
	
	public Endereco getEnderecoById(int idEndereco) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM TB_ENDERECO WHERE CEP = ?");
		
		stmt.setInt(1, idEndereco);
		rs = stmt.executeQuery();
		Endereco obj = new Endereco();
		if(rs.next()) {
			obj.setLogradouro(rs.getString("LOGRADOURO"));
			obj.setCidade(rs.getString("CIDADE"));
			obj.setUf(rs.getString("UF"));
			obj.setNumero(rs.getString("NUMERO"));
			obj.setBairro(rs.getString("BAIRRO"));
			obj.setCep(rs.getString("CEP"));
			obj.setIdEndereco(rs.getInt("ID_ENDERECO"));
			obj.setComplemento(rs.getString("COMPLEMENTO"));
		}
		return obj;
	}
	
	public Endereco getEndereco(String cep) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM TB_ENDERECO WHERE CEP = ?");
		
		stmt.setString(1, cep);
		rs = stmt.executeQuery();
		Endereco objeto = new Endereco();
		if(rs.next()) {
			objeto.setLogradouro(rs.getString("LOGRADOURO"));
			objeto.setCidade(rs.getString("CIDADE"));
			objeto.setUf(rs.getString("UF"));
			objeto.setNumero(rs.getString("NUMERO"));
			objeto.setBairro(rs.getString("BAIRRO"));
			objeto.setCep(rs.getString("CEP"));
			objeto.setIdEndereco(rs.getInt("ID_ENDERECO"));
			objeto.setComplemento(rs.getString("COMPLEMENTO"));
		}
		return objeto;
	}
}
