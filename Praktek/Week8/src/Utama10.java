import java.util.Scanner;

public class Utama10 {
    public static void main(String[] args) {
        Gudang10 gudang = new Gudang10(7);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampil stack barang");
            System.out.println("4. Cek barang teratas");
            System.out.println("5. Keluar");
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
                    gudang.peek();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("pilihan tidak valdi, mohon coba lagi");
                    break;
            }
        }
    }
}
