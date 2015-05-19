package Tugas_Besar;

public abstract class Master {
	void Header(String Masukan) {
		System.out.println("Halaman " + Masukan);
	}

	abstract void KondisiRuang();

	abstract void Sarana();

	abstract void Kebersihan();

	abstract void Kenyamanan();

	abstract void Keamanan();
}
