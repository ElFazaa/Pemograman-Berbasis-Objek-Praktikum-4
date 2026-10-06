public class Barang {
    private String kodebarang;
    private String namabarang;
    private String kondisi;

    public Barang(String kodebarang, String namabarang, String kondisi) {
        this.kodebarang = kodebarang;
        this.namabarang = namabarang;
        this.kondisi = kondisi;
    }

    public void tandaiRusak(){
        this.kondisi = "Rusak"; 
    }

    public void Perbaiki(){
        this.kondisi = "Bagus"; 
    }

    public void tandaiHilang(){
        this.kondisi = "Hilang"; 
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public String getKondisi() {
        return kondisi;
    }


}
