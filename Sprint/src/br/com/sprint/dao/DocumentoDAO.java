package br.com.sprint.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.sprint.beans.Documento;
import br.com.sprint.conexao.Conexao;

public class DocumentoDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rset;
	
	public void close() throws Exception {
		con.close();
	}
	public DocumentoDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public int deletePorId(int id) throws Exception {
		stmt = con.prepareStatement("DELETE FROM TB_DOCUMENTO WHERE ID_DOCUMENTO = ?");
		stmt.setInt(1, id);
		return stmt.executeUpdate();
	}
	
	public int adicionarDocumento(Documento objeto) throws Exception {
		stmt = con.prepareStatement("INSERT INTO TB_DOCUMENTO(TIPO, URL, DT_CRIACAO, ULTIMA_MODIFICACAO, DT_VENCIMENTO) values (?,?,?,?,?)");
		stmt.setString(1, objeto.getTipo());
		stmt.setString(2, objeto.getUrl());
		stmt.setString(3, objeto.getDataCriacao());
		stmt.setString(4, objeto.getUltimaModificacao());
		stmt.setString(5, objeto.getDataVencimento());
		return stmt.executeUpdate();
	}
	
	public int atualizarVencimento(String url, String vencimento) throws Exception {
		stmt = con.prepareStatement("UPDATE TB_DOCUMENTO SET VENCIMENTO = ? WHERE URL = ?");
		stmt.setString(1, vencimento);
		stmt.setString(2, url);
		return stmt.executeUpdate();
	}
	
	public Documento getDocumento(int idDocumento) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM TB_DOCUMENTO WHERE ID_DOCUMENTO = ?");
		stmt.setInt(1, idDocumento);
		rset = stmt.executeQuery();
		Documento objeto = new Documento();
		if(rset.next()) {
			objeto.setIdDocumento(rset.getInt("ID_DOCUMENTO"));
			objeto.setTipo(rset.getString("TIPO"));
			objeto.setUrl(rset.getString("URL"));
			objeto.setDataCriacao(rset.getString("DT_CRIACAO"));
			objeto.setUltimaModificacao(rset.getString("ULTIMA_MODIFICACAO"));
			objeto.setDataVencimento(rset.getString("DT_VENCIMENTO"));
		}
		return objeto;
	}
}
