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
}
