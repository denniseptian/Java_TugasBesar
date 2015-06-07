package Tugas_Besar;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DataBase {
	DataBase() {
		connection.Database();
	}

	RuangKelas ruangKelas = new RuangKelas();
	RuangKelas ruang;

	Integer baris;
	Koneksi connection = new Koneksi();

	// For Name object
	void Save(String NamaRuang, String LokasiRuang, String Prodi,
			String Fakultas) {

		try {
			if (NamaRuang.equals("") || LokasiRuang.equals("")
					|| Prodi.equals("") || Fakultas.equals("")) {
				JOptionPane.showMessageDialog(null, "Data harus diisi semua!");

			} else {

				Statement statement = connection.config.getConnection()
						.createStatement();
				statement
						.executeUpdate("insert into identitas"
						+ "(nama, lokasi, prodi, fakultas) values ('"
						+ NamaRuang + "','" + LokasiRuang + "','" + Prodi
						+ "','" + Fakultas + "')");

				JOptionPane.showMessageDialog(null, "Save Succesfull");
			}
		} catch (SQLException x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}

	}

	// for math class
	void Save(int PanjangRuang, int LebarRuang, int JumlahKursi,
			int JumlahPintu, int JumlahJendela) {
		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into kondisikelas"
							+ "(panjangruang, lebarruang, jumlahkursi, jumlahpintu, jumlahjendela) values ('"
							+ PanjangRuang + "','" + LebarRuang + "','"
							+ JumlahKursi + "','" + JumlahKursi + "','"
							+ JumlahJendela + "')");
			JOptionPane.showMessageDialog(null, "Save Succesfull");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}

	}

	// for sarana
	void Save(int JumlahStopKontak, String KondisiStopKontak,
			String PosisiStopKontak, int JumlahKabelLCD,
			String KondisiKabelLCD, String PosisiKabelLCD, int JumlahLampu,
			String KodisiLampu, String PosisiLampu, int JumlahKipasAngin,
			String KondisiKipas, String PosisiKipasAngin, int JumlahAC,
			String KondisiAC, String PosisiAC, String SSID, int Bandwith,
			int JumlahCCTV, String KondisiCCTV, String PosisiCCTV) {
		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert int sarana"
							+ "(jumlahstopkontak, kondisistopkontak, posisistopkontak, jumlahkabellcd, kondisikabellcd, posisikabellcd, jumlahlampu, kondisilampu, posisilampu, jumlahkipasangin, kondisikipasangin, posisikipasangin, jumlahac, kondisiac, posisiac, ssid, bandwith, jumlahcctv, kondisicctv, posisicctv ) values ('"
							+ JumlahStopKontak
							+ "','"
							+ KondisiStopKontak
							+ "','"
							+ PosisiStopKontak
							+ "','"
							+ JumlahKabelLCD
							+ "','"
							+ KondisiKabelLCD
							+ "','"
							+ PosisiKabelLCD
							+ "','"
							+ JumlahLampu
							+ "','"
							+ KodisiLampu
							+ "','"
							+ PosisiLampu
							+ "','"
							+ JumlahKipasAngin
							+ "','"
							+ KondisiKipas
							+ "','"
							+ PosisiKipasAngin
							+ "','"
							+ JumlahAC
							+ "','"
							+ PosisiAC
							+ "','"
							+ KondisiAC
							+ "','"
							+ SSID
							+ "','"
							+ Bandwith
							+ "','"
							+ JumlahCCTV
							+ "','"
							+ KondisiCCTV
							+ "','"
							+ PosisiCCTV + "')");
			JOptionPane.showMessageDialog(null, "Save Succesfull");
		} catch (Exception x) {
			System.out.println("Failed to saving : " + x);
		}
	}

	// for seng onok kotore
	void Save(String KondisiLantai, String KondisiDinding, String KondisiAtap,
			String KondisiPintu, String KondisiJendela) {
		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into kondisilingkungankelas"
							+ "(kondisilantai, kondisidinding, kondisiatap, kondisipintu, kondisijendela) values ('"
							+ KondisiLantai + "','" + KondisiDinding + "','"
							+ KondisiAtap + "','" + KondisiPintu + "','"
							+ KondisiJendela + "')");
			JOptionPane.showMessageDialog(null, "Save Succesfull");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}
	}

	// for kebersihan
	void Save(String SirkulasiUdara, int Pencahayaan, int Kelembapan, int Suhu) {
		try {

			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into kondisikebersihan"
							+ "(sirkulasiudara, pencahayaan, kelembapan, suhu) values ('"
							+ SirkulasiUdara + "','" + Pencahayaan + "','"
							+ Kelembapan + "','" + Suhu + "') ");
			JOptionPane.showMessageDialog(null, "Save Succesfull");

		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}
	}

	void SaveKenyamanan(String Kebisingan, String bau, String Kebocoran,
			String Kerusakan, String Keausan) {
		try {

			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into kenyamanan"
							+ "(kebisingan, bau, kebocoran, kerusakan, keausan) values ('"
							+ Kebisingan + "','" + bau + "','" + Kebocoran
							+ "','" + Kerusakan + "','" + Keausan + "')");

			JOptionPane.showMessageDialog(null, "Save Succesfull");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}
	}

	void Save(String kekokohan, String Kunci, String Bahaya) {
		try {

			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into keamanan"
					+ "(kekokohan, kunci, bahaya) values ('" + kekokohan
					+ "','" + Kunci + "','" + Bahaya + "')");

			JOptionPane.showMessageDialog(null, "Save Succesfull");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}
	}

	void kondisiHapus(String Tabel, String Arrow, String id) {
		try {
			Statement st = connection.config.getConnection().createStatement();
			st.executeUpdate(" delete from " + Tabel + " where " + Arrow
					+ " ='" + id + "'");

			JOptionPane.showMessageDialog(null, "Deleted");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to delete : " + x);
		}
	}

}
