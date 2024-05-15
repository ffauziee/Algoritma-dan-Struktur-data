public class mahasiswaWeek11 {
    String nama, nim;

    mahasiswaWeek11(){
            
    }
    
    mahasiswaWeek11(String ni, String na){
        nama = na;
        nim = ni;
    }

    public void print(){
        System.out.println("NIM\t= " + nim);
        System.out.println("Nama\t= " + nama);
        System.out.println();
    }
}

