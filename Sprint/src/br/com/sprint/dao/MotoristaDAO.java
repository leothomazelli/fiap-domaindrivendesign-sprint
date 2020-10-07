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
    	stmt = con.prepareStatement("INSERT INTO TB_MOTORISTA(NOME, EMAIL, TELEFONE, CNH, VALIDADE_CNH, SENHA, CNPJ) VALUES (?,?,?,?,?,?,?) returning id into ?; end;");
    	stmt.setString(1, objeto.getNome());
    	stmt.setString(2, objeto.getEmail());
    	//DÚVIDA (ORDEM DE INSERÇÃO OU NÃO) >  stmt.setString(3, objeto.getEndereco().getAll());
    	stmt.setString(4, objeto.getTelefone());
    	stmt.setString(5, objeto.getSenha());
    	//DÚVIDA (=) > stmt.setString(6, objeto.getDocumentos().getAll());
    	//DÚVIDA (=) > stmt.setString(7, objeto.getOcorrencia().getAll());
    	
    	return stmt.executeUpdate();
    	
    }
    
    public int atualizarTelefone(int id, String telefone) throws Exception {
    	stmt = con.prepareStatement("UPDATE TB_MOTORISTA SET TELEFONE = ? WHERE ID = ?");
    	
    	stmt.setString(1, telefone);
    	stmt.setInt(2, id);
    	
    	return stmt.executeUpdate();
    }
    
    public Motorista getMotorista(String nome) throws Exception {
    	stmt = con.prepareStatement("select * from tb_endereco inner join tb_motorista on (tb_endereco.id = tb_motorista.fk_endereco) where nome like ?");
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