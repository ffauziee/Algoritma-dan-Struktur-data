public class Buku10 {

    String judul, pengarang;
    int halaman, stok, harga, jual;
    double diskon;

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang:: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga : Rp."+ harga);
        System.out.println("Harga Total: " + hitungHargaTotal(jual));
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga yang harus dibayar: Rp" + hitungHargaBayar(jual));
    }

    void terjual(int jml){
        if(stok > 0){
            stok -= jml;
        }else{
            System.out.println("Stock Habis");
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku10(){

    }

    public int hitungHargaTotal(int jmlTerjual){
        jual = jmlTerjual;
        return harga * jmlTerjual;
    }

    void hitungDiskon(){
        if(hitungHargaBayar(jual) > 150000){
            diskon = 0.12;
        } else if (hitungHargaBayar(jual) >= 75000){
            diskon = 0.05;
        }
    }

    public double hitungHargaBayar(int jmlTerjual){
        int hargaTotal = hitungHargaTotal(jmlTerjual);
        double total = hargaTotal - (hargaTotal*diskon);
        return total;
    }
    


    public Buku10(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;

    }
}