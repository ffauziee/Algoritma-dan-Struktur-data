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

    public void peek(){
        System.out.println("Barang teratas adalah " + tumpukan[top].nama);
    }
}
