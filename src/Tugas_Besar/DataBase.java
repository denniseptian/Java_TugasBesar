package Tugas_Besar;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/*** CRUD START WOOOYY ***/

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
				statement.executeUpdate("insert into identitas"
						+ "(nama, lokasi, prodi, fakultas) values ('"
						+ NamaRuang + "','" + LokasiRuang + "','" + Prodi
						+ "','" + Fakultas + "')");

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
					.executeUpdate("insert into sarana"
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

			
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}
	}

	void Save(String kekokohan, String Kunci, String Bahaya) {
		try {

			Statement statement = connection.config.getConnection()
					.createStatement();
			statement.executeUpdate("insert into keamanan"
					+ "(kekokohan, kunci, bahaya) values ('" + kekokohan
					+ "','" + Kunci + "','" + Bahaya + "')");

			
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}
	}

	void save(int luas) {
		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement.executeUpdate("insert into luasruangan"
					+ "(luas) values ('" + luas + "')");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}

	}

	void save(String BentukRuang, String KondisiRasio, String KondisiPintu,
			String KondisiJendela) {
		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into pengkondisianruang"
							+ "(bentukruang, kondisijendela, kondisipintu, kondisirasio) values ('"
							+ BentukRuang + "','" + KondisiJendela + "','"
							+ KondisiPintu + "','" + KondisiRasio + "')");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}

	}

	void save(String PengkondisianJumlahStopKontak,
			String PengkondisianKondisiStopKontak,
			String PengkondisianPosisiStopKontak,
			String PengkondisianJumlahKabelLcd,
			String PengkondisianKondisiKabelLcd,
			String PengkondisianPosisiKabelLcd,
			String PengkondisianJumlahLampu, String PengkondisianKondisiLampu,
			String PengkondisianPosisiLampu,
			String PengkondisianJumlahKipasAngin,
			String PengkondisianKondisiKipasAngin,
			String PengkondisianPosisiKipasAngin, String PengkondisianJumlahAc,
			String PengkondisianKondisiAc, String PengkondisianPosisiAc,
			String PengkondisianSSID, String PengkondisianBandwith,
			String PengkondisianJumlahCCTV, String PengkondisianKondidiCCTV,
			String PengkondisianPosisiCCTV) {

		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into pengkondisiansarana"
							+ "(pengkondisianjumlahstopkontak, pengkondisiankondisistopkontak, pengkondisianposisistopkontak, pengkondisianjumlahkabellcd, pengkondisiankondisikabellcd, pengkondisianposisikabellcd, pengkondisianjumlahlampu, pengkondisiankondisilampu, pengkondisianposisilampu, pengkondisianjumlahkipasangin, pengkondsiankondsikipasangin, pengkondisianposisikipasangin, pengkondisianjumlahac, pengkondisiakondisiac, pengkondisianposisiac, pengkondisianssid, pengkondisianbandwith, pengkondisianjumlahcctv, pengkondisiankondisicctv, pengkondisianposisicctv) values ('"
							+ PengkondisianJumlahStopKontak
							+ "','"
							+ PengkondisianKondisiStopKontak
							+ "','"
							+ PengkondisianPosisiStopKontak
							+ "','"
							+ PengkondisianJumlahKabelLcd
							+ "','"
							+ PengkondisianKondisiKabelLcd
							+ "','"
							+ PengkondisianPosisiKabelLcd
							+ "','"
							+ PengkondisianJumlahLampu
							+ "','"
							+ PengkondisianKondisiLampu
							+ "','"
							+ PengkondisianPosisiLampu
							+ "','"
							+ PengkondisianJumlahKipasAngin
							+ "','"
							+ PengkondisianKondisiKipasAngin
							+ "','"
							+ PengkondisianPosisiKipasAngin
							+ "','"
							+ PengkondisianJumlahAc
							+ "','"
							+ PengkondisianKondisiAc
							+ "','"
							+ PengkondisianPosisiAc
							+ "','"
							+ PengkondisianSSID
							+ "','"
							+ PengkondisianBandwith
							+ "','"
							+ PengkondisianJumlahCCTV
							+ "','"
							+ PengkondisianKondidiCCTV
							+ "','"
							+ PengkondisianPosisiCCTV + "')");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}

	}

	void save(String PengkondisianKondisiLantai,
			String PengkondisianKondisiDinding,
			String PengkondisianKondisiAtap, String PengkondisianKondisiPintu,
			String PengkondisianKondisiJendela) {

		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into pengkondisianlingkungankelas"
							+ "(pengkondisiankondisilantai, pengkondisiankondisidinding, pengkondisiankondisiatap, pengkondisiankondisipintu, pengkondisiankondisijendela) values ('"
							+ PengkondisianKondisiLantai + "','"
							+ PengkondisianKondisiDinding + "','"
							+ PengkondisianKondisiAtap + "','"
							+ PengkondisianKondisiPintu + "','"
							+ PengkondisianKondisiJendela + "')");

		} catch (Exception x) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}

	}

	void saveKebersihan(String PengkondisianSrikulasiUdara,
			String PengkondisianPencahayaan, String PengkondisianKelembapan,
			String PengkondisianSuhu) {

		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into pengkondisiankebersihan"
							+ "(pengkondisiansirkulasiudara, pengkondisianpencahayaan, pengkondisiankelembapan, pengkondisiansuhu) values ('"
							+ PengkondisianSrikulasiUdara + "','"
							+ PengkondisianPencahayaan + "','"
							+ PengkondisianKelembapan + "','"
							+ PengkondisianSuhu + "')");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}

	}

	void saveKenyamanan(String PengondisianKebisingan, String PengondisianBau,
			String PengondisianKebocoran, String PengondisianKerusakan,
			String PengondisianKeausan) {

		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into pengondisiankenyamanan"
							+ "(pengondisiankebisingan, pengondisianbau, pengondisiankebocoran, pengondisiankerusakan, pengondisiankeausan) values ('"
							+ PengondisianKebisingan + "','" + PengondisianBau
							+ "','" + PengondisianKebocoran + "','"
							+ PengondisianKerusakan + "','"
							+ PengondisianKeausan + "')");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}

	}

	void save(String Kekokohan, String Kunci, String Bahaya) {

		try {
			Statement statement = connection.config.getConnection()
					.createStatement();
			statement
					.executeUpdate("insert into pengondisiankeaman"
							+ "(pengondisiankekokohan, pengondisiankunci, pengondisianbahaya) values ('"
							+ Kekokohan + "','" + Kunci + "','" + Bahaya + "')");
		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Failed to saving : " + x);
		}

	}

	void Delete(String Tabel, String Arrow, String id) {
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
