public class kendaraan {
    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;
    int pajak;
    
    public kendaraan(){
        
    }

    public kendaraan(String noTNKB,String nama,String jenis,int cc,int tahun,int bulanHarusBayar){
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
        this.pajak = hitungPajak();
    }

    public int hitungPajak() {
        if (jenis.equalsIgnoreCase("motor")) {
            if (cc < 100) {
                return 100000;
            } else if (cc <= 250) {
                return 250000;
            } else {
                return 500000;
            }
        } else if (jenis.equalsIgnoreCase("mobil")) {
            if (cc < 1000) {
                return 750000;
            } else if (cc <= 2500) {
                return 1000000;
            } else {
                return 1500000;
            }
        }
        return 0;
    }
}