public class doubleLinkedList {
    node10 head;
    int size;

    public doubleLinkedList () {
        head = null;
        size=0;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public void addFirst (int item) {
        if (isEmpty()) {
            head = new node10(null, item, null);
        }else {
            node10 newNode = new node10(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size ++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        }else {
            node10 current = head;
            while (current.next != null) {
                current = current.next;
            }
            node10 newNode = new node10(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add (int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            node10 current = head;
            int i =0;
            while (i< index) {
                current=current.next;
                i++;
            }
        if (current.prev == null){
            node10 newnode10 = new node10(null, item, current);
            current.prev = newnode10;
            head = newnode10;
        } else {
            node10 newnode10 = new node10(current.prev, item, current);
            newnode10.prev = current.prev;
            newnode10.next = current;
            current.prev.next = newnode10;
            current.prev = newnode10;
        }
    }
    size++;
}
public int size(){
    return size;
}

public void clear () {
    head = null;
    size =0;
}

public void print() {
    if (!isEmpty()) {
        node10 tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "\t");
            tmp = tmp.next;
        }
        System.out.println("\nberhasil diisi");
    } else {
        System.out.println("Linked List Kosong");
    }
}

public void removeFirst ()  throws Exception {
    if (isEmpty()) {
        throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
    } else if (size ==1) {
        removeLast();
    }else {
        head = head.next;
        head.prev = null;
        size--;
    }
}

public void removeLast () throws Exception {
    if (isEmpty()) {
        throw new Exception("Linked list masih kosong tidak dapat dihapus!");
    } else if (head.next == null) {
        head = null;
        size --;
        return;
    } 
    node10 current = head;
    while (current.next.next != null) {
        current= current.next;
    }
    current.next = null;
    size--;
    }

    public void remove (int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas");
        } else if (index ==0) {
            removeFirst();
        } else {
            node10 current = head;
            int i =0;
            while (i<index){
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null ;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev=current.prev;
            }
            size --;
        }
    }

    public int getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }

    public int getLast () throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        node10 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        node10 tmp = head;
        for (int i =0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}