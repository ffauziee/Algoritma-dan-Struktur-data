import java.util.Scanner;

public class BukuMain10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku data =  new PencarianBuku();
        int jumBuku = 5;
        
        System.out.println("========================================================");
        System.out.println("Masukkan data Buku secara urut dari kodeBuku Terkecil :");
        for (int i= 0; i < jumBuku; i++){
            System.out.println("========================================================");
            System.out.print("Kode Buku\t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku\t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit\t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock\t\t: ");
            int stock = s.nextInt();

            Buku10_jobsheet6 m = new Buku10_jobsheet6(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("========================================================");
        System.out.println("Data keseluruhan Buku :");
        data.tampil();

        System.out.println("________________________________________________________");
        System.out.println("________________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode Buku yang dicari");
        System.out.print("Kode Buku: ");
        String cari = s1.nextLine();
        System.out.println("========================================================");
        System.out.println("Menggunakan metode find Buku: ");
        Buku10_jobsheet6 dataBuku10 = data.findBuku(cari);
        if (dataBuku10 != null) {
            dataBuku10.tampilDataBuku();
        }else{
            System.out.println("Buku tidak ditemukan");
        }
        System.out.println("========================================================");
        System.out.println("Menggunakan sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("========================================================");
        System.out.println("Menggunakan binary Search");
        posisi = data.findBinarySearch(cari, 0, jumBuku -1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        s.close();
        s1.close();
    }
}
