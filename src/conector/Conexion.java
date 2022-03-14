package conector;

import java.sql.*;

public class Conexion {
	/*
	 * Aunque me dejo poder hacerlo a totalidad en Java aca intente hacer cosas que
	 * vi por internet, ya sea paginas o tutoriales en yt, fue un intento de
	 * conectar JAVA con la Base de Datos lo dejo para mostrar el intento fallidos.
	 * De los errores se aprende
	 */

	/*
	 * Actualizacion: Termine haciendo un MAIN sin conectarme a la BD asi que esto
	 * no lo use, pero se intento
	 */

	private String nombreBD = "administracion_alumno_curso";
	private String driver = "com.mysql.jdbc.Driver";
	private String usuario = "root";
	private String password = "";
	private String url = "jdbc:mysql://localhost:3306/administracion_alumno_curso";

	Connection conn = null;

	public Conexion() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);
			if (conn != null) {
				System.out.println("Conexion exitosa a la BD:" + nombreBD);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ocurre una ClassNotFoundExceptio" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Ocurre una SQLException" + e.getMessage());
		}
	}

//Por lo que entendi, este metodo nos retorna a la conexion entre Java y la BD	
	public Connection getConnection() {
		return conn;
	}

//Y con este metodo me estaria desconectando	
	public void desconectar() {
		conn = null;
		if (conn == null) {
			System.out.println("Desconectado");
		}
	}
}
