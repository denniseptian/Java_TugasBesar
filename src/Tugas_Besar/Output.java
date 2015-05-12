package Tugas_Besar;
public class Output extends data{
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
	public void PosisiStopKontak(){
		System.out.println("jika stop kontak berada di :"+dataObject.getPosisi_stop_kontak());
	}
	public void JumlahKabel_LCD(){
		System.out.println("Jumlah Kbel LCD :"+dataObject.getJumlah_kabel_LCD());
	}
	public void PosisiKabel_LCD(){
		System.out.println("Jika posisi kabel :"+dataObject.getPosisi_kabel_LCD());
	}
	public void Jumlah_Lampu(){
		System.out.println("Jumlah lampu :"+dataObject.getJumlah_lampu());
	}
	public void Posisi_Lampu(){
		System.out.println("Jika lampu : "+dataObject.getPosisi_lampu());
	}
	public void JumlahKipas_Angin(){
		System.out.println("Jumlah kipas :"+dataObject.getKipas_angin());
	}
	public void Posisi_KipasAngin(){
		System.out.println("Jika kipas angin :"+dataObject.getPosisi_kipas_angin());
	}
	public void Jumlah_AC(){
		System.out.println("Jumlah AC :"+dataObject.getJumlah_AC());
	}
	public void Posisi_AC(){
		System.out.println("Jika AC :"+dataObject.getPosisi_AC());
	}
	public void SSID(){
		System.out.println("SSID :"+dataObject.getSSID());
	}
	public void Bandwith(){
		System.out.println("Bandwith :"+dataObject.getBandwith());
	}
	public void Jumlah_cctv(){
		System.out.println("Jumlah cctv :"+dataObject.getCctv());
	}
	public void posisi_cctv(){
		System.out.println("JIka cctv :"+dataObject.getPosisi_cctv());
	}
	public void kondisi_lantai(){
		System.out.println("Jika kondisi lantai :"+dataObject.isKondisi_lantai());
	}
	public void Cahaya(){
		System.out.println("Jika cahaya :"+dataObject.getCahaya());
	}
	
	public void Kelembaban(){
		System.out.println("Jika tingkat kelembaban :"+dataObject.getKelembaban());
	}
	public void kondisi_suhu(){
		System.out.println("Kondisi tingkat suhu :"+dataObject.getSuhu());
	}
	public void kondisi_kebisingan(){
		System.out.println("Jika kondisi bising :"+dataObject.isKebisingan());
	}
	public void kondisi_bau(){
		System.out.println("jika bau :"+dataObject.isBau());
	}
	public void kondisi_kebocoran(){
		System.out.println("jika kondisi bocor :"+dataObject.isKebocoran());
	}
	public void kondisi_keausan (){
		System.out.println("Jika kondisi aua :"+dataObject.isKeausan());
	}
	public void kondisi_kekokohan(){
		System.out.println("Jika kondisi kokoh :"+dataObject.isKekokohan());
	}
	
}

