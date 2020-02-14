
public class RekeningSyariah extends Rekening {

	public RekeningSyariah(Nasabah nasabah, int saldo) {
		super(nasabah, saldo);
		// TODO Auto-generated constructor stub
	}
	
	public RekeningSyariah(Nasabah nasabah) {
		super(nasabah);
		// TODO Auto-generated constructor stub
	}

	public void penarikan(int jumlah) {
		if(jumlah > 100000) {
			int total = jumlah + 1000;
			super.penarikan(total);
		}
	}
	
	public void sedekah(int jumlah) {
		if(jumlah > 0) {
			super.penarikan(jumlah);
		}
	}
}
