public class Mahasiswa {
    String nim, nama, jenisKelamin;
    double IPK;

    Mahasiswa(String na,String ni, String jk, double ipk){
        nama = na;
        nim = ni;
        jenisKelamin = jk;
        IPK = ipk;

    }

    void print(){
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: "+ IPK);
    }
}
