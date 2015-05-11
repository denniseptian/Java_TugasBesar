package Tugas_Besar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Input {
	data dataObject = new data();
	public void Input_Ruang(){
		Scanner scan = new Scanner(System.in);
		/*//nama ruang
		System.out.println("Masukkan nama ruang");
		dataObject.setNama_ruang(scan.nextLine());
		System.out.println("Masukkan lokasi ruang");
		dataObject.setLokasi_ruang(scan.nextLine());
		System.out.println("Masukkan Nama fakultas");
		dataObject.setFakultas(scan.nextLine());
		scan.close()*/
		dataObject.setNama_ruang(JOptionPane.showInputDialog("Masukkan Nama Ruang"));
		dataObject.setLokasi_ruang(JOptionPane.showInputDialog("Masukkan lokasi ruangan"));
		dataObject.setFakultas(JOptionPane.showInputDialog("Masukkan Nama fakultas"));
		//panjang dan lebar
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
		//stop kontak
		String jumlah_stop_kontak = (JOptionPane.showInputDialog("Masukkan jumlah stop kontak"));
		dataObject.setStop_kontak(Integer.parseInt(jumlah_stop_kontak));
		dataObject.setKondisi_stop_kontak(JOptionPane.showInputDialog("kondisi_stop_kontak baik/rusak"));
		dataObject.setPosisi_stop_kontak(JOptionPane.showInputDialog("Masukkan Posisi"));
		//lcd
		String jumlah_Kabel_lcd = (JOptionPane.showInputDialog("Masukkan jumlah Kabel LCD"));
		dataObject.setJumlah_kabel_LCD(Integer.parseInt(jumlah_Kabel_lcd));
		dataObject.setKondisi_stop_kontak(JOptionPane.showInputDialog("kondisi_stop_kontak"));
		dataObject.setPosisi_kabel_LCD(JOptionPane.showInputDialog("Masukkan Posisi kabel LCD"));
		//lampu
		String Jumlah_lampu = JOptionPane.showInputDialog("Masukkan jumlah lampu");
		dataObject.setJumlah_lampu(Integer.parseInt(Jumlah_lampu));
		dataObject.setKondisi_lampu(JOptionPane.showInputDialog("Masukkan kondisi lampu"));
		dataObject.setPosisi_lampu(JOptionPane.showInputDialog("Masukkan posisi lampu"));
		//kipas angin
		String jumlah_kipas_angin = JOptionPane.showInputDialog("Masukkan jumlah kipas angin");
		dataObject.setKipas_angin(Integer.parseInt(jumlah_kipas_angin));
		String KondisiKipasAngin = (JOptionPane.showInputDialog("Masukkan kondisi kipas angin"));
		if(KondisiKipasAngin.equalsIgnoreCase("baik")){
			dataObject.setKondisi_kipas_angin(true);
		}if(KondisiKipasAngin.equalsIgnoreCase("rusak")){
			dataObject.setKondisi_kipas_angin(false);
		}
		dataObject.setPosisi_kipas_angin(JOptionPane.showInputDialog("Masukkan posisi kipas angin"));
		//ac
		String jumlah_ac = JOptionPane.showInputDialog("Masukkan jumlah AC");
		dataObject.setJumlah_AC(Integer.parseInt(jumlah_ac));
		String KondisiAC = (JOptionPane.showInputDialog("Masukkan kondisi AC"));
		if(KondisiAC.equalsIgnoreCase("baik")){
			dataObject.setKondisi_AC(true);
		}if(KondisiAC.equalsIgnoreCase("rusak")){
			dataObject.setKondisi_AC(false);
		}
		dataObject.setPosisi_AC(JOptionPane.showInputDialog("Masukkan posisi AC"));
		//SSID
		dataObject.setSSID(JOptionPane.showInputDialog("Masukkan SSID"));
		String bandwith = JOptionPane.showInputDialog("Masukkan Bandwith");
		dataObject.setBandwith(Integer.parseInt(bandwith));
		String jumlah_cctv = JOptionPane.showInputDialog("masukkan jumlah CCTV");
		dataObject.setCctv(Integer.parseInt(jumlah_cctv));
		String KondisiCCTV = (JOptionPane.showInputDialog("masukkan kondisi CCTV"));
		if(KondisiCCTV.equalsIgnoreCase("baik")){
			dataObject.setKondisi_cctv(true);
		}if(KondisiCCTV.equalsIgnoreCase("rusak")){
			dataObject.setKondisi_cctv(false);
		}
		dataObject.setPosisi_cctv(JOptionPane.showInputDialog("masukkan posisi CCTV"));
		String KondisiLantai = (JOptionPane.showInputDialog("Masukkan kondisi lantai *baik/buruk"));
		if(KondisiLantai.equalsIgnoreCase("baik")){
			dataObject.setKondisi_lantai(true);
		}if(KondisiLantai.equalsIgnoreCase("rusak")){
			dataObject.setKondisi_pintu(false);
		}
		String KondisiDinding = (JOptionPane.showInputDialog("Masukkan kondisi Dinding"));
		if(KondisiDinding.equalsIgnoreCase("Baik")){
			dataObject.setKondisi_dinding(true);
		}if(KondisiDinding.equalsIgnoreCase("rusak")){
			dataObject.setKondisi_dinding(false);
		}
		String KondisiAtap = (JOptionPane.showInputDialog("Masukkan kondisi atap"));
		if(KondisiAtap.equalsIgnoreCase("baik")){
			dataObject.setKondisi_atap(true);
		}if(KondisiAtap.equalsIgnoreCase("rusak")){
			dataObject.setKondisi_atap(false);
		}
		String KondisiPintu = (JOptionPane.showInputDialog("masukkan kondisi pintu"));
		if(KondisiPintu.equalsIgnoreCase("baik")){
			dataObject.setKondisi_pintu(true);
		}if(KondisiPintu.equalsIgnoreCase("rusak")){
			dataObject.setKondisi_pintu(false);
		}
		String kondisiJendela = (JOptionPane.showInputDialog("Masukkan kondisi jendela"));
		if(kondisiJendela.equalsIgnoreCase("baik")){
			dataObject.setKondisi_jendela(true);
		}if(kondisiJendela.equalsIgnoreCase("rusak")){
			dataObject.setKondisi_jendela(false);
		}
		String KondisiUdara = (JOptionPane.showInputDialog("Masukkan kondisi udara"));
		if(KondisiUdara.equalsIgnoreCase("baik")){
			dataObject.setKondisi_udara(true);
		}if(KondisiUdara.equalsIgnoreCase("Jelek")){
			dataObject.setKondisi_udara(false);
		}
		String pencahayaan = JOptionPane.showInputDialog("Masukkan nilai pencahayaan");
		dataObject.setCahaya(Integer.parseInt(pencahayaan));
		String Kelembapan = JOptionPane.showInputDialog("Masukkan nilai kelembapan");
		dataObject.setKelembaban(Integer.parseInt(Kelembapan));
		String suhu = JOptionPane.showInputDialog("Masukkan nilai suhu");
		dataObject.setSuhu(Integer.parseInt(suhu));
		String Kebisingan = (JOptionPane.showInputDialog("Apakan kelasnya pada area bising"));
		if(Kebisingan.equalsIgnoreCase("tidak")){
			dataObject.setKebisingan(true);
		}if(Kebisingan.equalsIgnoreCase("ya")){
			dataObject.setKebisingan(false);
		}
		String Bau = (JOptionPane.showInputDialog("Apa kelas anda bau atau tidak *ya/tidak"));
		if(Bau.equalsIgnoreCase("tidak")){
			dataObject.setBau(true);
		}if(Bau.equalsIgnoreCase("ya")){
			dataObject.setBau(false);
		}
		String Kebocoran = (JOptionPane.showInputDialog("kelas bocor atau tidak"));
		if(Kebocoran.equalsIgnoreCase("tidak")){
			dataObject.setKebocoran(true);
		}if(Kebocoran.equalsIgnoreCase("ya")){
			dataObject.setKebocoran(false);
		}
		String Keausan = (JOptionPane.showInputDialog("Masukkan keausan *aus/tidak"));
		if(Keausan.equalsIgnoreCase("tidak")){
			dataObject.setKeausan(true);
		}if(Keausan.equalsIgnoreCase("ya")){
			dataObject.setKeausan(false);
		}
		
		scan.close();
	}
}
