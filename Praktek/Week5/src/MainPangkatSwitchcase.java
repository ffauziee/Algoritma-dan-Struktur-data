import java.util.Scanner;
public class MainPangkatSwitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        Pangkat png[] = new Pangkat[elemen];
        for (int i =0; i < elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("========================================");
        System.out.println("1. Brute force");
        System.out.println("2. Switch case");
        System.out.print("Pilih metode (1/2): ");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:

            System.out.println("HASIL PANGKAT BRUTE FORCE");
            for(int i=0;i<elemen;i++){
                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }  
                break;
        
            case 2:

            System.out.println("HASIL PANGKAT DIVIDE CONQUER    ");
            for(int i=0;i<elemen;i++){
                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            } 
                break;

            default:
            System.out.println("Pilihan tidak valid");
                break;
        }

        sc.close();
    }
}
