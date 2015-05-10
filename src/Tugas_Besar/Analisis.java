package Tugas_Besar;

public class Analisis {
	Input InputObject = new Input();
	data dataObject = new data();
	int LuasRuangan;
	String BentukRuangan;
	int RasioLuas;
	String Pintu;
	boolean RasioLuasBoolean;
	boolean PintuBoolean;
	boolean JendelaBoolean;
	boolean Kelistrikan;
	boolean StopKontak;
	boolean KondisiStopKontak;
	boolean PosisiStopKontak;
	public int LuasRuangan(){
		LuasRuangan = dataObject.getPanjang_ruang()*dataObject.getLuas_ruangan();
		return LuasRuangan;
	}
	public String BentukRuangan(){
		if(dataObject.getLuas_ruangan()!=dataObject.getLuas_ruangan()){
			BentukRuangan = "Persegi Panjang";
		}else{
			BentukRuangan = "Kubus";
		}
		return BentukRuangan;
	}
	public boolean RasioLuas(){
		RasioLuas = LuasRuangan/dataObject.getJumlah_kursi();
		if(RasioLuas>=0.5){
			RasioLuasBoolean=true;
		}else if(RasioLuas<0.5){
			RasioLuasBoolean=false;
		}
		return RasioLuasBoolean;
	}
	public boolean Pintu(){
		if(dataObject.getJumlah_pintu()>=2){
			PintuBoolean = true;
		}else if(dataObject.getJumlah_pintu()<2){
			PintuBoolean = false;
		}
		return PintuBoolean;
	}
	public boolean Jendela(){
		if(dataObject.getJumlah_cendela()>=1){
			JendelaBoolean = true;
		}else if(dataObject.getJumlah_cendela()<1){
			JendelaBoolean = false;
		}
	return JendelaBoolean;
	}
	public boolean Kelistrikan_StopKontak(){
		if(dataObject.getStop_kontak()>=4){
			StopKontak = true;
		}
		else if(dataObject.getStop_kontak()<4){
			StopKontak = false;
		}
	return StopKontak;
	}
	public boolean PosisiStopKontak(){
		if(dataObject.getPosisi_stop_kontak().equalsIgnoreCase("pojok")&&dataObject.getPosisi_stop_kontak().equalsIgnoreCase("dekat dozen")){
			PosisiStopKontak = true;
		}else{
			PosisiStopKontak = false;
		}
	return PosisiStopKontak;
	}
}
