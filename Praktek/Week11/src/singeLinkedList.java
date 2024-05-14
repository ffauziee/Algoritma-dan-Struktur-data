public class singeLinkedList {
    node head, tail;

    public singeLinkedList(){
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if(!isEmpty()){
            node tmp=head;
            System.out.println("Isi linked list:");
            while(tmp != null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("linked list kosong");
        }
    }

    void addFirst(int input){
        node ndInput = new node(input,null);
        if(isEmpty()){
            head= ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        node ndInput = new node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input){
        node ndInput = new node(input, null);
        node tmp = head;
        do{
            if(tmp.data == key){
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                    break;
                }
            }
            tmp = tmp.next;
        }
        while (tmp != null);
    }

    void insertAt(int index, int input){
        if(index < 0){
            System.out.println("Perbaiki logikanya!");
        } else if(index == 0){
            addFirst(input);
        } else{
            node tmp = head;
            for(int i = 0; i < index-1; i++){
                tmp = tmp.next;
            }
            tmp.next = new node(input, tmp.next);
            if(tmp.next.next == null){
                tail = tmp.next;
            }
        }
    }

    int getData(int index){
        node tmp = head;
        for(int i = 0; i < index; i++){
            tmp=tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key){
        node tmp = head;
        int index = 0;
        while(tmp!=null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp==null){
            return -1;
        }else{
            return index;
        }
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("linked list masih kosong tidak dapat dihapus");
        } else if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast(){
        if(isEmpty()){
            System.out.println("linked list masih kosong tidak dapat dihapus");
        } else if(head == tail){
            head = tail = null;
        } else{
            node tmp = head;
            while(tmp.next.next != null) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    void remove(int key){
        if(isEmpty()){
            System.out.println("linked list masih kosong tidak dapat dihapus");
        }else{
            node tmp = head;
            while(tmp != null){
                if(tmp.data == key && tmp == head){
                    removeFirst();
                    break;
                }else if(tmp.next.data == key){
                    tmp.next = tmp.next.next;
                    if(tmp.next == null){
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    void removeAt(int index){
        if(index == 0){
            removeFirst();
        } else {
            node tmp = head;
            for(int i = 0; i < index; i++){
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if(tmp.next == null){
                tail = tmp;
            }
        }
    }
}
