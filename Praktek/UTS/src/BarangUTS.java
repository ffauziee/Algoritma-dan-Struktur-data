public class BarangUTS {
    String kodeBarang, nama, kategori;
    int hargaSatuan, stock;

    public BarangUTS(String kode, String nama, String kategori, int harga, int stock){
        kodeBarang = kode;
        this.nama = nama;
        this.kategori = kategori;
        hargaSatuan = harga;
        this.stock = stock;
    }

    public void print(){
        System.out.printf("Kode Barang: %s\n", kodeBarang);
        System.out.printf("Nama Barang: %s\n", nama);
        System.out.printf("Kategori: %s\n", kategori);
        System.out.printf("Harga Satuan: %d\n" , hargaSatuan);
        System.out.printf("Stock Barang: %d\n", stock);
        System.out.println("=================================================================");
    }
}
