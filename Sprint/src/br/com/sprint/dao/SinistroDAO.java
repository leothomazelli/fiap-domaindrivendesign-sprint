package br.com.sprint.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import br.com.sprint.beans.Motorista;
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
		stmt = con.prepareStatement("DELETE FROM SINISTROS WHERE ID_SINISTRO = ?");
		stmt.setInt(1, idSinistro);
		return stmt.executeUpdate();
	}
	
	public int adicionarSinistro(Sinistro objeto) throws Exception {
		stmt = con.prepareStatement("INSERT INTO SINISTROS(ID_SINISTRO, DT_SINISTRO, HR_OCORRENCIA, DESC_EVENTO, DESC_DANOS, ID_MOTORISTA) values (?,?,?,?,?,?)");
		
		
		stmt.setInt(1, objeto.getIdSinistro());
		stmt.setString(2, objeto.getData());
		stmt.setString(3, objeto.getHorarioDaOcorrencia());
		stmt.setString(4, objeto.getDescricaoEvento());
		stmt.setString(5, objeto.getDescricaoDanos());
		stmt.setInt(6, objeto.getMotorista().getIdMotorista());
		return stmt.executeUpdate();
	}
	
	
	
	public int atualizarDescricaoEvento(String descricaoEvento, int idSinistro) throws Exception {
		stmt = con.prepareStatement("UPDATE SINISTROS SET DESC_EVENTO = ? WHERE ID_SINISTRO = ?");
		stmt.setString(1, descricaoEvento);
		stmt.setInt(2, idSinistro);
		return stmt.executeUpdate();
	}
	
	public Sinistro getSinistro(int idSinistro) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM MOTORISTAS INNER JOIN SINISTROS ON (MOTORISTAS.ID_MOTORISTA = SINISTROS.ID_SINISTRO) WHERE ID_SINISTRO = ?");
		stmt.setInt(1, idSinistro);
		rset = stmt.executeQuery();
		Sinistro objeto = new Sinistro();
		MotoristaDAO motoristaDAO = new MotoristaDAO();
		if(rset.next()) {
			objeto.setIdSinistro(rset.getInt("ID_SINISTRO"));
			objeto.setData(rset.getString("DT_SINISTRO"));
			objeto.setHorarioDaOcorrencia(rset.getString("HR_OCORRENCIA"));
			objeto.setDescricaoEvento(rset.getString("DESC_EVENTO"));
			objeto.setDescricaoDanos(rset.getString("DESC_DANOS"));
			
			Motorista motorista = motoristaDAO.getMotoristaById(rset.getInt("ID_MOTORISTA"));
			
			objeto.setMotorista(motorista);
			
			/*String dataRecebida = "23/11/2015";
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

			Date dataFormatada = formato.parse(dataRecebida);
			Date data = formato.parse("23/11/2015");
			objeto.setData(data);*/
		}
		motoristaDAO.close();
		return objeto;
	}
}
