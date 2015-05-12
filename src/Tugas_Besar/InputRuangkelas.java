package Tugas_Besar;

import javax.swing.JOptionPane;

public class InputRuangkelas extends Input {
	@Override
	public void Input_Ruang(){
		//nama ruang 
		dataObject.setNama_ruang(JOptionPane.showInputDialog("Masukkan Nama Ruang"));
		dataObject.setLokasi_ruang(JOptionPane.showInputDialog("Masukkan lokasi ruangan"));
		dataObject.setFakultas(JOptionPane.showInputDialog("Masukkan Nama fakultas"));
		String Panjang_ruangan = JOptionPane.showInputDialog("Masukkan panjang ruangan");
		dataObject.setPanjang_ruang(Integer.parseInt(Panjang_ruangan));
		String Lebar_ruangan = JOptionPane.showInputDialog("Masukkan Lebar Ruangan");
		dataObject.setLebar_ruang(Integer.parseInt(Lebar_ruangan));
		//pintu dan jendela
		String jumlah_pintu = JOptionPane.showInputDialog("masukkan jumlah pintu");
		dataObject.setJumlah_pintu(Integer.parseInt(jumlah_pintu));
		String jumlah_cendela = JOptionPane.showInputDialog("Masukkan Jumlah cendela");
		dataObject.setJumlah_cendela(Integer.parseInt(jumlah_cendela));
		String jumlah_kursi = JOptionPane.showInputDialog("Masukkan jumlah kursi");
		dataObject.setJumlah_kursi(Integer.parseInt(jumlah_kursi));
	}
}
