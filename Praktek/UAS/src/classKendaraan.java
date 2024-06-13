public class classKendaraan {
    kendaraan[] data;
    int front, rear, size, max;

    public classKendaraan(int n){
        max = n;
        data = new kendaraan[max];
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

    public void Enqueue(kendaraan dt){
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

    public kendaraan Dequeue(){
        kendaraan dt = new kendaraan();
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

    public void print(){
        if (isEmpty()){
            System.out.println("++++++++++++++++++++++++");
            System.out.println("+transaksi masih kosong+");
            System.out.println("++++++++++++++++++++++++");
        } else {
            int i = front;
            System.out.println("++++++++++++++++++++++++");
            System.out.println("+   Daftar Kendaraan   +");
            System.out.println("++++++++++++++++++++++++");
            while (i!=rear){
                System.out.println();
                System.out.println("|\t"+ data[front].noTNKB+ "\t|\t "+ data[front].nama+ "\t|\t"+ data[front].jenis+ "\t|\t"+ data[front].cc+ "\t|\t"+ data[front].tahun+ "\t|\t"+ data[front].bulanHarusBayar);
                i = (i +1) % max;
            }
            System.out.println("Jumlah Transaksi = " + size);
        }
    }
    
}
