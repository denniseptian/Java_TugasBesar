package Tugas_Besar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Input {
	Scanner scan = new Scanner(System.in);
	data dataObject = new data();
	int luas_ruangan;
	int rasio;
	public void master_input_1(){
		dataObject.setNama_ruang(JOptionPane.showInputDialog("Masukkan Nama Ruang"));
		dataObject.setLokasi_ruang(JOptionPane.showInputDialog("Masukkan lokasi ruangan"));
		dataObject.setFakultas(JOptionPane.showInputDialog("Masukkan Nama fakultas"));
		String Panjang_ruangan = JOptionPane.showInputDialog("Masukkan panjang ruangan");
		dataObject.setPanjang_ruang(Integer.parseInt(Panjang_ruangan));
		String Lebar_ruangan = JOptionPane.showInputDialog("Masukkan Lebar Ruangan");
		dataObject.setLebar_ruang(Integer.parseInt(Lebar_ruangan));
	}
	public void master_input_2(){
		String jumlah_pintu = JOptionPane.showInputDialog("masukkan jumlah pintu");
		dataObject.setJumlah_pintu(Integer.parseInt(jumlah_pintu));
		String jumlah_cendela = JOptionPane.showInputDialog("Masukkan Jumlah cendela");
		dataObject.setJumlah_cendela(Integer.parseInt(jumlah_cendela));
	}
	public void master_input_3(){
		String jumlah_kursi = JOptionPane.showInputDialog("Masukkan jumlah kursi");
		dataObject.setJumlah_kursi(Integer.parseInt(jumlah_kursi));
	}
	public void tampil(){
		JOptionPane.showMessageDialog(null, "Nama ruang : "+dataObject.getNama_ruang()+"\nLokasi Ruang : "+dataObject.getLokasi_ruang()+"\nFakultas : "+dataObject.getLokasi_ruang()+"\nPanjang Ruang : "+dataObject.getPanjang_ruang()+"\nLebar ruangan : "+dataObject.getLebar_ruang());
	}
	public int luas_ruangan(){
		luas_ruangan = dataObject.getPanjang_ruang()*dataObject.getLebar_ruang();
		JOptionPane.showMessageDialog(null, "Luas Ruangan "+luas_ruangan);
		return luas_ruangan;
	}
	public int rasio_luas(){
		rasio = luas_ruangan/dataObject.getJumlah_kursi();
		JOptionPane.showMessageDialog(null, "Hasil rasio "+rasio);
		return rasio;
	}
	public void Pengkondisian_rasio(){
		if(rasio >= 0.5){
			JOptionPane.showMessageDialog(null, "Ruangan Sesuai");
		}
	}
	public void Penkondisian_luas(){
		if(dataObject.getPanjang_ruang()!=dataObject.getLebar_ruang()){
			JOptionPane.showMessageDialog(null, "Persegi Panjang");
			JOptionPane.showMessageDialog(null, "Hasil Sesuai");
		}
	}
	public void analisis_jumlah_cendela_dan_pintu(){
		if(dataObject.getJumlah_pintu()>=2){
			JOptionPane.showMessageDialog(null, "Jumlah pintu sesuai");
		}if(dataObject.getJumlah_cendela()>=1){
			JOptionPane.showMessageDialog(null, "Jumlah cendela sesuai");
		}
	}
	public void master_input_4(){
		String jumlah_stop_kontak = (JOptionPane.showInputDialog("Masukkan jumlah stop kontak"));
		dataObject.setStop_kontak(Integer.parseInt(jumlah_stop_kontak));
		dataObject.setKondisi_stop_kontak(JOptionPane.showInputDialog("kondisi_stop_kontak"));
		dataObject.setPosisi_stop_kontak(JOptionPane.showInputDialog("Masukkan Posisi"));
	}
	public void analisis_kelistrikan(){
		if(dataObject.getStop_kontak()>=4){
			JOptionPane.showMessageDialog(null, "Hasil jumlah stop kontak sesuai dengan ruangan");
		}if(dataObject.getKondisi_stop_kontak().equalsIgnoreCase("baik")){
			JOptionPane.showMessageDialog(null, "Keadaan stop kontak baik");
		}if(dataObject.getPosisi_stop_kontak().equalsIgnoreCase("pojok")&&dataObject.getKondisi_stop_kontak().equalsIgnoreCase("dekat dosen")){
			JOptionPane.showMessageDialog(null, "Tempat dan kondisi stop kontak Sesuai");
		}
	}
	public void master_input_5(){
		String jumlah_Kabel_lcd = (JOptionPane.showInputDialog("Masukkan jumlah Kabel LCD"));
		dataObject.setJumlah_kabel_LCD(Integer.parseInt(jumlah_Kabel_lcd));
		dataObject.setKondisi_kabel_LCD(JOptionPane.showInputDialog("kondisi_stop_kontak"));
		dataObject.setPosisi_kabel_LCD(JOptionPane.showInputDialog("Masukkan Posisi kabel LCD"));
	}
	public void pengkondisian_kabel_lcd(){
		if(dataObject.getJumlah_kabel_LCD()>=1){
			JOptionPane.showMessageDialog(null, "Jumlah kabel LCD Sesua");
		}if(dataObject.getKondisi_kabel_LCD().equalsIgnoreCase("baik")){
			JOptionPane.showMessageDialog(null, "kondisi kabel LCD sedang baik dan sesuai");
		}if(dataObject.getPosisi_kabel_LCD().equalsIgnoreCase("Pojok")){
			JOptionPane.showMessageDialog(null, "Posisi kabel LCD Sesua");
		}
	}
	public void master_input_6(){
		String Jumlah_lampu = JOptionPane.showInputDialog("Masukkan jumlah lampu");
		dataObject.setJumlah_lampu(Integer.parseInt(Jumlah_lampu));
		dataObject.setKondisi_lampu(JOptionPane.showInputDialog("Masukkan kondisi lampu"));
		dataObject.setPosisi_lampu(JOptionPane.showInputDialog("Masukkan posisi lampu"));
	}
	public void penkondisian_lampu(){
		if(dataObject.getJumlah_lampu()>=18){
			JOptionPane.showMessageDialog(null, "Jumlah lampu yang tersedia sesuai");
		}if(dataObject.getKondisi_lampu().equalsIgnoreCase("Baik")){
			JOptionPane.showMessageDialog(null, "Kondisi Lampu dalam keadaan baik");
		}
	}
	public void master_input_7(){
		String jumlah_kipas_angin = JOptionPane.showInputDialog("Masukkan jumlah kipas angin");
		dataObject.setKipas_angin(Integer.parseInt(jumlah_kipas_angin));
		dataObject.setKondisi_kipas_angin(JOptionPane.showInputDialog("Masukkan kondisi kipas angin"));
		dataObject.setPosisi_kipas_angin(JOptionPane.showInputDialog("Masukkan posisi kipas angin"));
	}
	public void pengkondisian_kipas_angin(){
		if(dataObject.getKipas_angin()>=2){
			JOptionPane.showMessageDialog(null, "Jumlah kipas angin sudah sesuai dengan yang di inginkan");
		}if(dataObject.getKondisi_kipas_angin().equalsIgnoreCase("baik")){
			JOptionPane.showMessageDialog(null, "Kondisi kipas angin sedang baik");
		}if(dataObject.getPosisi_kipas_angin().equalsIgnoreCase("atap")){
			JOptionPane.showMessageDialog(null, "posisi kipas angin sesuai dengan yang di butuhkan");
		}
	}
	public void master_input_8(){
		String jumlah_ac = JOptionPane.showInputDialog("Masukkan jumlah AC");
		dataObject.setJumlah_AC(Integer.parseInt(jumlah_ac));
		dataObject.setKondisi_AC(JOptionPane.showInputDialog("Masukkan kondisi AC"));
		dataObject.setPosisi_AC(JOptionPane.showInputDialog("Masukkan posisi AC"));
	}
	public void pendkondisian_ac(){
		if(dataObject.getJumlah_AC()>=1){
			JOptionPane.showMessageDialog(null, "Jumlah kondisi AC sesuai");
		}if(dataObject.getKondisi_AC().equalsIgnoreCase("baik")){
			JOptionPane.showMessageDialog(null, "Kondisi ac masih baik");
		}if(dataObject.getPosisi_AC().equalsIgnoreCase("belakang")||dataObject.getPosisi_AC().equalsIgnoreCase("samping")){
			JOptionPane.showMessageDialog(null, "Posisi AC pada tempat yang tepat");
		}
	}
	public void InputSSID(){
		dataObject.setSSID(JOptionPane.showInputDialog("Masukkan SSID"));
		String bandwith = JOptionPane.showInputDialog("Masukkan Bandwith");
		dataObject.setBandwith(Integer.parseInt(bandwith));
	}
	public void pengkondisian_SSID(){
		if(dataObject.getSSID().equalsIgnoreCase("UMM Hotspot")){
			JOptionPane.showMessageDialog(null, "SSID yang anda gunakan Sesuai");
		}if(dataObject.getBandwith()>=512){
			JOptionPane.showMessageDialog(null, "Anda dapat login");
		}
	}
	public void input_CCTV(){
		String jumlah_cctv = JOptionPane.showInputDialog("masukkan jumlah CCTV");
		dataObject.setCctv(Integer.parseInt(jumlah_cctv));
		dataObject.setKondisi_cctv(JOptionPane.showInputDialog("masukkan kondisi CCTV"));
		dataObject.setPosisi_cctv(JOptionPane.showInputDialog("masukkan posisi CCTV"));
	}
	public void pengkondisian_CCTV(){
		if(dataObject.getCctv()>=2){
			JOptionPane.showMessageDialog(null, "Jumlah CCTV sudah sesuai");
		}if(dataObject.getKondisi_cctv().equalsIgnoreCase("baik")){
			JOptionPane.showMessageDialog(null, "Kondisi CCTV dalam keadaan baik");
		}if(dataObject.getPosisi_cctv().equalsIgnoreCase("Depan")||dataObject.getPosisi_cctv().equalsIgnoreCase("belakang")){
			JOptionPane.showMessageDialog(null, "letak CCTV sesuai dengan apa yang di butuhkan");
		}
	}
	public void input_keadaan_kebersihan(){
		dataObject.setKondisi_lantai(JOptionPane.showInputDialog("Masukkan kondisi lantai *baik/buruk"));
		dataObject.setKondisi_dinding(JOptionPane.showInputDialog("Masukkan kondisi Dinding"));
		dataObject.setKondisi_atap(JOptionPane.showInputDialog("Masukkan kondisi atap"));
		dataObject.setKondisi_pintu(JOptionPane.showInputDialog("masukkan kondisi pintu"));
		dataObject.setKondisi_jendela(JOptionPane.showInputDialog("Masukkan kondisi jendela"));
	}
	public void pengkondisian_kebersihan(){
		if(dataObject.getKondisi_lantai().equalsIgnoreCase("bersih")&&dataObject.getKondisi_dinding().equalsIgnoreCase("bersih")&&dataObject.getKondisi_atap().equalsIgnoreCase("bersih")&&dataObject.getKondisi_pintu().equalsIgnoreCase("bersih")&&dataObject.getKondisi_jendela().equalsIgnoreCase("bersih")){
			JOptionPane.showMessageDialog(null, "Kondisi kebersihan dalam keadaan bersih");
		}else{
			JOptionPane.showMessageDialog(null, "kondisi kebersihan dalam keadaan buruk");
		}
	}
	public void input_sirkulasi_udara(){
		dataObject.setKondisi_udara(JOptionPane.showInputDialog("Masukkan kondisi udara"));
	}
	public void penkondisian_sirkulasi_udara(){
		if(dataObject.getKondisi_udara().equalsIgnoreCase("Lancar")){
			JOptionPane.showMessageDialog(null, "Kondisi Udara Lancar dan baik");
		}else{
			JOptionPane.showMessageDialog(null, "kondisi udara kurang baik");
		}
	}
	public void input_pencahayaan(){
		String pencahayaan = JOptionPane.showInputDialog("Masukkan nilai pencahayaan");
		dataObject.setCahaya(Integer.parseInt(pencahayaan));
	}
	public void penkondisian_cahaya(){
		if(dataObject.getCahaya()>=250){
			JOptionPane.showMessageDialog(null, "Kondisi cahaya dalam keadaan baik");
		}
	}
	public void input_kelembapan(){
		String Kelembapan = JOptionPane.showInputDialog("Masukkan nilai kelembapan");
		dataObject.setKelembaban(Integer.parseInt(Kelembapan));
	}
	public void pengkondisian_kelembapan(){
		if(dataObject.getKelembaban()>=70&&dataObject.getKelembaban()<=80){
			JOptionPane.showMessageDialog(null, "Kelembapan kelas ini sesuai");
		}else{
			JOptionPane.showMessageDialog(null, "Kelembapan kelas ini tidak sesuai");
		}
	}
	public void input_suhu(){
		String suhu = JOptionPane.showInputDialog("Masukkan nilai suhu");
		dataObject.setSuhu(Integer.parseInt(suhu));
	}
	public void penkondisian_suhu(){
		if(dataObject.getSuhu()>=25&&dataObject.getSuhu()<=35){
			JOptionPane.showMessageDialog(null, "Suhu ruangan Sesuai");
		}else{
			JOptionPane.showMessageDialog(null, "Suhu ruangan tidak sesuai");
		}
	}
	public void input_kebisingan(){
		dataObject.setKebisingan(JOptionPane.showInputDialog("Apakan kelasnya pada area bising"));
	}
	public void pengkondisian_kebisingan(){
		if(dataObject.getKebisingan().equalsIgnoreCase("tidak")){
			JOptionPane.showMessageDialog(null, "Kelas anda baik dan sesuai");
		}else{
			JOptionPane.showMessageDialog(null, "Sebaiknya anda pindah saja karena kelas tidak sesuai");
		}
	}
	public void input_bau(){
		dataObject.setBau(JOptionPane.showInputDialog("Apa kelas anda bau atau tidak *ya/tidak"));
	}
	public void pengkondisian_bau(){
		if(dataObject.getBau().equalsIgnoreCase("ya")){
			JOptionPane.showMessageDialog(null, "Kelas anda tidak layak di tempati karena tidak sesuai");
		}if(dataObject.getBau().equalsIgnoreCase("tidak")){
			JOptionPane.showMessageDialog(null, "Kelas cocok di terpati karena sesuai");
		}
	}
	public void input_kebpcoran(){
		dataObject.setKebocoran(JOptionPane.showInputDialog("kelas bocor atau tidak"));
	}
	public void pengkondisian_bocornya(){
		if(dataObject.getKebocoran().equalsIgnoreCase("ya")){
			JOptionPane.showMessageDialog(null, "Kelas tidak sesuai");
		}if(dataObject.getKebocoran().equalsIgnoreCase("tidak")){
			JOptionPane.showMessageDialog(null, "Kelas sesuai");
		}
	}public void input_keausan(){
		dataObject.setKeausan(JOptionPane.showInputDialog("Masukkan keausan *aus/tidak"));
	}public void pengkondisian_keausan(){
		if(dataObject.getKeausan().equalsIgnoreCase("aus")){
			JOptionPane.showMessageDialog(null, "Kelas tidak layak di pakai");
		}if(dataObject.getKeausan().equalsIgnoreCase("tidak")){
			JOptionPane.showMessageDialog(null, "Kelas layak dipakai");
		}
	}
}
