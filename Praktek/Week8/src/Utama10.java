import java.util.Scanner;

public class Utama10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Gudang10 gudang = new Gudang10(jumlah);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampil stack barang");
            System.out.println("4. Cek barang teratas");
            System.out.println("5. Cek barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    Barang10 barangBaru = new Barang10(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3: 
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan nama atau kode barang yang dicari: ");
                    String cari = sc.nextLine();
                    gudang.cariBarang(cari);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("pilihan tidak valdi, mohon coba lagi");
                    break;
            }
        }
    }
}
