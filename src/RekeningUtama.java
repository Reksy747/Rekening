
public class RekeningUtama extends RekeningKeluarga {

	public RekeningUtama(Nasabah nasabah, int saldo) {
		super(nasabah, saldo);
		// TODO Auto-generated constructor stub
	}
	
	public RekeningUtama(Nasabah nasabah) {
		super(nasabah);
		// TODO Auto-generated constructor stub
	}
	
	public void penarikan(int jumlah) {
		if(jumlah > 0 && jumlah < 3000000) {
			super.penarikan(jumlah);
		}
	}

}
