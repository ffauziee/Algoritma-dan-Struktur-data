import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlPerusahaan = sc.nextInt();
        sum perusahaan[] = new sum[jmlPerusahaan];

        for(int i=0; i<jmlPerusahaan; i++) {
            sc.nextLine();
            System.out.print("Masukkan nama perusahaan: ");
            String nmPerusahaan = sc.nextLine();
            System.out.print("Masukkan jumlah bulan keuntungan " + nmPerusahaan + ": ");
            int jmlbln = sc.nextInt();
            perusahaan[i] = new sum(nmPerusahaan, jmlbln);
            for (int j = 0; j < jmlbln; j++){
                System.out.print("Masukkan keuntungan bulan ke-" + j + " perusahaan " + nmPerusahaan + ": ");
                double keuntungan = sc.nextDouble();

                perusahaan[i].keuntunganBulanan( + 1, keuntungan);
            }
        }

        System.out.print("\nTotal Keuntungan setiap perusahaan (Brute Force): ");
        for(int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("Perusahaan " + perusahaan[i].nama + " : " + perusahaan[i].hitungTotalKeuntunganBruteForce());
        }
        System.out.print("\nTotal Keuntungan setiap perusahaan (Brute Force): ");
        for(int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("Perusahaan " + perusahaan[i].nama + " : " + perusahaan[i].hitungTotalKeuntunganDivide());
        }
        sc.close();
    }
}
