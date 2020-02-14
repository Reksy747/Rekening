
public class Main {
	public static void main(String[] args) {
		Nasabah anton = new Nasabah("Anton","1","Jl. Wahidin");
		Nasabah antonbisnis = new Nasabah("Antonius","2", "Jl. Kebahagiaan");
		Nasabah antonutama = new Nasabah("Rachmat", "4", "Jl. utama");
		Nasabah antonanak = new Nasabah("Rachmat C","5","Jl. anak");
		
		Rekening rekAnton = new Rekening(anton,1000000);
		RekeningUtama rekUtama = new RekeningUtama(antonutama,2000000);
		RekeningBisnis rekBisnis = new RekeningBisnis(antonbisnis,4000000);
		RekeningTambahan rekAnak = new RekeningTambahan(antonanak,500000);
		rekAnton.penarikan(200000);
		System.out.println(rekAnton.getSaldo());
		rekUtama.penarikan(200000);
		System.out.println(rekUtama.getSaldo());
		rekBisnis.penarikan(200000);
		System.out.println(rekBisnis.getSaldo());
		rekAnak.penarikan(100000);
		System.out.println(rekAnak.getSaldo());
		
	}
}
