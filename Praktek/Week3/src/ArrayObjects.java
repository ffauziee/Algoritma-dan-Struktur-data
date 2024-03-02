import java.util.Scanner;

class PersegiPanjang{

    public int panjang;
    public int lebar;

}

public class ArrayObjects {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for (int i = 0; i < ppArray.length; i++){

            ppArray[i] = new PersegiPanjang();
            System.out.println("\nPersegi panjang ke-" + i);
            System.out.println("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();

        }

        for(int i = 0 ; i < ppArray.length; i++){

            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + "Lebar: " + ppArray[i].lebar);

        }

        PersegiPanjang[][] ppArray2 = new PersegiPanjang[3][2];

        ppArray2[0][0] = new PersegiPanjang();
        ppArray2[0][0].panjang = 100;
        ppArray2[0][0].lebar = 50;

        System.out.println("Persegi panjang ke-0 panjang: " + ppArray2[0][0].panjang + ", Lebar: " + ppArray2[0][0].lebar);

        sc.close();
    }
}
