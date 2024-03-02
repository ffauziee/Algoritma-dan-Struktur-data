import java.util.Scanner;

public class Pertanyaan1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Perhitungan Nilai Akhir Mahasiswa");
        System.out.println("=================================");
        System.out.print("Masukkan Nilai Tugas : ");
        double Tgs = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis  : "); 
        double Kuis = sc.nextDouble(); 
        System.out.print("Masukkan Nilai UTS   : ");
        double Uts = sc.nextDouble(); 
        System.out.print("Masukkan Nilai UAS   : "); 
        double UAS = sc.nextDouble(); 
        System.out.println("=================================");
        System.out.println("=================================");

         double nilaiAkhir = Tgs * 0.2 + Kuis * 0.2 + Uts * 0.3 + UAS * 0.4;
        if ((Tgs <=100) && (Tgs>=0) &&(Kuis <=100) && (Kuis>=0) &&(UAS <=100)&& (UAS>=0) && (Uts<=100)&& (Uts>=0)){
            System.out.println("Nilai Akhir: "+nilaiAkhir ); 
            if(nilaiAkhir>80){
                System.out.println("Nilai Huruf : A");
                System.out.println("=================================");
            System.out.println("=================================");
                System.out.println("Selamat Anda Lulus");
            }else if(nilaiAkhir>73){
                System.out.println("Nilai Huruf : B+");
                System.out.println("=================================");
                System.out.println("Selamat Anda Lulus");
            }else if(nilaiAkhir>65){
                System.out.println("Nilai Huruf : B");
                System.out.println("=================================");
                System.out.println("Selamat Anda Lulus");
            }else if(nilaiAkhir>60){
                System.out.println("Nilai Huruf : C+");
                System.out.println("=================================");
                System.out.println("Selamat Anda Lulus");
            }else if (nilaiAkhir>50){
                System.out.println("Nilai Huruf : C");
                System.out.println("=================================");
                System.out.println("Selamat Anda Lulus");
            }else if (nilaiAkhir>39){
                System.out.println("Nilai Huruf : D");
                System.out.println("=================================");
                System.out.println("Anda Tidak Lulus");
            }else{
                System.out.println("Nilai Huruf : E");
                System.out.println("=================================");
                System.out.println("Anda Tidak Lulus");
            }
            System.out.println("=================================");
        } else {
            System.out.println("Masukkan Nilai Tidak Valid");
            System.out.println("=================================");
        }
        System.out.println("=================================");

        sc.close();
    }
    
}