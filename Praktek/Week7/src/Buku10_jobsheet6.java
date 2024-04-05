public class Buku10_jobsheet6 {

    int tahunTerbit, stock;
    String judulBuku, pengarang, kodeBuku;
    
    Buku10_jobsheet6(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku(){
        System.out.println("================================");
        System.out.println("Kode buku\t: " + kodeBuku);
        System.out.println("Judul\t\t: " + judulBuku);
        System.out.println("Tahun terbit\t: " + tahunTerbit);
        System.out.println("Pengarang\t: " + pengarang);
        System.out.println("Stock\t\t: " + stock);
    }
}
