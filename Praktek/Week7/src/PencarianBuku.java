public class PencarianBuku {
    Buku10 listBk[] = new Buku10[5];
    int idx;

    void tambah(Buku10 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Buku10 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++){
            if(listBk[j].kodeBuku==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos){
        if (pos!= -1){
            System.out.println("Data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + "tidak diteukan");
        }
    }
}
