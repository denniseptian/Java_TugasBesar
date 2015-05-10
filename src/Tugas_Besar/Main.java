package Tugas_Besar;

public class Main {
	public static void main(String [] args){
		Input InputObject = new Input();
		Analisis AnalisisObject = new Analisis();
		Output OutputObject = new Output();
		InputObject.Master_input();
		AnalisisObject.LuasRuangan();
		OutputObject.DeklarasiRuangan();
		OutputObject.LuasRuangan();
	}
}
