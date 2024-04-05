public class Mobil {

    public String nama;
    public int cc, hargaBeli, thnProduksi;

    Mobil(String nm, int cc, int harga, int thn){
        nama = nm;
        this.cc = cc;
        hargaBeli = harga;
        thnProduksi = thn;
    }
    public double hitungPajak(){
        double pajak = 0;
        if(cc > 1500){
            pajak = hargaBeli* 0.1;
        }
        pajak = hargaBeli*0.075;
        return pajak;
    }

    public double hitungBiayaPerawatan(){
        double perawatan = 0;
        if(thnProduksi < 2010){
            perawatan = 0.8*hargaBeli;
        }
        perawatan = 0.5*hargaBeli;
        return perawatan;
    }

    public double hitungBiayaTotal(){
        double biayaTotal;
        double pajak = hitungPajak() ; 
        double perawatan = hitungBiayaPerawatan();
        biayaTotal = pajak + perawatan;

        return biayaTotal;
    }

    public double hitungRataPerawatanDiatas2010() {
        int jumlahMobilDiatas2010 = 0;
        double totalBiayaPerawatanDiatas2010 = 0;
    
        if (thnProduksi > 2010) {
            totalBiayaPerawatanDiatas2010 += hitungBiayaPerawatan();
            jumlahMobilDiatas2010++;
        }
    
        if (jumlahMobilDiatas2010 > 0) {
            return totalBiayaPerawatanDiatas2010 / jumlahMobilDiatas2010;
        } else {
            return 0;
        }
    }

    static Mobil mobilBiayaTotalTerbesar(Mobil[] mbArray) {
        Mobil mobilTerbesar = null;
        double biayaTotalTerbesar = 0;

        for (Mobil m : mbArray) {
            if (m.cc > 1500 && m.thnProduksi < 2010) {
                double biayaTotal = m.hitungBiayaTotal();
                if (biayaTotal > biayaTotalTerbesar) {
                    biayaTotalTerbesar = biayaTotal;
                    mobilTerbesar = m;
                }
            }
        }

        return mobilTerbesar;
    }

    public void printData(){
        System.out.println("Nama: " + nama);
        System.out.println("CC mobil: " + cc);
        System.out.println("Harga beli mobil: " + hargaBeli);
        System.out.println("Tahun Produksi Mobil: " + thnProduksi);
        System.out.println("Pajak Mobil: " + hitungPajak());
        System.out.println("Biaya Perawatan mobil: " + hitungBiayaPerawatan());
        System.out.println("Biaya total mobil: " + hitungBiayaTotal());
        System.out.println("Rata-Rata biaya perawatan mobil diatas tahun 2010: " + hitungRataPerawatanDiatas2010());
    }
}