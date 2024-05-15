public class linkedListMhs {
    nodeMhs head;
    int size;
    
    public linkedListMhs(){
        head =null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("List kosong");
        }else{
            nodeMhs tmp = head;
            while(tmp != null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }

    public void addFirst(mahasiswaWeek11 mhs){
        nodeMhs newNode = new nodeMhs(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(mahasiswaWeek11 mhs){
        nodeMhs newNode = new nodeMhs(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            nodeMhs tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }

    public void insertAfter(String afternim, mahasiswaWeek11 mhs){
        if(isEmpty()){
            addFirst(mhs);
        }else{
            nodeMhs tmp = head;
            while(tmp!=null){
                if(tmp.data.nim.equalsIgnoreCase(afternim)){
                    nodeMhs newNode = new nodeMhs(mhs);
                    newNode.next = tmp.next;
                    tmp.next = newNode;
                    size++;
                    break;
                }else{
                    tmp= tmp.next;
                }
            }
        }
    }

    public void insertAt(int idx , mahasiswaWeek11 mhs){
        if(isEmpty()||idx == 0){
            addFirst(mhs);
        }else if(idx==size){
            addLast(mhs);
        }else{
            nodeMhs tmp = head;
            for(int i=0; i<idx-1; i++){
                tmp = tmp.next;
            }
            nodeMhs newNode = new nodeMhs(mhs);
            newNode.next = tmp.next;
            tmp.next = newNode;
            size++;
        }
    }
}
