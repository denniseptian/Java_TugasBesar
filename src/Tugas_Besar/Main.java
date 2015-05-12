package Tugas_Besar;

import java.util.Scanner;

public class Main {
	static Input InputObject = new Input();
	static Analisis AnalisisObject = new Analisis();
	static Output OutputObject = new Output();
	static Input_Kantor InputKantorObject = new Input_Kantor();
	public static void main(String[] args) {

		int pilihan;

		Scanner scan = new Scanner(System.in);
		
		System.out
				.println("Masukkan Pilihan Ruang.\n\n1. Ruang Kelas\n2. Kantor Jurusan\n3. Mushola");
		System.out.println("- : ");
		pilihan = scan.nextInt();
		scan.close();
		switch (pilihan) {
		case 1:
			InputRuangKelas();
			break;
		case 2:
			InputRuangKantor();
			break;

		default:
			System.out.println("Masukkan Perintah dengan benar!");
			Main.main(args);
			break;
		}
	}

	public static void InputRuangKelas() {

		InputObject.Input_Ruang();
		
	}
	public static void InputRuangKantor() {
		InputKantorObject.Input_Ruang();
		
	}	
}
