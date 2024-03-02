import java.util.Scanner;

public class Pertanyaan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String[] namaMK = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"};
        double[] nilaiAngka = new double[8];
        double[] bobotNilai = new double[8];
        String[] nilaiHuruf = new String[8];
        double totalbobot1 = 0;
        double totalbobot2 = 0;
        
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semseter");
        System.out.println("==============================");
   
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("Masukkan nilai angka untuk MK %s: ", namaMK[i]);
            nilaiAngka[i] = sc.nextDouble();
        }

        //
        for (int i = 0; i < nilaiAngka.length; i++) {
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "c";
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
            }else{
                nilaiHuruf[i] = "E";
            }
        }

        // Hitung bobot nilai 
        for (int i = 0; i < namaMK.length; i++) {
            if (nilaiHuruf[i].equals("A")) {
                bobotNilai[i]= 4.00;
            } else if (nilaiHuruf[i].equals("B+")) {
                bobotNilai[i] = 3.50;
            } else if (nilaiHuruf[i].equals("B")) {
                bobotNilai[i] = 3.00;
            } else if (nilaiHuruf[i].equals("C+")){
                bobotNilai[i] = 2.50;
            } else if (nilaiHuruf[i].equals("C")) {
                bobotNilai[i] = 2.00;
            } else if (nilaiHuruf[i].equals("D")) {
                bobotNilai[i] = 1.00;
            }else if (nilaiHuruf[i].equals("D")){
                bobotNilai[i] = 0;
            }
        }

        // Hitung IP
        for (int i = 0; i < namaMK.length; i++) {
            if ((i!=3)&&(i!=6)) {
                totalbobot1 += bobotNilai[i]  * 2;
            }else{
                totalbobot2 += bobotNilai[i] * 3;
            }
        }
        double ipk = (totalbobot1 + totalbobot2) / 18; 

        // Tampilkan hasil
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("| %-30s | %-12s | %-12s | %-12s |\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("| %-30s | %-12.2f | %-12s | %-12.2f |\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("====================");
        System.out.printf("IP: %.2f\n", ipk);

        sc.close();
    }
}

