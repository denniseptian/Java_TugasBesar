package Tugas_Besar;

public interface InterClass {
	

	void get(int PanjangRuang, int LebarRuang, int JumlahKursi,
			int JumlahPintu, int JumlahJendela);

	void get(int JumlahStopKontak, String KondisiStopKontak,
			String PosisiStopKontak, int JumlahKabelLCD,
			String KondisiKabelLCD, String PosisiKabelLCD, int JumlahLampu,
			String KondisiLampu, String PosisiLampu, int JumlahKipasAngin,
			String KondisiKipasAngin, String PosisiKipasAngin, int JumlahAC,
			String KondisiAC, String PosisiAC, String SSID, String Bandwidth,
			int JumlahCCTV, String KondisiCCTV, String PosisiCCTV);

	void get(String KondisiLantai, String KondisiDinding, String KondisiAtap,
			String KondisiPintu, String KondisiJendela);

	void get(String SirkulasiUdara, int NilaiPencahayaan, int Kelembaban,
			int Suhu);

	void get(String Kebisingan, String Bau, String Kebocoran, String Kerusakan,
			String Keausan, String x);

	void get(String Kekokohan, String KunciPintuJendela, String Bahaya);
}
