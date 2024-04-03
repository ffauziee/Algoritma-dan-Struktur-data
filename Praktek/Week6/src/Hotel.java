public class Hotel {
    public String nama, kota;
    public int harga;
    public byte bintang;


    public Hotel(String n, String k, int h, int b){
        nama = n;
        kota = k;
        harga = h;
        bintang = (byte)b;
    }

    void tampil(){
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Kota: " + kota);
        System.out.println("Harga: " + harga);
        System.out.println("Rating: " + bintang);
    }
}
