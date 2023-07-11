package model;



import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

	public class ConexaoDao {
		public Connection conectaBD() {
			Connection conn = null;
			try {
				String url = "";
				conn = DriverManager.getConnection(url);
				
			} catch (SQLException erro) {
				JOptionPane.showMessageDialog(null,"Erro no sistema");
			}
			return conn;
			
		}

	}

