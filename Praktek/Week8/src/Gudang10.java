public class Gudang10 {
    Barang10[] tumpukan;
    int size, top;

    public Gudang10(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang10[size];
        top = -1;
    }

    public boolean cekKosong(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang10 brg){
        if (!cekPenuh()) {
            top ++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahakan ke gudang");
        } else {
            System.out.println("Gagal! tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang10 ambilBarang(){
        if(!cekKosong()){
            Barang10 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + "diambil dari gudang");
            System.out.println("kode unik dalam biner: " + konversiDesimalBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang10 liihatBarang(){
        if (!cekKosong()){
            Barang10 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan masih kosoog");
            return null;
        }
    }

    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincina tumpukan barang di Gudang: ");
            for(int i =top ; i >= 0; i--){
                System.out.printf("kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else{
            System.out.println("Tumpukan barang kosong");
        }
    }

    public Barang10 lihatBarangTeratas(){
        if(!cekKosong()){
            Barang10 barangTeratas = tumpukan[top];
            System.out.println("barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        }else{
            System.out.println("Gudang masih kosong");
            return null;
        }
    }

    public Barang10 lihatBarangTerbawah(){
        if (!cekKosong()){
        Barang10 barangTerbawah = tumpukan[0];
        System.out.printf("Barang terbawah adalah %s, dengan kategori %s", barangTerbawah.nama, barangTerbawah.kategori);
        return barangTerbawah;
        } else{
            System.out.println("Gudang masih kosong");
            return null;
        }
    }

    public Barang10 cariBarang(String kodeNama){
        for (int i=0 ; i<= top; i++){
            if(!cekKosong()){
                Barang10 caribarang = tumpukan[i];
                if(caribarang.nama.equalsIgnoreCase(kodeNama) || caribarang.kode == Integer.parseInt(kodeNama)){
                    System.out.printf("Barang ditemukan: %s, dalam kategori %s", caribarang.nama, caribarang.kategori);
                    return caribarang;
                }else{
                    System.out.println("Barang tidak ditemukan");
                }
            }else {
                System.out.println("Gudang masih kosong");
                return null;
            }
        }
        System.out.println("Barang tidak ditemukan");
        return null;
    }

    public String konversiDesimalBiner(int kode){
        StackKonversi10 stack = new StackKonversi10();
        while (kode != 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode/2;
        }
        String biner = new String();
        while(!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}
