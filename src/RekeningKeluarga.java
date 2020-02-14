
public class RekeningKeluarga extends Rekening {
	public final double BUNGA_SETOR = 0.005;
	
	public RekeningKeluarga(Nasabah nasabah, int saldo) {
		super(nasabah, saldo);
		// TODO Auto-generated constructor stub
	}
	
	public RekeningKeluarga(Nasabah nasabah) {
		super(nasabah);
		// TODO Auto-generated constructor stub
	}
	
	public void penyetoran(int jumlah)
	{
		if(jumlah > 0) {
			int totalSetoran = jumlah + bunga(jumlah);
			super.penyetoran(totalSetoran);
		}
	}
	
	private int bunga(int jumlah) {
		// TODO Auto-generated method stub
		return (int) BUNGA_SETOR * jumlah;
	}

	public void penarikan(int jumlah) {
		if(jumlah > 0) {
			int total = jumlah + 5000;
			super.penarikan(total);
		}
	}
}
