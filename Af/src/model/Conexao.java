package model;

import java.sql.*;

public class Conexao {
	private String host;
	private String usuario;
	private String senha;
	private String banco;

	public Conexao() {
		this.host = "localhost:127.0.0.1";
		this.banco = "af_tecnicas_de_programacao"; 
		this.usuario = "root";
		this.senha = "";
	}

	public Connection getConexao() {
		String url="jdbc:mysql://" + this.host + "/" + this.banco+"?verifyServerCertificate=false&useSSL=true";
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException ex) {
			System.out.println("Conexão com MYSQL não realizada");
			ex.printStackTrace();
		}
		return null;
	}
}
