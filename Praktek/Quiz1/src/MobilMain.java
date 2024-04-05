import java.util.Scanner;

public class MobilMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobil[] mbArray = new Mobil[2];

        for(int i = 0; i < mbArray.length; i++) {
            System.out.println("Masukkan data Mobil ke-" + i);
            System.out.print("Nama Mobil: ");
            String newNama = sc.next();
            System.out.print("CC Mobil: ");
            int newCC = sc.nextInt();
            System.out.print("Harga Beli Mobil: ");
            int newharga = sc.nextInt();
            System.out.print("Tahun Produksi Mobil: ");
            int newPrdk = sc.nextInt();
            mbArray[i] = new Mobil(newNama, newCC, newharga, newPrdk);
        }
        for (int i = 0; i <mbArray.length; i++) {
            mbArray[i].printData();
        }

        Mobil mobilTerbesar = mbArray[0].mobilBiayaTotalTerbesar(mbArray);
        if (mobilTerbesar != null) {
            System.out.println("================================");
            System.out.println("Mobil dengan Biaya Total Terbesar");
            System.out.println("================================");
            mobilTerbesar.printData();
        } else {
            System.out.println("Tidak ada mobil yang memenuhi");
        }

        sc.close();
    }
}
