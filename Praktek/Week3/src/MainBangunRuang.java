import java.util.Scanner;
public class MainBangunRuang {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    kerucut[] krc = new kerucut[1];
    Limas [] lmssegiempat = new Limas[1];
    Bola [] bl = new Bola[1];

        for (int i = 0; i < krc.length; i++) {
            krc[i] = new kerucut();
            System.out.print("Masukkan jari-jari Kerucut ke-" + (i+1) + ": ");
            int a = sc.nextInt();
            krc[i].jariJari=a;
            System.out.print("Masukkan sisi miring Kerucut ke-" + (i+1) + ": ");
            int b = sc.nextInt();
            krc[i].sisiMiring=b;
                   }
        for (int i = 0; i< lmssegiempat.length; i++) {
            lmssegiempat[i] = new Limas();
            System.out.print("Masukkan sisi alas limas segiempat sama sisi ke-" + (i+1) + ": ");
            int a = sc.nextInt();
            lmssegiempat[i].sisiAlas = a;
            System.out.print("Masukkan tinggi limas segiempat sama sisi ke-" + (i+1) + ": ");
            int b = sc.nextInt();
            lmssegiempat[i].tinggi=b;
        }
        for (int j = 0; j < bl.length; j++) {
            System.out.print("Masukkan jari-jari Bola ke-" + (j+1) + ": ");
            int a = sc.nextInt();
            bl[j] = new Bola(a);
        }
        
        for (int j2 = 0; j2 < bl.length; j2++) {
            System.out.printf("Kerucut ke-%d\nmemiliki Volume : %.2f\n dan Luas Permukaan : %.2f\n",
                (j2+1), krc[j2].hitungVolumekrc(), krc[j2].hitungPermukaankrc());
            
            System.out.printf("Limas Segi Empat Sama sisi ke-%d\nmemiliki Volume : %.2f\n dan Luas Permukaan : %.2f\n",
                (j2+1), lmssegiempat[j2].hitungVolumeLimas(), lmssegiempat[j2].hitungLuasPermukaanLimas());
            
            System.out.printf("Bola ke-%d\nmemiliki Volume : %.2f\n dan Luas Permukaan : %.2f\n",
                (j2+1), bl[j2].volumebola(), bl[j2].Luaspermukaanbola());
        }
     sc.close();   
    }
}