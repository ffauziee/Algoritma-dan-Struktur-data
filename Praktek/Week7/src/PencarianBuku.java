public class PencarianBuku {
    Buku10_jobsheet6 listBk[] = new Buku10_jobsheet6[3];
    int idx;

    void tambah(Buku10_jobsheet6 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    public PencarianBuku(){
        for(int i = 0; i < listBk.length; i++) {
            listBk[i] = null;
        }
    }

    public void tampil(){
        for (Buku10_jobsheet6 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public void bubbleSortBuku() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length-i-1; j++) {
                if (listBk[j].kodeBuku.compareTo(listBk[j+1].kodeBuku) > 0) {
                    Buku10_jobsheet6 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j +1] = temp;
                }
            }
        }
    }

    public int findSeqSearchjudul(String cari){
        for (int i = 0; i < listBk.length; i++){
            if(listBk[i].judulBuku.equalsIgnoreCase(cari)){
                return i;
            }
        }
        return -1;
    }

    public Buku10_jobsheet6 findBuku(String cari){
        for (Buku10_jobsheet6 buku : listBk) {
            if (buku != null && buku.judulBuku.equalsIgnoreCase(cari)){
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

    public int findBinarySearch(String cari){
        bubbleSortBuku();
        int left = 0;
        int right = idx -1;
        while ( left <= right ){
            int mid = left + (right - left) /2;
            int cmp = cari.compareToIgnoreCase(listBk[mid].judulBuku);
            if (cmp == 0) {
                return mid;
            }else if(cmp < 0){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public void cariJudulbuku(String judul){
        int count = 0;
        for (int i = 0; i < idx; i++){
            if(listBk[i].judulBuku.equalsIgnoreCase(judul)){
                count++;
            }
        }

        if (count == 0){
            System.out.println("Judul buku tidak ditemukan");
        } else if(count == 1){
            System.out.println("Judul buku ditemukan");
        } else {
            System.out.println("Peringatan!! terdapat lebih dari satu buku dengan judul yang dicari");
        }
    }
    
}
