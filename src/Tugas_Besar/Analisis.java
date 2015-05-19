package Tugas_Besar;

public class Analisis extends Master {
	Input InputObject = new Input();
	Output OutputObject = new Output();
	RuangKelas ruangKelasObject = new RuangKelas();

	public Analisis() {

	}

	int Kesesuaian = 0;
	private double Luas;
	private double Rasio;

	public double getLuas() {
		return Luas;
	}

	public void setLuas(double luas) {
		Luas = luas;
	}

	public double getRasio() {
		return Rasio;
	}

	public void setRasio(double rasio) {
		Rasio = rasio;
	}

	double Luas() {
		Luas = ruangKelasObject.getPanjangRuang()
				* ruangKelasObject.getLebarRuang();
		return Luas;
	}

	@Override
	void Header(String Masukan) {

	}

	@Override
	void KondisiRuang() {

		if (ruangKelasObject.getPanjangRuang() != ruangKelasObject
				.getLebarRuang()) {
			System.out.println("Bentuk Ruangan Persegi panjang");
			System.out.println("Ruangan Sesuai");
		} else {
			System.out.println("Bentuk Ruangan Tidak Persegi panjang");
			System.out.println("Ruangan Sesuai");
		}
		Rasio = Luas / ruangKelasObject.getJumlahKursi();
		if (Rasio >= 0.5) {
			System.out.println("Rasio Ruangan Sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Rasio Ruangan Tidak Sesuai");
		}
		if (ruangKelasObject.getJumlahJendela() >= 1) {
			System.out.println("Jumlah Cendela Sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Jumlah Jendela tidak sesuai");
		}
		if (ruangKelasObject.getJumlahPintu() >= 2) {
			System.out.println("Jumlah Pintu sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Jumlah Pintu tidak sesuai");
		}
		OutputObject.get(ruangKelasObject.getPanjangRuang(),
				ruangKelasObject.getLebarRuang(),
				ruangKelasObject.getJumlahKursi(),
				ruangKelasObject.getJumlahPintu(),
				ruangKelasObject.getJumlahJendela());

	}

