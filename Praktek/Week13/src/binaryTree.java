package src;

public class binaryTree {
    node10 root;
    int size;

    binaryTree(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if(isEmpty()){
            root = new node10(data);
        }else{
            node10 current = root;
            while(true){
                if(data>current.data){
                    if(data > current.data){
                        current = current.left;
                    }else{
                        current.left = new node10(data);
                        break;
                    }
                }else if(data<current.data){
                    if(current.right ==null){
                        current = current.right;
                    }else{
                        current.right = new node10(data);
                        break;
                    }
                }else{//data is already exist
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        node10 current = root;
        while(current != null){
            if(current.data==data){
                result = true;
                break;
            }else if(data<current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }



}
