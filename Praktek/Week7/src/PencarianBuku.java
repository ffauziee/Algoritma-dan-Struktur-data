public class PencarianBuku {
    Buku10_jobsheet6 listBk[] = new Buku10_jobsheet6[5];
    int idx;

    void tambah(Buku10_jobsheet6 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Buku10_jobsheet6 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(String cari){
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++){
            if(listBk[i].kodeBuku.equals(cari)){
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public Buku10_jobsheet6 findBuku(String cari){
        for (Buku10_jobsheet6 buku : listBk) {
            if (buku.kodeBuku.equals(cari)){
                return buku;
            }
        }
        return null;
    }

    public void tampilPosisi(String x, int pos){
        if (pos!= -1){
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos){
        if (pos != -1){
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t\t : "+ listBk[pos].stock);
        } else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public int findBinarySearch(String cari, int left, int right){
        while(left <= right){
            int mid = left + (right - left) / 2;
            if (cari.equals(listBk[mid].kodeBuku)){
                return mid;
            } else if (cari.compareTo(listBk[mid].kodeBuku) < 0){
                right = mid -1;
            } else{
                left = mid + 1;
            }
        }

        return -1;
    }
    
}
