import java.util.Scanner;

public class UtsMain {
    public static void main(String[] args) {
        // Membuat instance ClassBarangUTS dengan kapasitas 10
        ClassBarangUTS gudang = new ClassBarangUTS(9);
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Menampilkan menu yang ada
            System.out.println("\n--- Menu Gudang ---");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Tambah Stok Barang");
            System.out.println("4. Kurangi Stok Barang");
            System.out.println("5. Urutkan Barang berdasarkan Stok");
            System.out.println("6. Cari Barang berdasarkan Nama");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            
            // input pilihan user
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline agar tidak terskip

            switch (pilihan) {
                case 1:
                    // Tambah Barang
                    System.out.print("Masukkan kode barang: ");
                    String kode = scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan kategori barang: ");
                    String kategori = scanner.nextLine();
                    System.out.println("Masukkan harga satuan barang: ");
                    int harga = scanner.nextInt();
                    System.out.print("Masukkan stok barang: ");
                    int stok = scanner.nextInt();
                    BarangUTS baru = new BarangUTS(kode, nama, kategori, harga, stok);
                    gudang.tambah(baru);
                    System.out.println("Barang berhasil ditambahkan.");
                    break;

                case 2:
                    // Tampilkan Semua Barang
                    System.out.println("Barang keseluruhan:");
                    gudang.tampil();
                    break;

                case 3:
                    // Tambah Stok Barang
                    System.out.print("Masukkan nama barang untuk ditambahkan stok: ");
                    nama = scanner.nextLine();
                    System.out.print("Masukkan jumlah stok yang akan ditambahkan: ");
                    int jumlahTambah = scanner.nextInt();
                    gudang.tambahStock(nama, jumlahTambah);
                    break;

                case 4:
                    // Kurangi Stok Barang
                    System.out.print("Masukkan nama barang untuk dikurangi stok: ");
                    nama = scanner.nextLine();
                    System.out.print("Masukkan jumlah stok yang akan dikurangi: ");
                    int jumlahKurangi = scanner.nextInt();
                    gudang.kurangiStock(nama, jumlahKurangi);
                    break;

                case 5:
                    // Urutkan Barang berdasarkan Stok
                    gudang.bubblesortBarang();
                    System.out.println("Barang telah diurutkan berdasarkan stok.");
                    break;

                case 6:
                    // Cari Barang berdasarkan Nama
                    System.out.print("Masukkan nama barang yang ingin dicari: ");
                    nama = scanner.nextLine();
                    int indeks = gudang.findNamaBarang(nama);
                    if (indeks >= 0) {
                        System.out.println("Barang ditemukan di indeks: " + indeks);
                    } else {
                        System.out.println("Barang tidak ditemukan.");
                    }
                    break;

                case 7:
                    // Keluar
                    running = false;
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }
}
