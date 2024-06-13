import java.util.Scanner;

public class MainPembeli {

    public static void menu() {
        System.out.println("------------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek posisi terbelakang");
        System.out.println("5. Cek semua antrian");
        System.out.println("6. Cek posisi pembeli");
        System.out.println("7. Keluar");
        System.out.println("------------------------------");
        System.out.print("Pilih Menu: ");
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc2.nextInt();
        ClassPembeli antri = new ClassPembeli(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc2.nextInt();
            sc2.nextLine(); // Consume the newline
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc1.nextLine();
                    System.out.print("No HP: ");
                    String noHP = sc1.nextLine();
                    Pembeli pb = new Pembeli(nama,noHP);
                    antri.Enqueue(pb);
                    break;

                case 2:
                    Pembeli data = antri.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar: " + data.nama);
                    }
                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.peekRear();
                    break;

                case 5:
                    antri.print();
                    break;

                case 6:
                    System.out.print("Masukkan nama pembeli: ");
                    String searchName = sc1.nextLine();
                    antri.peekPosition(searchName);
                    break;

                case 7:
                    System.out.println("Keluar dari program.");
                    System.exit(0);;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilih != 7);

        sc1.close();
        sc2.close();
    }
}