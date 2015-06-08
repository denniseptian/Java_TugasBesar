package Tugas_Besar;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;

public class Analisis {
	// Input InputObject = new Input();
	Output OutputObject = new Output();
	RuangKelas ruangKelasObject = new RuangKelas();
	DataBase dataBase = new DataBase();
	RuangKelas RuangKelasOfObject;

	public Analisis() {

	}

	public RuangKelas getRuangKelas() {
		return RuangKelasOfObject;
	}

	int Kesesuaian = 0;
	private int Luas;
	private double Rasio;

	public double getLuas() {
		return Luas;
	}

	public void setLuas(int luas) {
		Luas = luas;
	}

	public double getRasio() {
		return Rasio;
	}

	public void setRasio(double rasio) {
		Rasio = rasio;
	}

	public double KondisiRuang(int PanjangRuang, int LebarRuang,
			int JumlahKursi, int JumlahPintu, int JumlahJendela) {

		String BentukRuang;
		String KondisiRasio;
		String KondisiJendela;
		String KondisiPintu;

		Luas = PanjangRuang * LebarRuang;
		if (PanjangRuang != LebarRuang) {
			BentukRuang = "PersegiPanjang";

		} else {
			BentukRuang = "Kubus";
		}
		Rasio = Luas / JumlahKursi;
		if (Rasio >= 0.5) {
			KondisiRasio = "Sesuai";
			Kesesuaian++;
		} else {
			KondisiRasio = "Tidak Sesuai ";
		}
		if (JumlahJendela >= 1) {
			KondisiJendela = "Sesuai";
			Kesesuaian++;
		} else {
			KondisiJendela = "Tidak Sesuai";
		}
		if (JumlahPintu >= 2) {
			KondisiPintu = "Sesuai";
			Kesesuaian++;
		} else {
			KondisiPintu = "Tidak Sesuai";
		}

		dataBase.save(Luas);
		dataBase.save(BentukRuang, KondisiRasio, KondisiPintu, KondisiJendela);

		return Kesesuaian;

	}

