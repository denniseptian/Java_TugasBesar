package Tugas_Besar;
public class Output {
	data dataObject = new data();
	Analisis AnalisisObject = new Analisis();
	public void DeklarasiRuangan(){
		System.out.println("Nama Ruang : "+dataObject.getNama_ruang());	
	}
	public void LuasRuangan(){
		System.out.println("Luas Ruangan : "+AnalisisObject.LuasRuangan);
	}
	public void BentukRuangan(){
		System.out.println("persegi panjang : "+dataObject.getLuas_ruangan());
	}
	public void RasioLuas(){
		System.out.println("Rasio luas "+dataObject.getJumlah_kursi());
	}
	public void Pintu (){
		System.out.println("Jumlah pintu : "+dataObject.getJumlah_pintu());
	}
	public void cendela(){
		System.out.println("jumlah jendela : "+dataObject.getJumlah_cendela());
	}
	public void Kelistrikan_StopKontak(){
		System.out.println("Jika stop kontak : "+dataObject.getStop_kontak());
	}
}
