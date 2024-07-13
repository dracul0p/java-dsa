import javax.sound.sampled.LineListener;

// package chapter14;

public class linkedlist2 {
    public class Node{
        int data; 
        Node next;

        public Node(int data ){
            this.data = data;
            this.next = null;
            
            
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head =  tail =  newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head =  tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addMid(int data , int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0; 
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next =  newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
           System.out.print(temp.data + " -> "); 
           temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){           //reverse linked list
        Node prev = null;
        Node curr = tail  =  head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public int NthNodefromEnd(){
        int size = 0 ;
        Node temp =  head;
        while(temp != null){
            temp = temp.next;
            size++;  
            
        }
        // if(n == size){
        //     head = head.next;
        //     return;
        // }
        // // size - n
        // int i = 1;
        // int ToFind = size - 2;
        // Node prev = head;
        return size;

        // while(i < size - 2){
        //     prev = prev.next;
        //     i++;
        // }
        // prev.next = prev.next.next;


    }
    public static void main(String[] args) {
        linkedlist2 ll = new linkedlist2();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMid(8, 1);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.NthNodefromEnd());
    }
}
