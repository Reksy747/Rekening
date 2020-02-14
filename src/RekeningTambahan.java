
public class RekeningTambahan extends RekeningKeluarga {

	public RekeningTambahan(Nasabah nasabah, int saldo) {
		super(nasabah, saldo);
		// TODO Auto-generated constructor stub
	}
	
	public RekeningTambahan(Nasabah nasabah) {
		super(nasabah);
		// TODO Auto-generated constructor stub
	}
	
	public void penarikan(int jumlah) {
		if(jumlah > 0 && jumlah < 500000) {
			super.penarikan(jumlah);
		}
	}

}
