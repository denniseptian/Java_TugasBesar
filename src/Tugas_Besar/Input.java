package Tugas_Besar;

import java.util.Scanner;

import javafx.scene.control.Spinner;

import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Input extends Master {
	RuangKelas RuangKelasObject = new RuangKelas();
	Analisis analisis = new Analisis();
	DataBase dataBase = new DataBase();
	RuangKelas Ruang;
	Scanner scan = new Scanner(System.in);

	public RuangKelas getRuangKelas() {
		return Ruang;
	}

	public Input() {

	}

	public void inputKenyamanan() {

	}

	public void input(String NamaRuang, String LokasiRuang, String Jurusan,
			String Fakultas) {

		RuangKelasObject.setNamaRuang(NamaRuang);
		RuangKelasObject.setLokasiRuang(LokasiRuang);
		RuangKelasObject.setProgramStudi(Jurusan);
		RuangKelasObject.setFakultas(Fakultas);

		Ruang = new RuangKelas(RuangKelasObject.getNamaRuang(),
				RuangKelasObject.getLokasiRuang(),
				RuangKelasObject.getProgramStudi(),
				RuangKelasObject.getFakultas());

		dataBase.Save(RuangKelasObject.getNamaRuang(),
				RuangKelasObject.getLokasiRuang(),
				RuangKelasObject.getProgramStudi(),
				RuangKelasObject.getFakultas());

	}

	public void input(int panjang, int lebar, int JumlahKursi, int JumlahPintu,
			int JumlahJendela) {

		RuangKelasObject.setPanjangRuang(panjang);
		RuangKelasObject.setLebarRuang(lebar);
		RuangKelasObject.setJumlahKursi(JumlahKursi);
		RuangKelasObject.setJumlahPintu(JumlahPintu);
		RuangKelasObject.setJumlahJendela(JumlahJendela);

		Ruang = new RuangKelas(RuangKelasObject.getPanjangRuang(),
				RuangKelasObject.getLebarRuang(),
				RuangKelasObject.getJumlahKursi(),
				RuangKelasObject.getJumlahPintu(),
				RuangKelasObject.getJumlahJendela());
		dataBase.Save(RuangKelasObject.getPanjangRuang(),
				RuangKelasObject.getLebarRuang(),
				RuangKelasObject.getJumlahKursi(),
				RuangKelasObject.getJumlahPintu(),
				RuangKelasObject.getJumlahJendela());
		analisis.KondisiRuang(RuangKelasObject.getPanjangRuang(),
				RuangKelasObject.getLebarRuang(),
				RuangKelasObject.getJumlahKursi(),
				RuangKelasObject.getJumlahPintu(),
				RuangKelasObject.getJumlahJendela());

	}

	public void input(int JumlahStopKontak, String KondisiStopKontak,
			String PosisiStopKontak, int JumlahKabelLCD,
			String KondisiKabelLCD, String PosisiKabelLCD, int JumlahLampu,
			String KondisiLampu, String PosisiLampu, int JumlahKipasAngin,
			String KondisiKipas, String PosisiKipasAngin, int JumlahAC,
			String KondisiAC, String PosisiAC, String SSID, int Bandwith,
			int JumlahCCTV, String KondisiCCTV, String PosisiCCTV) {

		RuangKelasObject.setJumlahStopKontak(JumlahStopKontak);
		RuangKelasObject.setKondisiStopKontak(KondisiStopKontak);
		RuangKelasObject.setPosisiStopKontak(PosisiStopKontak);
		RuangKelasObject.setJumlahKabelLCD(JumlahKabelLCD);
		RuangKelasObject.setKondisiKabelLCD(KondisiKabelLCD);
		RuangKelasObject.setPosisiKabelLCD(PosisiKabelLCD);
		RuangKelasObject.setJumlahLampu(JumlahLampu);
		RuangKelasObject.setKondisiLampu(KondisiLampu);
		RuangKelasObject.setPosisiLampu(PosisiLampu);
		RuangKelasObject.setJumlahKipasAngin(JumlahKipasAngin);
		RuangKelasObject.setKondisiKipasAngin(KondisiKipas);
		RuangKelasObject.setPosisiKipasAngin(PosisiKipasAngin);
		RuangKelasObject.setJumlahAC(JumlahAC);
		RuangKelasObject.setKondisiAC(KondisiAC);
		RuangKelasObject.setPosisiAC(PosisiAC);
		RuangKelasObject.setSSID(SSID);
		RuangKelasObject.setBandwidth(Bandwith);
		RuangKelasObject.setJumlahCCTV(JumlahCCTV);
		RuangKelasObject.setKondisiCCTV(KondisiCCTV);
		RuangKelasObject.setPosisiCCTV(PosisiCCTV);

		Ruang = new RuangKelas(RuangKelasObject.getJumlahStopKontak(),
				RuangKelasObject.getKondisiStopKontak(),
				RuangKelasObject.getPosisiStopKontak(),
				RuangKelasObject.getJumlahKabelLCD(),
				RuangKelasObject.getKondisiKabelLCD(),
				RuangKelasObject.getPosisiKabelLCD(),
				RuangKelasObject.getJumlahLampu(),
				RuangKelasObject.getKondisiLampu(),
				RuangKelasObject.getPosisiLampu(),
				RuangKelasObject.getJumlahKipasAngin(),
				RuangKelasObject.getKondisiKipasAngin(),
				RuangKelasObject.getPosisiKipasAngin(),
				RuangKelasObject.getJumlahAC(),
				RuangKelasObject.getKondisiAC(),
				RuangKelasObject.getPosisiAC(), RuangKelasObject.getSSID(),
				RuangKelasObject.getBandwidth(),
				RuangKelasObject.getJumlahCCTV(),
				RuangKelasObject.getKondisiCCTV(),
				RuangKelasObject.getPosisiCCTV());

		dataBase.Save(RuangKelasObject.getJumlahStopKontak(),
				RuangKelasObject.getKondisiStopKontak(),
				RuangKelasObject.getPosisiStopKontak(),
				RuangKelasObject.getJumlahKabelLCD(),
				RuangKelasObject.getKondisiKabelLCD(),
				RuangKelasObject.getPosisiKabelLCD(),
				RuangKelasObject.getJumlahLampu(),
				RuangKelasObject.getKondisiLampu(),
				RuangKelasObject.getPosisiLampu(),
				RuangKelasObject.getJumlahKipasAngin(),
				RuangKelasObject.getKondisiKipasAngin(),
				RuangKelasObject.getPosisiKipasAngin(),
				RuangKelasObject.getJumlahAC(),
				RuangKelasObject.getKondisiAC(),
				RuangKelasObject.getPosisiAC(), RuangKelasObject.getSSID(),
				RuangKelasObject.getBandwidth(),
				RuangKelasObject.getJumlahCCTV(),
				RuangKelasObject.getKondisiCCTV(),
				RuangKelasObject.getPosisiCCTV());

		analisis.Sarana(RuangKelasObject.getJumlahStopKontak(),
				RuangKelasObject.getKondisiStopKontak(),
				RuangKelasObject.getPosisiStopKontak(),
				RuangKelasObject.getJumlahKabelLCD(),
				RuangKelasObject.getKondisiKabelLCD(),
				RuangKelasObject.getPosisiKabelLCD(),
				RuangKelasObject.getJumlahLampu(),
				RuangKelasObject.getKondisiLampu(),
				RuangKelasObject.getPosisiLampu(),
				RuangKelasObject.getJumlahKipasAngin(),
				RuangKelasObject.getKondisiKipasAngin(),
				RuangKelasObject.getPosisiKipasAngin(),
				RuangKelasObject.getJumlahAC(),
				RuangKelasObject.getKondisiAC(),
				RuangKelasObject.getPosisiAC(), RuangKelasObject.getSSID(),
				RuangKelasObject.getBandwidth(),
				RuangKelasObject.getJumlahCCTV(),
				RuangKelasObject.getKondisiCCTV(),
				RuangKelasObject.getPosisiCCTV());
	}

	public void inputKenyamanan(String KondisiLantai, String KondisiDinding,
			String KondisiAtap, String KondisiPintu, String KondisiJendela) {

		RuangKelasObject.setKondisiLantai(KondisiLantai);
		RuangKelasObject.setKondisiDinding(KondisiDinding);
		RuangKelasObject.setKondisiAtap(KondisiAtap);
		RuangKelasObject.setKondisiPintu(KondisiPintu);
		RuangKelasObject.setKondisiJendela(KondisiJendela);

		Ruang = new RuangKelas(RuangKelasObject.getKondisiLantai(),
				RuangKelasObject.getKondisiDinding(),
				RuangKelasObject.getKondisiAtap(),
				RuangKelasObject.getKondisiPintu(),
				RuangKelasObject.getKondisiJendela());

		dataBase.Save(RuangKelasObject.getKondisiLantai(),
				RuangKelasObject.getKondisiDinding(),
				RuangKelasObject.getKondisiAtap(),
				RuangKelasObject.getKondisiPintu(),
				RuangKelasObject.getKondisiJendela());
		analisis.LingkunganKelas(RuangKelasObject.getKondisiLantai(),
				RuangKelasObject.getKondisiDinding(),
				RuangKelasObject.getKondisiAtap(),
				RuangKelasObject.getKondisiPintu(),
				RuangKelasObject.getKondisiJendela());
	}

	public void input(String SirkulasiUdara, int Pencahayaan, int Kelembapan,
			int Suhu) {

		RuangKelasObject.setSirkulasiUdara(SirkulasiUdara);
		RuangKelasObject.setNilaiPencahayaan(Pencahayaan);
		RuangKelasObject.setKelembaban(Kelembapan);
		RuangKelasObject.setSuhu(Suhu);

		Ruang = new RuangKelas(RuangKelasObject.getSirkulasiUdara(),
				RuangKelasObject.getNilaiPencahayaan(),
				RuangKelasObject.getKelembaban(), RuangKelasObject.getSuhu());

		dataBase.Save(RuangKelasObject.getSirkulasiUdara(),
				RuangKelasObject.getNilaiPencahayaan(),
				RuangKelasObject.getKelembaban(), RuangKelasObject.getSuhu());

		analisis.KebersihanRuangKelas(RuangKelasObject.getSirkulasiUdara(),
				RuangKelasObject.getNilaiPencahayaan(),
				RuangKelasObject.getKelembaban(), RuangKelasObject.getSuhu());

	}

	public void input(String Kebisingan, String Bau, String Kebocoran,
			String Kerusakan, String Keausan) {

		RuangKelasObject.setKebisingan(Kebisingan);
		RuangKelasObject.setBau(Bau);
		RuangKelasObject.setKebocoran(Kebocoran);
		RuangKelasObject.setKerusakan(Kerusakan);
		RuangKelasObject.setKeausan(Keausan);

		Ruang = new RuangKelas(RuangKelasObject.getKebisingan(),
				RuangKelasObject.getBau(), RuangKelasObject.getKebocoran(),
				RuangKelasObject.getKerusakan(), RuangKelasObject.getKeausan());

		dataBase.SaveKenyamanan(RuangKelasObject.getKebisingan(),
				RuangKelasObject.getKebisingan(),
				RuangKelasObject.getKebocoran(),
				RuangKelasObject.getKerusakan(), RuangKelasObject.getKeausan());

		analisis.kenyamanan(RuangKelasObject.getKebisingan(),
				RuangKelasObject.getKebisingan(),
				RuangKelasObject.getKebocoran(),
				RuangKelasObject.getKerusakan(), RuangKelasObject.getKeausan());
	}

	public void input(String Kekokohan, String Kunci, String Bahaya) {

		RuangKelasObject.setKekokohan(Kekokohan);
		RuangKelasObject.setKunciPintuJendela(Kunci);
		RuangKelasObject.setBahaya(Bahaya);

		Ruang = new RuangKelas(RuangKelasObject.getKekokohan(),
				RuangKelasObject.getKunciPintuJendela(),
				RuangKelasObject.getBahaya());

		dataBase.Save(RuangKelasObject.getKekokohan(),
				RuangKelasObject.getKunciPintuJendela(),
				RuangKelasObject.getBahaya());

		analisis.keamanan(RuangKelasObject.getKekokohan(),
				RuangKelasObject.getKunciPintuJendela(),
				RuangKelasObject.getBahaya());
	}

	/** End of new side **/

	void NamaKelas() {
		Header("Input Kelas");
		System.out.println("Masukkan Nama Ruang : ");
		RuangKelasObject.setNamaRuang(scan.nextLine());
		System.out.println("Masukkan Lokasi Ruang : ");
		RuangKelasObject.setLokasiRuang(scan.nextLine());
		System.out.println("Masukkan Program Study : ");
		RuangKelasObject.setProgramStudi(scan.nextLine());
		System.out.println("Masukkan Fakultas : ");
		RuangKelasObject.setFakultas(scan.nextLine());

		Ruang = new RuangKelas(RuangKelasObject.getNamaRuang(),
				RuangKelasObject.getLokasiRuang(),
				RuangKelasObject.getProgramStudi(),
				RuangKelasObject.getFakultas());
	}

	void KondisiRuang() {
		Header("Kondisi Ruang");
		System.out.println("Masukkan Panjang Ruang : ");
		RuangKelasObject.setPanjangRuang(scan.nextInt());
		System.out.println("Masukkan Lebar Ruang : ");
		RuangKelasObject.setLebarRuang(scan.nextInt());
		System.out.println("Masukkan Jumlah Kursi : ");
		RuangKelasObject.setJumlahKursi(scan.nextInt());
		System.out.println("Masukkan Jumlah Pintu : ");
		RuangKelasObject.setJumlahPintu(scan.nextInt());
		System.out.println("Masukkan Jumlah Jendela : ");
		RuangKelasObject.setJumlahJendela(scan.nextInt());
		Ruang = new RuangKelas(RuangKelasObject.getPanjangRuang(),
				RuangKelasObject.getLebarRuang(),
				RuangKelasObject.getJumlahKursi(),
				RuangKelasObject.getJumlahPintu(),
				RuangKelasObject.getJumlahKursi());
	}

	void Sarana() {
		Header("Kondisi Sarana");
		System.out.println("Masukkan Jumlah Stop Kontak : ");
		RuangKelasObject.setJumlahStopKontak(scan.nextInt());
		System.out.println("Masukkan Kondisi Stop Kontak : ");
		RuangKelasObject.setKondisiStopKontak(scan.next());
		System.out.println("Masukkan Posisi Stop Kontak : ");
		RuangKelasObject.setPosisiStopKontak(scan.next());
		System.out.println("Masukkan Jumlah Kabel LCD : ");
		RuangKelasObject.setJumlahKabelLCD(scan.nextInt());
		System.out.println("Masukkan Kondisi Kabel LCD : ");
		RuangKelasObject.setKondisiKabelLCD(scan.next());
		System.out.println("Masukkan Posisi Kabel LCD : ");
		RuangKelasObject.setPosisiKabelLCD(scan.next());
		System.out.println("Masukkan Jumlah Lampu : ");
		RuangKelasObject.setJumlahLampu(scan.nextInt());
		System.out.println("Masukkan Kondisi Lampu : ");
		RuangKelasObject.setKondisiLampu(scan.next());
		System.out.println("Masukkan Posisi Lampu : ");
		RuangKelasObject.setPosisiLampu(scan.next());
		System.out.println("Masukkan Jumlah Kipas Angin : ");
		RuangKelasObject.setJumlahKipasAngin(scan.nextInt());
		System.out.println("Masukkan Kondisi Kipas Angin : ");
		RuangKelasObject.setKondisiKipasAngin(scan.next());
		System.out.println("Masukkan Posisi Kipas Angin : ");
		RuangKelasObject.setPosisiKipasAngin(scan.next());
		System.out.println("Masukkan Jumlah AC : ");
		RuangKelasObject.setJumlahAC(scan.nextInt());
		System.out.println("Masukkan Kondisi AC : ");
		RuangKelasObject.setKondisiAC(scan.next());
		System.out.println("Masukkan Posisi AC : ");
		RuangKelasObject.setPosisiAC(scan.next());
		System.out.println("Masukkan SSID : ");
		RuangKelasObject.setSSID(scan.next());
		System.out.println("Masukkan Bandwidth : ");
		RuangKelasObject.setBandwidth(scan.nextInt());
		System.out.println("Masukkan Jumlah CCTV : ");
		RuangKelasObject.setJumlahCCTV(scan.nextInt());
		System.out.println("Masukkan Kondisi CCTV : ");
		RuangKelasObject.setKondisiCCTV(scan.next());
		System.out.println("Masukkan Posisi CCTV : ");
		RuangKelasObject.setPosisiCCTV(scan.next());
		Ruang = new RuangKelas(RuangKelasObject.getJumlahStopKontak(),
				RuangKelasObject.getKondisiStopKontak(),
				RuangKelasObject.getPosisiStopKontak(),
				RuangKelasObject.getJumlahKabelLCD(),
				RuangKelasObject.getKondisiKabelLCD(),
				RuangKelasObject.getPosisiKabelLCD(),
				RuangKelasObject.getJumlahLampu(),
				RuangKelasObject.getKondisiLampu(),
				RuangKelasObject.getPosisiLampu(),
				RuangKelasObject.getJumlahKipasAngin(),
				RuangKelasObject.getKondisiKipasAngin(),
				RuangKelasObject.getPosisiKipasAngin(),
				RuangKelasObject.getJumlahAC(),
				RuangKelasObject.getKondisiAC(),
				RuangKelasObject.getPosisiAC(), RuangKelasObject.getSSID(),
				RuangKelasObject.getBandwidth(),
				RuangKelasObject.getJumlahCCTV(),
				RuangKelasObject.getKondisiCCTV(),
				RuangKelasObject.getPosisiCCTV());
	}

	void KondisiKelas() {
		Header("Kondisi Kelas");
		System.out.println("Masukkan Kondisi Lantai : ");
		RuangKelasObject.setKondisiLantai(scan.next());
		System.out.println("Masukkan Kondisi Dinding : ");
		RuangKelasObject.setKondisiDinding(scan.next());
		System.out.println("Masukkan Kondisi Atap : ");
		RuangKelasObject.setKondisiAtap(scan.next());
		System.out.println("Masukkan Kondisi Pintu : ");
		RuangKelasObject.setKondisiPintu(scan.next());
		System.out.println("Masukkan Kondisi Jendela : ");
		RuangKelasObject.setKondisiJendela(scan.next());
		Ruang = new RuangKelas(RuangKelasObject.getKondisiLantai(),
				RuangKelasObject.getKondisiDinding(),
				RuangKelasObject.getKondisiAtap(),
				RuangKelasObject.getKondisiPintu(),
				RuangKelasObject.getKondisiJendela());
	}

	void Kebersihan() {
		Header("Kondisi Kebersihan");
		System.out.println("Masukkan Sirkulasi Udara: ");
		RuangKelasObject.setSirkulasiUdara(scan.next());
		System.out.println("Masukkan Nilai Pencahayaan : ");
		RuangKelasObject.setNilaiPencahayaan(scan.nextInt());
		System.out.println("Masukkan Kelembaban (%) : ");
		RuangKelasObject.setKelembaban(scan.nextInt());
		System.out.println("Masukkan Suhu (celcius) : ");
		RuangKelasObject.setSuhu(scan.nextInt());
		Ruang = new RuangKelas(RuangKelasObject.getSirkulasiUdara(),
				RuangKelasObject.getNilaiPencahayaan(),
				RuangKelasObject.getKelembaban(), RuangKelasObject.getSuhu());
	}

	void Kenyamanan() {
		Header("Kondisi Kenyamanan");
		System.out.println("Masukkan Kebisingan : ");
		RuangKelasObject.setKebisingan(scan.next());
		System.out.println("Masukkan Bau : ");
		RuangKelasObject.setBau(scan.next());
		System.out.println("Masukkan Kebocoran : ");
		RuangKelasObject.setKebocoran(scan.next());
		System.out.println("Masukkan Kerusakan : ");
		RuangKelasObject.setKerusakan(scan.next());
		System.out.println("Masukkan Keausan : ");
		RuangKelasObject.setKeausan(scan.next());
		Ruang = new RuangKelas(RuangKelasObject.getKebisingan(),
				RuangKelasObject.getBau(), RuangKelasObject.getKebocoran(),
				RuangKelasObject.getKerusakan(), RuangKelasObject.getKeausan());

	}

	void Keamanan() {
		Header("Kondisi Keamanan");
		System.out.println("Masukkan Kekokohan : ");
		RuangKelasObject.setKekokohan(scan.next());
		System.out.println("Masukkan Kunci Pintu dan Jendela : ");
		RuangKelasObject.setKunciPintuJendela(scan.next());
		System.out.println("Masukkan Bahaya : ");
		RuangKelasObject.setBahaya(scan.next());
		Ruang = new RuangKelas(RuangKelasObject.getKekokohan(),
				RuangKelasObject.getKunciPintuJendela(),
				RuangKelasObject.getBahaya());
	}

}
