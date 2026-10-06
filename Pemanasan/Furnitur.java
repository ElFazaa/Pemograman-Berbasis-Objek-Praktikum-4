public class Furnitur extends Barang {
    private String bahan;

    public Furnitur(String kodebarang, String namabarang,
                    String kondisi, String bahan) {
        super(kodebarang, namabarang, kondisi);
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    @Override
    public String toString() {
        return "Furnitur[bahan=" + bahan + ", " + super.toString() + "]";
    }
}