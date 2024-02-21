public class BukuMain10 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang:: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml){
        if(stok > 0){
            stok -= jml;
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
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
    }
    
}
