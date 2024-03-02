public class Pertanyaan2 {
    static int[][] stockBunga = {
        { 10, 5, 15, 7},//Royal Garden 1
        { 6, 11, 9, 12},//Royal Garden 2
        { 2, 10, 10, 5},//Royal Garden 3
        { 5, 7, 12, 9}//Royal Garden 4
    };

    // Rincian harga bunga
    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual
    public static void pendapatanSetiapCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 1; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j - 1];
            }
            System.out.println("Pendapatan cabang " + (i+1) + ": " + pendapatan);
        }
    }

    // Fungsi untuk mengetahui jumlah Stock setiap jenis bunga pada cabang RoyalGarden 4
    public static void jumlahStockRoyalGarden4() {
        int[] penguranganStock = new int[hargaBunga.length];
        int [] jumlahStock = new int[hargaBunga.length];
        
        // Pengurangan stock karena bunga mati
        penguranganStock[0] = 1; // Aglonema
        penguranganStock[1] = 2; // Keladi
        penguranganStock[2] = 0; // Alocasia
        penguranganStock[3] = 5; // Mawar

        // Inisialisasi jumlah stock dengan data awal dan pengurangan stock
        for (int i = 0; i < stockBunga[3].length; i++) {
            jumlahStock[i] = stockBunga[3][i] - penguranganStock[i];
        }

        System.out.println("Jumlah Stock bunga pada cabang RoyalGarden 4:");
        for (int i = 0; i < jumlahStock.length; i++) {
            System.out.println(getJenisBunga(i) + ": " + jumlahStock[i]);
        }
    }   

    // Fungsi utilitas untuk mendapatkan nama jenis bunga berdasarkan indeks
    public static String getJenisBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        // 1. Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        pendapatanSetiapCabang();

        // 2. Mengetahui jumlah Stock setiap jenis bunga pada cabang RoyalGarden 4
        jumlahStockRoyalGarden4();
    }
}