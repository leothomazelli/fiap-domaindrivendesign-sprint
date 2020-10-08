package br.com.sprint.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.sprint.beans.Sinistro;
import br.com.sprint.conexao.Conexao;

public class SinistroDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rset;
	
	public void close() throws Exception {
		con.close();
	}
	public SinistroDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public int deletePorId(int idSinistro) throws Exception {
		stmt = con.prepareStatement("DELETE FROM TB_SINISTRO WHERE ID_SINISTRO = ?");
		stmt.setInt(1, idSinistro);
		return stmt.executeUpdate();
	}
	
	public int adicionarSinistro(Sinistro objeto) throws Exception {
		stmt = con.prepareStatement("INSERT INTO TB_SINISTRO(DATA, HR_OCORRENCIA, DESC_EVENTO, DESC_DANOS) values (?,?,?,?)");
		stmt.setString(1, objeto.getData());
		stmt.setString(2, objeto.getHorarioDaOcorrencia());
		stmt.setString(3, objeto.getDescricaoEvento());
		stmt.setString(4, objeto.getDescricaoDanos());
		//DÚVIDA (ORDEM DE INSERÇÃO OU NÃO) > stmt.setString(5, objeto.getDocumentosMotorista().getUrl());
		return stmt.executeUpdate();
	}
	
	public int atualizarDescricaoEvento(String descricaoEvento, int idSinistro) throws Exception {
		stmt = con.prepareStatement("UPDATE TB_SINISTRO SET DESC_EVENTO = ? WHERE ID_SINISTRO = ?");
		stmt.setString(1, descricaoEvento);
		stmt.setInt(2, idSinistro);
		return stmt.executeUpdate();
	}
	
	public Sinistro getSinistro(int idSinistro) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM TB_DOCUMENTO INNER JOIN TB_SINISTRO ON (TB_DOCUMENTO.ID_DOCUMENTO = TB_SINISTRO.DOCUMENTO_FK) WHERE ID_SINISTRO = ?");
		stmt.setInt(1, idSinistro);
		rset = stmt.executeQuery();
		Sinistro objeto = new Sinistro();
		if(rset.next()) {
			objeto.setIdSinistro(rset.getInt("ID_SINISTRO"));
			objeto.setData(rset.getString("DATA"));
			objeto.setHorarioDaOcorrencia(rset.getString("HR_OCORRENCIA"));
			objeto.setDescricaoEvento(rset.getString("DESC_EVENTO"));
			objeto.setDescricaoDanos(rset.getString("DESC_DANOS"));
			objeto.getDocumentosMotorista().setUrl(rset.getString("URL"));
		}
		return objeto;
	}
}
