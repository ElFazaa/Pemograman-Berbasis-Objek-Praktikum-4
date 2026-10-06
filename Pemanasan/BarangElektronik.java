public class BarangElektronik extends Barang {
    private int garansiBulan;

    public BarangElektronik(String kodebarang, String namabarang,
                            String kondisi, int garansiBulan) {
        super(kodebarang, namabarang, kondisi);
        this.garansiBulan = garansiBulan;
    }

    public int getGaransiBulan() {
        return garansiBulan;
    }

    @Override
    public void tandaiRusak() {
        super.tandaiRusak();
        System.out.println("Peringatan: " + getNamabarang()
                + " (elektronik) rusak. Cek garansi " + garansiBulan
                + " bulan atau hubungi teknisi.");
    }

    @Override
    public String toString() {
        return "BarangElektronik[garansiBulan=" + garansiBulan
                + ", " + super.toString() + "]";
    }
}