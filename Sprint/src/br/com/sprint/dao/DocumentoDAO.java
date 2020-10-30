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
		stmt = con.prepareStatement("DELETE FROM DOCUMENTOS WHERE ID_DOCUMENTO = ?");
		stmt.setInt(1, id);
		return stmt.executeUpdate();
	}
	
	public int adicionarDocumento(Documento objeto) throws Exception {
		stmt = con.prepareStatement("INSERT INTO DOCUMENTOS(DOCUMENTO_MOTORISTA, ID_DOCUMENTO, TIPO, URL, ULTIMA_MODIFICACAO, DT_VENCIMENTO) values (?,?,?,?,?,?)");
		stmt.setInt(1, objeto.getMotorista().getIdMotorista());
		stmt.setInt(2, objeto.getIdDocumento());
		stmt.setString(3, objeto.getTipo());
		stmt.setString(4, objeto.getUrl());
		stmt.setString(6, objeto.getUltimaModificacao());
		stmt.setString(7, objeto.getDtVencimento());
		return stmt.executeUpdate();
	}
	
	public int atualizarDocumento(String url, String DtVencimento) throws Exception {
		stmt = con.prepareStatement("UPDATE DOCUMENTOS SET DT_VENCIMENTO = ? WHERE URL = ?");
		stmt.setString(1, DtVencimento);
		stmt.setString(2, url);
		return stmt.executeUpdate();
	}
	
	public Documento getDocumento(int idDocumento) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM DOCUMENTOS WHERE ID_DOCUMENTO = ?");
		stmt.setInt(1, idDocumento);
		rset = stmt.executeQuery();
		Documento objeto = new Documento();
		if(rset.next()) {
			objeto.setIdDocumento(rset.getInt("ID_DOCUMENTO"));
			objeto.setTipo(rset.getString("TIPO"));
			objeto.setUrl(rset.getString("URL"));
			objeto.setUltimaModificacao(rset.getString("ULTIMA_MODIFICACAO"));
			objeto.setDtVencimento(rset.getString("DT_VENCIMENTO"));
			
		}
		return objeto;
	}
}
