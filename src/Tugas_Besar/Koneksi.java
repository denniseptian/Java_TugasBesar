package Tugas_Besar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import koneksi.SettingUI;

/**
 *
 * @author Deny SQP
 */
public class Koneksi {

	public SettingUI config = new SettingUI(null, true);

	public void Database() {
		config.setServer("localhost");
		config.setUser("root");
		config.setPassword("");
		config.setDatabase("dataKelas");
		config.makeConnect();
	}

	private Connection connect;
	private String driverName = "com.mysql.jdbc.Driver";
	private String jdbc = "jdbc:mysql://";
	private String host = "localhost:";
	private String port = "3306/";
	private String database = "dataKelas";
	private String url = jdbc + host + port + database;
	private String username = "root";
	private String password = "";

	public Connection getKoneksi() throws SQLException {
		if (connect == null) {
			try {
				Class.forName(driverName);
				System.out.println("Class Driver Ditemukan");
				try {
					connect = DriverManager.getConnection(url, username,
							password);
					System.out.println("Koneksi Database Sukses");
				} catch (SQLException se) {
					System.out.println("Koneksi Database Gagal : " + se);
					System.exit(0);
				}
			} catch (ClassNotFoundException cnfe) {
				System.out
						.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : "
								+ cnfe);
				System.exit(0);
			}
		}
		return connect;
	}

	public static void main(String[] args) throws SQLException {
		Koneksi connection = new Koneksi();
		connection.getKoneksi();
	}
}
