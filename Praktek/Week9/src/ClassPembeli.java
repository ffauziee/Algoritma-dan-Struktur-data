public class ClassPembeli {
    Pembeli[] data;
    int front, rear, size, max;

    

    public ClassPembeli(int n){
        max = n;
        data = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }

    public void peek(){
        if (!isEmpty()){
            System.out.println("Antrian terdepan:");
            System.out.println("Nama: " + data[front].nama);
            System.out.println("No HP: " + data[front].noHP);
            System.out.println();
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if (!isEmpty()){
            System.out.println("Antrian terakhir: ");
            System.out.println("Nama: " + data[rear].nama);
            System.out.println("No HP: " + data[rear].noHP);
            System.out.println();
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public Pembeli peekPosition(String kodeNama){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }

        int index = front;
        for (int i = 0; i < size; i++) {
            Pembeli cariAntrian = data[index];
            if (cariAntrian.nama.equalsIgnoreCase(kodeNama)) {
                System.out.printf("Antrian atas nama %s berada pada antrian ke-%d\n",data[index].nama, i+1 );
                return cariAntrian;
            }
            index = (index + 1) % max; // Move to the next index in a circular manner
        }
        
        System.out.println("Antrian tidak ditemukan");
        return null;

    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            int queueNumber = 1; // Counter for queue number
            while (i != rear) {
                System.out.println("Nomor Antrian: " + queueNumber);
                System.out.println("Nama: " + data[i].nama);
                System.out.println("No HP: " + data[i].noHP);
                System.out.println(); // Add an empty line for separation
                i = (i + 1) % max;
                queueNumber++;
            }
            // Print the last element in the circular queue
            System.out.println("Nomor Antrian: " + queueNumber);
            System.out.println("Nama: " + data[i].nama);
            System.out.println("No HP: " + data[i].noHP);
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void clear(){
        if(isEmpty()){
            front = rear = -1;
            size =0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli dt){
        if(isFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()){
                front = rear =0;
            } else {
                if (rear == max -1){
                    rear =0;
                } else {
                    rear ++;
                }
            }
        }

        data[rear] = dt;
        size++;
    }

    public Pembeli Dequeue(){
        Pembeli dt = new Pembeli();
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            } else {
                if (front == max -1){
                    front = 0;
                } else {
                    front ++;
                }
            }
        }
        
        return dt;
    }
}
