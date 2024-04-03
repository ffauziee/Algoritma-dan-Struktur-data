import java.util.Scanner;
public class MainMahasiswajb3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswajb3 mhs[] = new Mahasiswajb3[3];
        double sum = 0;

        for(int i = 0; i < mhs.length; i++) {
            
            System.out.println("Masukkan data Mahasiswa ke-" + i);
            System.out.print("Nama Mahasiswa: ");
            String newNama = sc.next();
            System.out.print("Nim Mahasiswa: ");
            String newNim = sc.next();
            System.out.print("Masukkan jenis kelamin: ");
            String newJK = sc.next();
            System.out.print("Masukkan IPK: ");
            double newIPK = sc.nextDouble();
            mhs[i] = new Mahasiswajb3(newNama, newNim, newJK, newIPK);
            sum +=mhs[i].IPK;
        }
        for(int i = 0; i < mhs.length; i++){
            mhs[i].print();
        }
        double rata2 = sum/ mhs.length;
        System.out.println("Rata-rata IPK mahasiswa: " + rata2);
        sc.close();
        
    }
}
