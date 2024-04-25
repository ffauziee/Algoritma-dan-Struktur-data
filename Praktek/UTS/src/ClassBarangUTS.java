public class ClassBarangUTS {
    BarangUTS[] barang;
    int max;
    int size;

    public ClassBarangUTS(int kapasitas) {
        max = kapasitas;
        barang = new BarangUTS[max];
        size = 0; // index saat ini
    }

    // Method untuk menambahkan barang
    public void tambah(BarangUTS brg) {
        if (size < max) { // Memeriksa apakah kapasitas telah terpenuhi
            barang[size] = brg; // Tambah barang ke array
            size++; // Menambahkan indeks saat ini
        } else {
            System.out.println("Data sudah penuh, tidak dapat menambahkan barang lagi.");
        }
    }

    // Menampilkan semua barang
    public void tampil() {
        for (int i = 0; i < size; i++) { //method menampilkan data secara keseluruhan menggunakan perulangan
            barang[i].print();
        }
    }

    // Bubble sort berdasarkan stock
    public void bubblesortBarang() {
        for (int i = 0; i < size - 1; i++) { 
            for (int j = 0; j < size - i - 1; j++) { 
                if (barang[j].stock > barang[j + 1].stock) { 
                    BarangUTS temp = barang[j];
                    barang[j] = barang[j + 1];
                    barang[j + 1] = temp;
                }
            }
        }
    }

    // Mencari barang berdasarkan nama
    public int findNamaBarang(String cari) {
        for (int i = 0; i < size; i++) {
            if (barang[i].nama.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1; // Tidak ditemukan
    }

    // Menambahkan stock pada barang yang ditemukan
    public void tambahStock(String nama, int jumlah) {
        int idx = findNamaBarang(nama);
        if (idx != -1) { // Jika barang ditemukan
            barang[idx].stock += jumlah; // Tambah stock pada index yang ditemukan
            System.out.println("Stock barang " + nama + " berhasil ditambahkan.");
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    // Mengurangi stock pada barang yang ditemukan
    public void kurangiStock(String nama, int jumlah) {
        int idx = findNamaBarang(nama);
        if (idx != -1) { // Jika barang ditemukan
            if (barang[idx].stock >= jumlah) { 
                barang[idx].stock -= jumlah; // Kurangi stock pada index yang ditemukan
                System.out.println("Stock barang " + nama + " berhasil dikurangi.");
            } else {
                System.out.println("Stock barang tidak cukup.");
            }
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }
}
