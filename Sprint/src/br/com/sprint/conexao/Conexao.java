package br.com.sprint.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection conectar() throws Exception {
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85977", "070598");
	}
	
}