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
            System.out.println("=====================");
            System.out.print("Kode Buku\t: ");
            int kodeBuku = s1.nextInt();
            System.out.println("Judul buku\t: ");
            String judulBuku = s.nextLine();
            System.out.println("Tahun Terbit\t: ");
            int tahunTerbit = s.nextInt();
            System.out.println("Pengarang\t: ");
            String pengarang = s1.nextLine();
            System.out.println("Stock\t: ");
            int stock = s.nextInt();

            Buku10 m = new Buku10(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("========================================================");
        System.out.println("Data keseluruhan Buku :");
        data.tampil();

        System.out.println("________________________________________________________");
        System.out.println("________________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode Buku yang dicari :");
        System.out.println("Kode Buku :");
        int cari = s.nextInt();
        System.out.println("Menggunakna sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
    }
}