	double Sarana(int JumlahStopKontak, String KondisiStopKontak,
			String PosisiStopKontak, int JumlahKabelLcd,
			String KondisiKabelLcd, String PosisiKabelLcd, int JumlahLampu,
			String KondisiLampu, String PosisiLampu, int JumlahKipasAngin,
			String KondisiKipasAngin, String PosisiKipasAngin, int JumlahAc,
			String KondisiAc, String PosisiAc, String SSID, int Bandwith,
			int JumlahCCTV, String KondidiCCTV, String PosisiCCTV) {

		String PengkondisianJumlahStopKontak;
		String PengkondisianKondisiStopKontak;
		String PengkondisianPosisiStopKontak;
		String PengkondisianJumlahKabelLcd;
		String PengkondisianKondisiKabelLcd;
		String PengkondisianPosisiKabelLcd;
		String PengkondisianJumlahLampu;
		String PengkondisianKondisiLampu;
		String PengkondisianPosisiLampu;
		String PengkondisianJumlahKipasAngin;
		String PengkondisianKondisiKipasAngin;
		String PengkondisianPosisiKipasAngin;
		String PengkondisianJumlahAc;
		String PengkondisianKondisiAc;
		String PengkondisianPosisiAc;
		String PengkondisianSSID;
		String PengkondisianBandwith;
		String PengkondisianJumlahCCTV;
		String PengkondisianKondidiCCTV;
		String PengkondisianPosisiCCTV;

		if (JumlahStopKontak >= 4) {
			PengkondisianJumlahStopKontak = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianJumlahStopKontak = "Tidak Sesuai";
		}
		if (KondisiStopKontak.equalsIgnoreCase("Baik")) {
			PengkondisianKondisiStopKontak = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianKondisiStopKontak = "Tidak Sesuai";
		}
		if (PosisiStopKontak.equalsIgnoreCase("Pojok Dekat Dosen")) {
			PengkondisianPosisiStopKontak = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianPosisiStopKontak = "Tidak Sesuai";
		}
		if (JumlahKabelLcd >= 1) {
			PengkondisianJumlahKabelLcd = "Sesuai";
			Kesesuaian++;

		} else {
			PengkondisianJumlahKabelLcd = "Tidak Sesuai";
		}
		if (KondisiKabelLcd.equalsIgnoreCase("baik")) {
			PengkondisianKondisiKabelLcd = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianKondisiKabelLcd = "Tidak Sesuai";
		}
		if (PosisiKabelLcd.equalsIgnoreCase("pojok dekat dosen")) {
			PengkondisianPosisiKabelLcd = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianPosisiKabelLcd = "Tidak Sesuai";
		}
		if (JumlahLampu >= 18) {
			PengkondisianJumlahLampu = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianJumlahLampu = "Tidak Sesuai";
		}
		if (KondisiLampu.equalsIgnoreCase("baik")) {
			PengkondisianKondisiLampu = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianKondisiLampu = "Sesuai";
		}
		if (PosisiLampu.equalsIgnoreCase("atap")) {
			PengkondisianPosisiLampu = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianPosisiLampu = "Tidak Sesuai";
		}
		if (JumlahKipasAngin >= 2) {
			PengkondisianJumlahKipasAngin = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianJumlahKipasAngin = "Tidak Sesuai";
		}
		if (PosisiKipasAngin.equalsIgnoreCase("dinding atas")) {
			PengkondisianPosisiKipasAngin = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianPosisiKipasAngin = "Tidak Sesuai";
		}
		if (KondisiKipasAngin.equalsIgnoreCase("baik")) {
			PengkondisianKondisiKipasAngin = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianKondisiKipasAngin = "Tidak Sesuai";
		}
		if (JumlahAc >= 1) {
			PengkondisianJumlahAc = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianJumlahAc = "Tidak Sesuai";
		}
		if (KondisiAc.equalsIgnoreCase("baik")) {
			PengkondisianKondisiAc = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianKondisiAc = "Tidak Sesuai";
			Kesesuaian++;
		}
		if (PosisiAc.equalsIgnoreCase("Dinding Atas")) {
			PengkondisianPosisiAc = "sesuai";
			Kesesuaian++;
		} else {
			PengkondisianPosisiAc = "Tidak sesuai";
		}
		if (SSID.equalsIgnoreCase("umm hotspot")) {
			PengkondisianSSID = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianSSID = "Tidak Sesuai";
		}
		if (Bandwith >= 512) {
			PengkondisianBandwith = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianBandwith = "Tidak Sesuai";
		}
		if (JumlahCCTV >= 2) {
			PengkondisianJumlahCCTV = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianJumlahCCTV = "Tidak Sesuai";
		}
		if (KondidiCCTV.equalsIgnoreCase("baik")) {
			PengkondisianKondidiCCTV = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianKondidiCCTV = "Tidak Sesuai";
		}
		if (PosisiCCTV.equalsIgnoreCase("Dinding Atas")) {
			PengkondisianPosisiCCTV = "Sesuai";
			Kesesuaian++;
		} else {
			PengkondisianPosisiCCTV = "Sesuai";
		}

		dataBase.save(PengkondisianJumlahStopKontak,
				PengkondisianKondisiStopKontak, PengkondisianPosisiStopKontak,
				PengkondisianJumlahKabelLcd, PengkondisianKondisiKabelLcd,
				PengkondisianPosisiKabelLcd, PengkondisianJumlahLampu,
				PengkondisianKondisiLampu, PengkondisianPosisiLampu,
				PengkondisianJumlahKipasAngin, PengkondisianKondisiKipasAngin,
				PengkondisianPosisiKipasAngin, PengkondisianJumlahAc,
				PengkondisianKondisiAc, PengkondisianPosisiAc,
				PengkondisianSSID, PengkondisianBandwith,
				PengkondisianJumlahCCTV, PengkondisianKondidiCCTV,
				PengkondisianPosisiCCTV);

		return Kesesuaian;
	}

	double LingkunganKelas(String KondisiLantai, String KondisiDinding,
			String KondisiAtap, String KondisiPintu, String KondisiJendela) {

		String PengkondisianKondisiLantai;
		String PengkondisianKondisiDinding;
		String PengkondisianKondisiAtap;
		String PengkondisianKondisiPintu;
		String PengkondisianKondisiJendela;

		if (KondisiLantai.equalsIgnoreCase("Bersih")) {
			PengkondisianKondisiLantai = "Sesuai";
		} else {
			PengkondisianKondisiLantai = "Tidak Sesuai";
		}
		if (KondisiDinding.equalsIgnoreCase("Besih")) {
			PengkondisianKondisiDinding = "Sesuai";
		} else {
			PengkondisianKondisiDinding = "Tidak Sesuai";
		}
		if (KondisiAtap.equalsIgnoreCase("Besih")) {
			PengkondisianKondisiAtap = "Sesuai";
		} else {
			PengkondisianKondisiAtap = "Tidak Sesuai";
		}
		if (KondisiPintu.equalsIgnoreCase("Bersih")) {
			PengkondisianKondisiPintu = "Sesuai";
		} else {
			PengkondisianKondisiPintu = "Tidak Sesuai";
		}
		if (KondisiJendela.equalsIgnoreCase("Bersih")) {
			PengkondisianKondisiJendela = "Bersih";
		} else {
			PengkondisianKondisiJendela = "Bersih";
		}

		dataBase.save(PengkondisianKondisiLantai, PengkondisianKondisiDinding,
				PengkondisianKondisiAtap, PengkondisianKondisiPintu,
				PengkondisianKondisiJendela);

		return Kesesuaian;
	}

