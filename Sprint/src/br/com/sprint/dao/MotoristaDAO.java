package br.com.sprint.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.sprint.beans.Motorista;
import br.com.sprint.conexao.Conexao;

public class MotoristaDAO {
	
	private Connection con;
    private PreparedStatement stmt;
    private ResultSet rset;
    
    public MotoristaDAO() throws Exception {
    	con = Conexao.conectar();    
    }

    public void close() throws Exception {
    	con.close();
    }
    
    public int deletePorId(int id) throws Exception {
    	stmt = con.prepareStatement("DELETE FROM TB_MOTORISTA WHERE ID_MOTORISTA = ?");
    	stmt.setInt(1, id);
    	return stmt.executeUpdate();
    }
    
    public int adicionarMotorista(Motorista objeto) throws Exception {
    	stmt = con.prepareStatement("INSERT INTO TB_MOTORISTA(NOME, EMAIL, TELEFONE, SENHA) VALUES (?,?,?,?)");
    	stmt.setString(1, objeto.getNome());
    	stmt.setString(2, objeto.getEmail());
    	stmt.setString(3, objeto.getTelefone());
    	stmt.setString(4, objeto.getSenha());
    	return stmt.executeUpdate();
    	
    }
    
    public int atualizarTelefone(int id, String telefone) throws Exception {
    	stmt = con.prepareStatement("UPDATE TB_MOTORISTA SET TELEFONE = ? WHERE ID = ?");
    	stmt.setString(1, telefone);
    	stmt.setInt(2, id);
    	return stmt.executeUpdate();
    }
    
    public Motorista getMotoristaById(int idMotorista) throws Exception {
    	stmt = con.prepareStatement("SELECT * FROM TB_ENDERECO INNER JOIN TB_MOTORISTA ON (TB_ENDERECO.ID = TB_MOTORISTA.FK_ENDERECO) WHERE ID = ?");
    	stmt.setInt(1, idMotorista);
    	rset = stmt.executeQuery();
    	Motorista objeto = new Motorista();
    	if(rset.next()) {
    		objeto.setIdMotorista(rset.getInt("ID_MOTORISTA"));
    		objeto.setNome(rset.getString("NOME"));
    		objeto.setEmail(rset.getString("EMAIL"));
    		objeto.getEndereco().setLogradouro(rset.getString("LOGRADOURO"));
    		objeto.setTelefone(rset.getString("TELEFONE"));
    		objeto.setSenha(rset.getString("SENHA"));
    		objeto.getDocumentos().setUrl(rset.getString("DOCUMENTO"));
    		objeto.getOcorrencia().setIdSinistro(rset.getInt("SINISTRO_ID"));  // < DÚVIDA NOME COLUNA (COMO VAMOS PUXAR O SINISTRO PELO SELECT)
    		
    	}
    	return objeto;
    }   
    
    public Motorista getMotorista(String nome) throws Exception {
    	stmt = con.prepareStatement("SELECT * FROM TB_ENDERECO INNER JOIN TB_MOTORISTA ON (TB_ENDERECO.ID = TB_MOTORISTA.FK_ENDERECO) WHERE NOME LIKE ?");
    	stmt.setString(1, nome + "%");
    	rset = stmt.executeQuery();
    	Motorista objeto = new Motorista();
    	if(rset.next()) {
    		objeto.setIdMotorista(rset.getInt("ID_MOTORISTA"));
    		objeto.setNome(rset.getString("NOME"));
    		objeto.setEmail(rset.getString("EMAIL"));
    		objeto.getEndereco().setLogradouro(rset.getString("LOGRADOURO"));
    		objeto.setTelefone(rset.getString("TELEFONE"));
    		objeto.setSenha(rset.getString("SENHA"));
    		objeto.getDocumentos().setUrl(rset.getString("DOCUMENTO"));
    		objeto.getOcorrencia().setIdSinistro(rset.getInt("SINISTRO_ID"));  // < DÚVIDA NOME COLUNA (COMO VAMOS PUXAR O SINISTRO PELO SELECT)
    		
    	}
    	return objeto;
    }   
}
