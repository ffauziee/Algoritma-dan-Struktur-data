import java.util.Scanner;

public class bangunRuang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        kerucut krc[] = new kerucut[3];
        Limas lim[] = new Limas[3];

        for(int i = 0; i < 3; i++){
            System.out.print("r kerucut: ");
            int rKerucut = sc.nextInt();
            System.out.print("SM kerucut: ");
            int smKerucut = sc.nextInt();
            krc[i] = new kerucut(rKerucut, smKerucut);
            System.out.print("Sisi alas limas: ");
            int saLimas = sc.nextInt();
            System.out.print("tinggi limas: ");
            int tlimas = sc.nextInt();
            lim[i] = new Limas(tlimas, saLimas);
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Vol kerucut ke- " + (i+1) + ": " + krc[i].hitungVolume());
            System.out.println("Luas kerucut ke- " + (i+1) + ": " + krc[i].hitungPermukaan());
            System.out.println("Vol limas ke- " + (i+1) + ": " + lim[i].hitungVolume());
            System.out.println("Luas limas ke- " + (i+1) + ": " + lim[i].hitungLuasPermukaan());

        }


        sc.close();
    }
}