	double KebersihanRuangKelas(String SirkulasiUdara, int Pencahayaan,
			int Kelembapan, int Suhu) {

		String PengkondisianSrikulasiUdara;
		String PengkondisianPencahayaan;
		String PengkondisianKelembapan;
		String PengkondisianSuhu;

		if (SirkulasiUdara.equalsIgnoreCase("Baik")) {
			PengkondisianSrikulasiUdara = "Sesuai";
		} else {
			PengkondisianSrikulasiUdara = "Sesuai";
		}
		if (Pencahayaan >= 25 && Pencahayaan <= 35) {
			PengkondisianPencahayaan = "Sesuai";
		} else {
			PengkondisianPencahayaan = "Tidak Sesuai";
		}
		if (Kelembapan >= 70 && Kelembapan <= 80) {
			PengkondisianKelembapan = "Sesuai";
		} else {
			PengkondisianKelembapan = "Tidak Sesuai";
		}
		if (Suhu >= 25 && Suhu <= 35) {
			PengkondisianSuhu = "Sesuai";
		} else {
			PengkondisianSuhu = "Tidak Sesuai";
		}

		dataBase.saveKebersihan(PengkondisianSrikulasiUdara,
				PengkondisianPencahayaan, PengkondisianKelembapan,
				PengkondisianSuhu);

		return Kesesuaian;
	}

	double kenyamanan(String Kebisingan, String Bau, String Kebocoran,
			String Kerusakan, String Keausan) {

		String PengondisianKebisingan;
		String PengondisianBau;
		String PengondisianKebocoran;
		String PengondisianKerusakan;
		String PengondisianKeausan;

		if (Kebisingan.equalsIgnoreCase("tidak bising")) {
			PengondisianKebisingan = "Sesuai";
			Kesesuaian++;
		} else {
			PengondisianKebisingan = "Tidak Sesuai";
		}
		if (Bau.equalsIgnoreCase("tidak bau")) {
			PengondisianBau = "Sesuai";
			Kesesuaian++;
		} else {
			PengondisianBau = "Tidak Sesuai";
		}
		if (Kebocoran.equalsIgnoreCase("tidak bocor")) {
			PengondisianKebocoran = "Sesuai";
			Kesesuaian++;
		} else {
			PengondisianKebocoran = "Tidak Sesuai";
		}
		if (Kerusakan.equalsIgnoreCase("tidak rusak")) {
			PengondisianKerusakan = "Sesuai";
		} else {
			PengondisianKerusakan = "Tidak Sesuai";
		}
		if (Keausan.equalsIgnoreCase("tidak aus")) {
			PengondisianKeausan = "Sesuai";
		} else {
			PengondisianKeausan = "Tidak Sesuai";
		}

		dataBase.SaveKenyamanan(PengondisianKebisingan, PengondisianBau,
				PengondisianKebocoran, PengondisianKerusakan,
				PengondisianKeausan);

		return Kesesuaian;
	}

	void keamanan(String Kekokohan, String Kunci, String Bahaya) {

		String PengondisianKekokohan;
		String PengondisianKunci;
		String PengondisianBahaya;

		if (Kekokohan.equalsIgnoreCase("kokoh")) {
			PengondisianKekokohan = "Sesuai";
			Kesesuaian++;
		} else {
			PengondisianKekokohan = "Tidak sesuai";
		}
		if (Kunci.equalsIgnoreCase("ada")) {
			PengondisianKunci = "Sesuai";
		} else {
			PengondisianKunci = "tidak sesuai";
		}
		if (Bahaya.equalsIgnoreCase("tidak bahaya")) {
			PengondisianBahaya = "Sesuai";
		} else {
			PengondisianBahaya = "Tidak sesuai";
		}

		dataBase.save(PengondisianKekokohan, PengondisianKunci,
				PengondisianBahaya);

	}

}
