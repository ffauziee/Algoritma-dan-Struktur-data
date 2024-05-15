package quiz2mi1a;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();
        //lanjutkan dengan memanggil method addFirst, deleteLast, printFromTail
        //jawaban
        dll.deleteLast();
        dll.printFromTail();
        //lanjutkan dengan memanggil method merge, split
        //jawaban
        // Demonstrating the split method
        DoubleLinkedList dll3 = new DoubleLinkedList();
        dll3.addFirst(2);
        dll3.addFirst(3);
        dll3.addFirst(4);
        dll3.addFirst(34);
        dll3.addFirst(2);
        dll3.addFirst(3);
        dll3.addFirst(45);
        dll3.addFirst(4);
        dll3.print();

        // Call the split method
        split(dll3);
    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,DoubleLinkedList dll2){
        //complete this method
    }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
        //jawaban
        if (dll.isEmpty()) {
            System.out.println("List masih kosong!");
            return;
        }

        DoubleLinkedList dll1 = new DoubleLinkedList();
        DoubleLinkedList dll2 = new DoubleLinkedList();

        Node tmp = dll.head;
        int mid = dll.size / 2;
        int count = 0;

        // Split dll1 dan dll2
        while (tmp != null) {
            if (count < mid) {
                dll1.addFirst(tmp.data);
            } else {
                dll2.addFirst(tmp.data);
            }
            tmp = tmp.n;
            count++;
        }

        // Print hasil list
        System.out.print("List 1 -> ");
        dll1.print();
        System.out.print("List 2 -> ");
        dll2.print();
    }
}
