public class main {
    public static void main(String[] args) {

        Barang b1 = new BarangElektronik("B01", "Proyektor", "Bagus", 12);
        Barang b2 = new Furnitur("B02", "Kursi", "Bagus", "Kayu");

        Lokasi l1 = new Lokasi("D201", "Ruang Kelas");
        Lokasi l2 = new Lokasi("D212", "Lab SDB");

        PencatatanInventaris p1 = new PencatatanInventaris("INVEN01", b1, l1);
        PencatatanInventaris p2 = new PencatatanInventaris("INVEN02", b2, l2);

        System.out.println("=== DATA PENCATATAN INVENTARIS ===");
        p1.tampilkanInformasi();
        p2.tampilkanInformasi();

        System.out.println("=== UJI PERUBAHAN STATUS (INHERITANCE) ===");
        System.out.println("Status b1 awal : " + b1.getKondisi());
        b1.tandaiRusak();
        System.out.println("Status b1 akhir: " + b1.getKondisi());
        System.out.println();

        System.out.println("Status b2 awal : " + b2.getKondisi());
        b2.tandaiRusak();
        System.out.println("Status b2 akhir: " + b2.getKondisi());
    }
}