import java.util.Scanner;

public class NasabahMain {

    public static void menu(){
        System.out.println("------------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("------------------------------");
        System.out.print("Pilih Menu: ");
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc2.nextInt();
        ClassNasabah antri = new ClassNasabah(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc2.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc1.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc1.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc1.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc2.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc2.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.Enqueue(nb);
                    break;
                
                case 2:
                    Nasabah data = antri.Dequeue();
                    if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                     && !"".equals(data.umur) && !"".equals(data.saldo != 0)) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat
                        + " " +data.umur + " " + data. saldo);
                        break;
                    };
                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;
            }

        } while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        
        sc1.close();
        sc2.close();
    } 
}
