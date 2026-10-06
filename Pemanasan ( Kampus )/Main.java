public class Main {
    public static void main(String[] args) {
  
        Barang b1 = new Barang("B01", "Proyektor", "BAGUS");
        Barang b2 = new Barang("B02", "Kursi", "BAGUS");

        Lokasi l1 = new Lokasi("D201", "Ruang Kelas");
        Lokasi l2 = new Lokasi("D212", "Lab SDB");

        PencatatanInventaris p1 = new PencatatanInventaris("INVEN01", b1, l1);
        PencatatanInventaris p2 = new PencatatanInventaris("INVEN02", b2, l2);

        p1.tampilkanInformasi();
        p2.tampilkanInformasi();

        System.out.println("Status b1 awal : " + b1.getKondisi());
        b1.tandaiRusak();
        System.out.println("Status b1 akhir: " + b1.getKondisi());
    }

}