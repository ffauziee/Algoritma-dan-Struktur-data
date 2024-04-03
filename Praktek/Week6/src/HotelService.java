public class HotelService {
    Hotel rooms [] = new Hotel[5]; 
    int id;

    void tambah (Hotel h){
        if (id <rooms.length) {
            rooms[id] = h;
            id++;
        }else{
            System.out.println("Jumlah Hotel sudah pebuh !!");
        }
    }

    void tampil (){
        for (Hotel h : rooms) {
            h.tampil();
            System.out.println("=====================================");
        }
    }

    void bubblesortdescBintang() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].bintang > rooms[j - 1].bintang) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j -1] = temp;
                }
            }
        }
    }
    
    void bubblesortascHarga() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j -1] = temp;
                }
            }
        }
    }

    void selectionsortBintang(){
        for (int i = 0; i < rooms.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[min].bintang) {
                    min = j;
                }
            }
            Hotel temp = rooms[i];
            rooms[i] = rooms[min];
            rooms[min] = temp;
        }
    }

    void selectionsortHarga(){
        for (int i = 0; i < rooms.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[min].harga) {
                    min = j;
                }
            }
            Hotel temp = rooms[i];
            rooms[i] = rooms[min];
            rooms[min] = temp;
        }
    }
}