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
    	stmt = con.prepareStatement("DELETE FROM MOTORISTAS WHERE ID_MOTORISTA = ?");
    	stmt.setInt(1, id);
    	return stmt.executeUpdate();
    }
    
    public int adicionarMotorista(Motorista objeto) throws Exception {
    	stmt = con.prepareStatement("INSERT INTO MOTORISTAS(NOME, EMAIL, TELEFONE, SENHA, NR_LOGRADOURO, CEP) VALUES (?,?,?,?,?,?)");
    	stmt.setString(1, objeto.getNome());
    	stmt.setString(2, objeto.getEmail());
    	stmt.setString(3, objeto.getTelefone());
    	stmt.setString(4, objeto.getSenha());
    	stmt.setString(5,objeto.getNumLogradouro());
    	stmt.setInt(6, objeto.getEndereco().getCep());
    	return stmt.executeUpdate(); 	
    }
    
    public int atualizarTelefone(int id, String telefone) throws Exception {
    	stmt = con.prepareStatement("UPDATE MOTORISTAS SET TELEFONE = ? WHERE ID_MOTORISTA = ?");
    	stmt.setString(1, telefone);
    	stmt.setInt(2, id);
    	return stmt.executeUpdate();
    }
    
    /*public Motorista getMotoristaById(int idMotorista) throws Exception {
    	stmt = con.prepareStatement("SELECT * FROM ENDERECOS INNER JOIN MOTORISTAS ON (TB_ENDERECO.ID = TB_MOTORISTA.FK_ENDERECO) WHERE ID = ?");*/
    public Motorista getMotoristaById(int idMotorista) throws Exception {
    	stmt = con.prepareStatement("SELECT MOTORISTAS.NOME, MOTORISTAS.EMAIL, MOTORISTAS.TELEFONE, MOTORISTAS.NR_LOGRADOURO, ENDERECOS.CEP, ENDERECOS.LOGRADOURO, ENDERECOS.CIDADE , ENDERECOS.UF, ENDERECOS.BAIRRO, ENDERECOS.COMPLEMENTO FROM MOTORISTAS INNER JOIN ENDERECOS ON ENDERECOS.CEP = MOTORISTAS.CEP WHERE ID_MOTORISTA = ?");

    	stmt.setInt(1, idMotorista);
    	rset = stmt.executeQuery();
    	Motorista objeto = new Motorista();
    	if(rset.next()) {
    		objeto.setNome(rset.getString("NOME"));
    		objeto.setEmail(rset.getString("EMAIL"));
    		objeto.setTelefone(rset.getString("TELEFONE"));
    		objeto.setNumLogradouro(rset.getString("NR_LOGRADOURO"));
    		objeto.getEndereco().setCep(rset.getInt("CEP"));
    		objeto.getEndereco().setLogradouro(rset.getString("LOGRADOURO"));
    		objeto.getEndereco().setCidade(rset.getString("CIDADE"));
    		objeto.getEndereco().setUf(rset.getString("UF"));
    		objeto.getEndereco().setBairro(rset.getString("BAIRRO"));
    		objeto.getEndereco().setComplemento(rset.getString("COMPLEMENTO"));
    	}
    	return objeto;
    }   
    
    /*public Motorista getMotorista(String nome) throws Exception {
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
    		
    	}
    	return objeto;*/
       
}
