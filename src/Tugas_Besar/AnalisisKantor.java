package Tugas_Besar;

public class AnalisisKantor extends Analisis{
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
	boolean JumlahKabel_LCD ;
	boolean PosisiKabel_LCD;
	boolean Jumlah_Lampu;
	boolean Posisi_Lampu;
	boolean Jumlah_KipasAngin ;
	boolean Posisi_KipasAngin; 
	boolean Jumlah_AC;
	String Posisi_AC ;
	boolean SSID;
	int Bandwith;
	int Jumlah_cctv;
	boolean posisi_cctv;
	boolean kondisi_lantai;
	boolean kondisi_dinding;
	boolean kondisi_atap;
	boolean kondisi_pintu;
	boolean kondisi_jendela;
	boolean Cahaya;
	int kelembaban;
	boolean kondisi_suhu;
	boolean kondisi_kebisingan;
	boolean kondisi_bau;
	boolean kondisi_kebocoran;
	boolean kondisi_keausan;
	
	@Override
	public int LuasRuangan(){
	
		LuasRuangan = dataObject.getPanjang_ruang()*dataObject.getLuas_ruangan();
		return LuasRuangan;
	}
	@Override
	public String BentukRuangan(){
		if(dataObject.getLuas_ruangan()!=dataObject.getLuas_ruangan()){
			BentukRuangan = "Persegi Panjang";
		}else{
			BentukRuangan = "Kubus";
		}
		return BentukRuangan;
	}
	@Override
	public boolean RasioLuas(){
		RasioLuas = LuasRuangan/dataObject.getJumlah_kursi();
		if(RasioLuas>=0.5){
			RasioLuasBoolean=true;
		}else if(RasioLuas<0.5){
			RasioLuasBoolean=false;
		}
		return RasioLuasBoolean;
	}
	@Override
	public boolean Pintu(){
		if(dataObject.getJumlah_pintu()>=2){
			PintuBoolean = true;
		}else if(dataObject.getJumlah_pintu()<2){
			PintuBoolean = false;
		}
		return PintuBoolean;
	}
	@Override
	public boolean Jendela(){
		if(dataObject.getJumlah_cendela()>=1){
			JendelaBoolean = true;
		}else if(dataObject.getJumlah_cendela()<1){
			JendelaBoolean = false;
		}
	return JendelaBoolean;
	}
	@Override
	public boolean Kelistrikan_StopKontak(){
		if(dataObject.getStop_kontak()>=4){
			StopKontak = true;
		}
		else if(dataObject.getStop_kontak()<4){
			StopKontak = false;
		}
	return StopKontak;
	}
	@Override
	public boolean PosisiStopKontak(){
		if(dataObject.getPosisi_stop_kontak().equalsIgnoreCase("pojok")&&dataObject.getPosisi_stop_kontak().equalsIgnoreCase("dekat dozen")){
			PosisiStopKontak = true;
		}else{
			PosisiStopKontak = false;
		}
	return PosisiStopKontak;
	}
	@Override
	public boolean JumlahKabel_LCD (){
		if(dataObject.getJumlah_kabel_LCD()>=1){
			JumlahKabel_LCD = true ;
		}else{
			JumlahKabel_LCD = false;
		}
	return JumlahKabel_LCD;
	}
	@Override
	public boolean PosisiKabel_LCD(){
		if(dataObject.getPosisi_kabel_LCD().equalsIgnoreCase("baik")&&dataObject.getPosisi_kabel_LCD().equalsIgnoreCase("pojok")){
			PosisiKabel_LCD = true ;
		}else{
			PosisiKabel_LCD = false ;
		}
	return PosisiKabel_LCD;
	}
	@Override
	public boolean Jumlah_Lampu(){
		if(dataObject.getJumlah_lampu()>=18){
			Jumlah_Lampu = true ;
		}else{
			Jumlah_Lampu = false ;
		}
	return Jumlah_Lampu;	
	}
	@Override
	public boolean Posisi_Lampu(){
		if(dataObject.getPosisi_lampu().equalsIgnoreCase("baik")&&dataObject.getPosisi_lampu().equalsIgnoreCase("atas")){
			Posisi_Lampu = true;
		}else{
			Posisi_Lampu = false ;
		}
	return Posisi_Lampu;	
	}
	@Override
	public boolean Jumlah_KipasAngin(){
		if(dataObject.getKipas_angin()>=2){
			Jumlah_KipasAngin = true ;
		}else{
			Jumlah_KipasAngin = false ;
		}
	return Jumlah_KipasAngin ;	
	}
	@Override
	public boolean Posisi_KipasAngin(){
		if(dataObject.getPosisi_kipas_angin().equalsIgnoreCase("baik")&&dataObject.getPosisi_kipas_angin().equalsIgnoreCase("atap")){
			Posisi_KipasAngin = true ;
		}else{
			Posisi_KipasAngin = false ;
		}
	return Posisi_KipasAngin ;
	}
	@Override
	public boolean Jumlah_AC(){
		if(dataObject.getJumlah_AC()>=1){
			Jumlah_AC = true ;
		}else{
			Jumlah_AC = false ;
		}
	return Jumlah_AC;	
	}
	@Override
	public String Posisi_AC(){
		if(dataObject.getPosisi_AC().equalsIgnoreCase("baik")&&dataObject.getPosisi_AC().equalsIgnoreCase("belakang")){
			Posisi_AC = "belakang" ;
		}else{
			Posisi_AC = "depan" ;
		}
	return Posisi_AC ;
	}
	@Override
	public boolean SSID (){
		if(dataObject.getSSID().equalsIgnoreCase("UMM Hotspot")){
			SSID = true ;
		}else{
			SSID = false ;
		}
	return SSID ;
	}
	@Override
	public int Bandwith (){
		if(dataObject.getBandwith()>=512){
			Bandwith = 1024 ;
		}else{
			Bandwith = 512 ;
		}
	return Bandwith ;	
	}
	@Override
	public int Jumlah_cctv (){
		if(dataObject.getCctv()>=2){
			Jumlah_cctv = 1 ;
		}else{
			Jumlah_cctv = 1 ;
		}
	return Jumlah_cctv;
	}
	@Override
	public boolean posisi_cctv(){
		if(dataObject.getPosisi_kipas_angin().equalsIgnoreCase("baik")&&dataObject.getPosisi_kipas_angin().equalsIgnoreCase("atap")){
			posisi_cctv = true ;
		}else{
			posisi_cctv = false ;
		}
	return posisi_cctv;
	}
	@Override
	public boolean kondisi_lantai(){
		 if (dataObject.isKondisi_lantai() == true ){
			kondisi_lantai = true; 
		 }else{
			 kondisi_lantai = false ;
		 }
	return kondisi_lantai;
	}
	@Override
	public boolean Cahaya (){
		if(dataObject.getCahaya()>=250){
			Cahaya = true ;
		}else{
			Cahaya = false ;
		}
	return Cahaya ;		
	}
	@Override
	public int Kelembaban(){
		if(dataObject.getKelembaban() >= 70 && dataObject.getKelembaban() <= 80) {
			kelembaban = 56 ;
		}else{
			kelembaban = 23 ;
		}
	return kelembaban;
	}
	@Override
	public boolean kondisi_suhu(){
		if (dataObject.getSuhu() >= 25 && dataObject.getSuhu() <= 35) {
			kondisi_suhu = true ;
		}else{
			kondisi_suhu = false ;
		}
	return kondisi_suhu;
	}
	@Override
	public boolean kondisi_kebisingan(){
		if (dataObject.isKebisingan() == true) {
			kondisi_kebisingan = true ;
		}else{
			kondisi_kebisingan = false ;
		}
	return kondisi_kebisingan;
	}
	@Override
	public boolean kondisi_bau (){
		if(dataObject.isBau() == true ){
			kondisi_bau = true ;
		}else{
			kondisi_bau = false ;
		}
	return kondisi_bau;
	}
	@Override
	public boolean kondisi_kebocoran(){
		if(dataObject.isKebocoran() == true ){
			kondisi_kebocoran = true ;
		}else{
			kondisi_kebocoran = false ;
		}
	return kondisi_kebocoran;
	}
	@Override
	public boolean kondisi_keausan(){
		if (dataObject.isKeausan()== true) {
			kondisi_keausan = true ;
		}else{
			kondisi_keausan = false ;
		}
	return kondisi_keausan;
	}
}