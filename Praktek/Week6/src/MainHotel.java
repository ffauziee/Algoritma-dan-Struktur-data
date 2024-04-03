import java.util.Scanner;
public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService htl = new HotelService();

        Hotel h1 = new Hotel("Grand Meccury", "Malang", 850000, 5);
        Hotel h2 = new Hotel("Savanna", "Malang", 350000, 3);
        Hotel h3 = new Hotel("Pelangi", "Malang", 550000, 4);
        Hotel h4 = new Hotel("Niagara", "Malang", 175000, 2);
        Hotel h5 = new Hotel("Swiss Bell", "Malang", 375000, 3);

        htl.tambah(h1);
        htl.tambah(h2);
        htl.tambah(h3);
        htl.tambah(h4);
        htl.tambah(h5);

        System.out.println("Daftar hotel Sebelum Sorting : ");
        htl.tampil();
       
        
        System.out.println("Tampilkan urutan berdasarkan : ");
        System.out.println("1.Bintang Tertinggi");
        System.out.println("2.Harga terendah");
        System.out.print("pilih (1/2) : ");
        byte choice = sc.nextByte();


        switch (choice) {
            case 1:
                System.out.println("Pilih teknik untuk sorting : ");
                System.out.println("1.Bubble Sort");
                System.out.println("2.Selection Sort");
                System.out.print("pilih (1/2) : ");
                byte choice2 = sc.nextByte();
                switch (choice2){
                    case 1:
                        System.out.println("Daftar hotel setelah sorting bintang ");
                        htl.bubblesortdescBintang();
                        htl.tampil();
                        break;
                    case 2:
                        System.out.println("Daftar hotel setelah sorting bintang ");
                        htl.selectionsortBintang();
                        htl.tampil();
                        break;
                }
                break;
            case 2:
                System.out.println("Pilih teknik untuk sorting : ");
                System.out.println("1.Bubble Sort");
                System.out.println("2.Selection Sort");
                System.out.print("pilih (1/2) : ");
                byte choice3 = sc.nextByte();
                switch (choice3){
                    case 1:
                        System.out.println("Daftar hotel setelah sorting Harga ");
                        htl.bubblesortascHarga();
                        htl.tampil();
                        break;
                    case 2:
                        System.out.println("Daftar hotel setelah sorting Harga");
                        htl.selectionsortHarga();
                        htl.tampil();
                        break;
                }
                break;
        }
        sc.close();          
    }
}