	double KondisiKelas() {
		ruangKelasObject = InputObject.getRuangKelas();
		if (ruangKelasObject.getJumlahStopKontak() >= 4) {
			System.out.println("Jumlah Stop Kontak Sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Tidak Sesusai");
		}
		if (ruangKelasObject.getKondisiStopKontak().equalsIgnoreCase("baik")) {
			System.out.println("Kondisi Stop Kontak Sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Tidak Sesuai");
		}
		if (ruangKelasObject.getPosisiStopKontak().equalsIgnoreCase(
				"DekatDosen")
				|| ruangKelasObject.getPosisiStopKontak().equalsIgnoreCase(
						"PojokKelas")) {
			System.out.println("Posisi Sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Posisi Tidak Sesuai");
		}
		if (ruangKelasObject.getJumlahKabelLCD() >= 1) {
			System.out.println("Jumlah Kabel LCD Sesuai");
			Kesesuaian++;

		} else {
			System.out.println("Jumlah Kabel LCD Tidak Sesuai");
		}
		if (ruangKelasObject.getKondisiKabelLCD().equalsIgnoreCase("baik")
				|| ruangKelasObject.getKondisiKabelLCD().equalsIgnoreCase(
						"berfungsi")) {
			System.out.println("KondisiKabelLCD : s");
			Kesesuaian++;
		} else {
			System.out.println("Tidak s");
		}
		if (ruangKelasObject.getPosisiKabelLCD().equalsIgnoreCase("dekatdosen")) {
			System.out.println("PosisiKabelLCD : s");
			Kesesuaian++;
		} else {
			System.out.println("Posisi kabel LCD Tidak sesuai");
		}
		if (ruangKelasObject.getJumlahLampu() >= 18) {
			System.out.println("Jumlah Lampu Sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Jumlah Lampu tidak Sesuai");
		}
		if (ruangKelasObject.getKondisiLampu().equalsIgnoreCase("baik")) {
			System.out.println("Kondisi lampu sesuai");
			Kesesuaian++;
		} else {
			System.out.println("kondisi Lampu tidak sesuai");
		}
		if (ruangKelasObject.getPosisiLampu().equalsIgnoreCase("atap")) {
			System.out.println("Posisi Lampu Sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Posisi Lampu tidak sesuai");
		}
		if (ruangKelasObject.getJumlahKipasAngin() >= 2) {
			System.out.println("Jumlah Kipas angin sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Jumlah kipas angin tidak sesuai");
		}
		if (ruangKelasObject.getPosisiKipasAngin().equalsIgnoreCase("atap")) {
			System.out.println("Posisi kipas angin sesuai");
			Kesesuaian++;
		} else {
			System.out.println("posisi Kipas Angin tidak sesuai");
		}
		if (ruangKelasObject.getKondisiKipasAngin().equalsIgnoreCase("baik")) {
			System.out.println("Kondisi Kipas angin sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Kondisi kipas angin tidak sesuai");
		}
		if (ruangKelasObject.getJumlahAC() >= 1) {
			System.out.println("Jumlah AC Sesuai");
			Kesesuaian++;
		} else {
			System.out.println("Jumlah AC Tidak Sesuai");
		}
		if (ruangKelasObject.getKondisiAC().equalsIgnoreCase("baik")) {
			System.out.println("KondisiAC : s");
			Kesesuaian++;
		} else {
			System.out.println("Tidak s");
			Kesesuaian++;
		}
		if (ruangKelasObject.getPosisiAC().equalsIgnoreCase("belakang")
				|| ruangKelasObject.getPosisiAC().equalsIgnoreCase("samping")) {
			System.out.println("PosisiAC : s");
			Kesesuaian++;
		} else {
			System.out.println("Tidak s");
		}
		if (ruangKelasObject.getSSID().equalsIgnoreCase("ummhotspot")) {
			System.out.println("getSSID : s");
			Kesesuaian++;
		} else {
			System.out.println("Tidak s");
		}
		if (ruangKelasObject.getBandwidth().equalsIgnoreCase("bisa")) {
			System.out.println("Bandwidth : s");
			Kesesuaian++;
		} else {
			System.out.println("Tidak s");
		}
		if (ruangKelasObject.getJumlahCCTV() >= 2) {
			System.out.println("JumlahCCTV : s");
			Kesesuaian++;
		} else {
			System.out.println("Tidak s");
		}
		if (ruangKelasObject.getKondisiCCTV().equalsIgnoreCase("baik")) {
			System.out.println("KondisiCCTV : s");
			Kesesuaian++;
		} else {
			System.out.println("Tidak s");
		}
		if (ruangKelasObject.getPosisiCCTV().equalsIgnoreCase("depanbelakang")) {
			System.out.println("PosisiCCTV : s");
			Kesesuaian++;
		} else {
			System.out.println("Tidak s");
		}
		OutputObject.get(ruangKelasObject.getJumlahStopKontak(),
				ruangKelasObject.getKondisiStopKontak(),
				ruangKelasObject.getPosisiStopKontak(),
				ruangKelasObject.getJumlahKabelLCD(),
				ruangKelasObject.getKondisiKabelLCD(),
				ruangKelasObject.getPosisiKabelLCD(),
				ruangKelasObject.getJumlahLampu(),
				ruangKelasObject.getKondisiLampu(),
				ruangKelasObject.getPosisiLampu(),
				ruangKelasObject.getJumlahKipasAngin(),
				ruangKelasObject.getKondisiKipasAngin(),
				ruangKelasObject.getPosisiKipasAngin(),
				ruangKelasObject.getJumlahAC(),
				ruangKelasObject.getKondisiAC(),
				ruangKelasObject.getPosisiAC(), ruangKelasObject.getSSID(),
				ruangKelasObject.getBandwidth(),
				ruangKelasObject.getJumlahCCTV(),
				ruangKelasObject.getKondisiCCTV(),
				ruangKelasObject.getPosisiCCTV());
		return Kesesuaian;
	}

	@Override
	void Sarana() {
		// TODO Auto-generated method stub

	}

	@Override
	void Kebersihan() {
		// TODO Auto-generated method stub

	}

	@Override
	void Kenyamanan() {
		// TODO Auto-generated method stub

	}

	@Override
	void Keamanan() {
		// TODO Auto-generated method stub

	}
}
