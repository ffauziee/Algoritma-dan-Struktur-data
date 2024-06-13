import java.util.Scanner;

public class MainTransaksi {
    static transaksiPajak[] transaksiList = new transaksiPajak[100];
    static int transaksiCount = 0;
    static int kodeTransaksi = 1;
    public static Scanner sc1 = new Scanner(System.in);
    public static Scanner sc2 = new Scanner(System.in);

    public static void daftarKendaraan(classKendaraan antri) {
        System.out.print("Masukkan Nomer TNKB: ");
        String noTNKB = sc1.nextLine();
        System.out.print("Masukkan Nama Pemilik: ");
        String nama = sc1.nextLine();
        System.out.print("Masukkan Jenis Kendaraan: ");
        String jenis = sc1.nextLine();
        System.out.print("Masukkan CC Kendaraan: ");
        int cc = sc2.nextInt();
        System.out.print("Masukkan Tahun Kendaraan: ");
        int tahun = sc2.nextInt();
        System.out.print("Masukkan Bulan Harus Bayar: ");
        int bulanHarusBayar = sc2.nextInt();

        kendaraan kend = new kendaraan(noTNKB, nama, jenis, cc, tahun, bulanHarusBayar);
        antri.Enqueue(kend);
        System.out.println("Kendaraan berhasil didaftarkan.");
    }

    public static void bayarPajak(classKendaraan antri) {
        System.out.println("==============================");
        System.out.println("Masukkan Data Pembayaran");
        System.out.println("==============================");
        System.out.print("Masukkan Nomer TNKB: ");
        String noTNKB = sc1.nextLine();
        System.out.print("Bulan Bayar: ");
        int bulanBayar = sc2.nextInt();
        sc2.nextLine();

        kendaraan kend = null;
        for (int i = 0; i < antri.size; i++) {
            kendaraan temp = antri.data[(antri.front + i) % antri.max];
            if (temp.noTNKB.equals(noTNKB)) {
                kend = temp;
                break;
            }
        }

        if (kend == null) {
            System.out.println("Kendaraan dengan TNKB " + noTNKB + " tidak ditemukan dalam antrian.");
            return;
        }

        // Logika untuk menghitung nominal bayar dan denda
        long nominalBayar = kend.pajak;
        long denda = 0;
        if (bulanBayar > kend.bulanHarusBayar) {
            int selisihBulan = bulanBayar - kend.bulanHarusBayar;
            if (selisihBulan <= 3) {
                denda = 50000;
            } else {
                denda = 50000 * selisihBulan;
            }
        }

        // Tambahkan transaksi ke dalam daftar
        transaksiPajak transaksi = new transaksiPajak(kodeTransaksi++, noTNKB, kend.nama, nominalBayar, denda);
        transaksiList[transaksiCount++] = transaksi;

        // Tampilkan transaksi
        System.out.println("|kode\t| TNKB\t\t| Nama\t| Nominal\t\t| Denda\t|");
        transaksi.printTransaksi();
    }

    public static void tampilkanSeluruhTransaksi() {
        System.out.println("|kode\t| TNKB\t\t| Nama\t| Nominal\t\t| Denda\t|");
        for (int i = 0; i < transaksiCount; i++) {
            transaksiList[i].printTransaksi();
        }
    }

    public static void urutkanTransaksiBerdasarkanNama() {
        for (int i = 0; i < transaksiCount - 1; i++) {
            for (int j = 0; j < transaksiCount - i - 1; j++) {
                if (transaksiList[j].nama.compareToIgnoreCase(transaksiList[j + 1].nama) > 0) {
                    transaksiPajak temp = transaksiList[j];
                    transaksiList[j] = transaksiList[j + 1];
                    transaksiList[j + 1] = temp;
                }
            }
        }
        System.out.println("Transaksi telah diurutkan berdasarkan nama pemilik.");
        tampilkanSeluruhTransaksi();
    }

    public static void menu(){
        System.out.println("------------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Bayar Pajak");
        System.out.println("3. Tampilkan seluruh traksaksi");
        System.out.println("4. Urutkan transaksi berdasarkan nama pemilik");
        System.out.println("5. Keluar");
        System.out.println("------------------------------");
        System.out.print("Pilih Menu: ");
    }
    
    public static void main(String[] args) {
        
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc2.nextInt();
        classKendaraan antriPajak = new classKendaraan(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc2.nextInt();
            switch (pilih) {
                case 1: daftarKendaraan(antriPajak);
                    break;

                case 2: bayarPajak(antriPajak);
                    break;
                
                case 3: tampilkanSeluruhTransaksi();
                    break;

                case 4: urutkanTransaksiBerdasarkanNama();
                    break;

                case 5: System.out.println("terimakasih");
                        System.exit(0);
                    break;
                default: System.out.println("Masukkan pilihan yang benar");
                    break;
            }
        } while(pilih != 5);
    }
}
