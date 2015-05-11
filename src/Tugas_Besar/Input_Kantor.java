package Tugas_Besar;

import javax.swing.JOptionPane;

public class Input_Kantor extends Input {
	@Override
	public void Input_Ruang() {

		// nama ruang
		dataObject.setFakultas(JOptionPane
				.showInputDialog("Masukkan Nama Jurusan"));
		// panjang dan lebar
		String Panjang_ruangan = JOptionPane
				.showInputDialog("Masukkan panjang ruangan");
		dataObject.setPanjang_ruang(Integer.parseInt(Panjang_ruangan));
		String Lebar_ruangan = JOptionPane
				.showInputDialog("Masukkan Lebar Ruangan");
		dataObject.setLebar_ruang(Integer.parseInt(Lebar_ruangan));
		
		// pintu dan jendela
		String jumlah_pintu = JOptionPane
				.showInputDialog("masukkan jumlah pintu");
		dataObject.setJumlah_pintu(Integer.parseInt(jumlah_pintu));
		String jumlah_cendela = JOptionPane
				.showInputDialog("Masukkan Jumlah cendela");
		dataObject.setJumlah_cendela(Integer.parseInt(jumlah_cendela));
		String jumlah_kursi = JOptionPane
				.showInputDialog("Masukkan jumlah kursi");
		dataObject.setJumlah_kursi(Integer.parseInt(jumlah_kursi));
		
		// stop kontak
		String jumlah_stop_kontak = (JOptionPane
				.showInputDialog("Masukkan jumlah stop kontak"));
		dataObject.setStop_kontak(Integer.parseInt(jumlah_stop_kontak));
		dataObject.setKondisi_stop_kontak(JOptionPane
				.showInputDialog("kondisi_stop_kontak baik/rusak"));
		dataObject.setPosisi_stop_kontak(JOptionPane
				.showInputDialog("Masukkan Posisi"));
		
		// lampu
		String Jumlah_lampu = JOptionPane
				.showInputDialog("Masukkan jumlah lampu");
		dataObject.setJumlah_lampu(Integer.parseInt(Jumlah_lampu));
		dataObject.setKondisi_lampu(JOptionPane
				.showInputDialog("Masukkan kondisi lampu"));
		dataObject.setPosisi_lampu(JOptionPane
				.showInputDialog("Masukkan posisi lampu"));

		super.Input_Ruang();
	}
}
