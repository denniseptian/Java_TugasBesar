package Tugas_Besar;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DataBase {
	DataBase() {
		aplKoneksi.Database();
	}

	Integer baris;
	Koneksi aplKoneksi = new Koneksi();
	String a, b, c, d, e, f, g;

	void kondisiSave(JTextField NM, JTextField LK, JTextField JR, JTextField FK) {

		String a, b, C, D;
		a = NM.getText();
		b = JR.getText();
		C = LK.getText();
		D = FK.getText();

		try {
			if (a.equals("") || C.equals("") || b.equals("") || D.equals("")) {
				JOptionPane.showMessageDialog(null, "Data harus diisi semua!");

			} else {

				Statement st = aplKoneksi.config.getConnection()
						.createStatement();
				st.executeUpdate("insert into identitas"
						+ "(nama, lokasi, prodi, fakultas) values ('" + a
						+ "','" + C + "','" + b + "','" + D + "')");

				JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
		}
		NM.setEditable(false);
		FK.setEditable(false);
		LK.setEditable(false);
		JR.setEditable(false);
	}

	void kondisiSave(JTextField txtValue1, JTextField txtValue2,
			JTextField kursi, JTextField pintu, JTextField jendela) {

		a = txtValue1.getText();
		b = txtValue2.getText();
		c = kursi.getText();
		d = pintu.getText();
		e = jendela.getText();
		try {
			if (a.equals("") || c.equals("") || b.equals("") || d.equals("")
					|| e.equals("")) {
				JOptionPane.showMessageDialog(null, "Data harus diisi semua!");

			} else {

				Statement st = aplKoneksi.config.getConnection()
						.createStatement();
				st.executeUpdate("insert into kondisi"
						+ "(panjang, lebar, kursi, pintu, jendela) values ('"
						+ a + "','" + b + "','" + c + "','" + d + "','" + e
						+ "')");

				JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
		}
		txtValue1.setEditable(false);
		txtValue2.setEditable(false);
		kursi.setEditable(false);
		pintu.setEditable(false);
		jendela.setEditable(false);
	}

	void kondisiHapus(String Tabel, String Arrow, String id) {
		try {
			Statement st = aplKoneksi.config.getConnection().createStatement();
			st.executeUpdate(" delete from " + Tabel + " where " + Arrow
					+ " ='" + id + "'");

			JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Data gagal dihapus: " + ex);
		}
	}

}
