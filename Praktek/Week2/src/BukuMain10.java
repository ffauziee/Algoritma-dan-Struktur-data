public class BukuMain10 {
    public static void main(String[] args) {
        Buku10 bk1 = new Buku10();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku10 bk2 = new Buku10("Self Reward", "Maheera Ayesha",160, 29, 59000);
        System.out.println("Harga yang terjual: " + bk2.hitungHargaTotal(11));
        
        bk2.tampilInformasi();

        Buku10 bukuFauzie = new Buku10("Harry Potter", "J.K Rowling", 3407, 100, 100000);
        bukuFauzie.terjual(10);
        bukuFauzie.hitungHargaTotal(10);
        bukuFauzie.hitungDiskon();
        bukuFauzie.hitungHargaBayar(10);
        bukuFauzie.tampilInformasi();
    }
    
}
