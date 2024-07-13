// package chapter14;
// linklist creation 

public class linkedlist1 {  
    public static class Node{
        int data; 
        Node next ;

        public  Node(int data){
            this.data = data;
            this.next = null;

        }

    }
    
    public static Node head;
    public static Node tail;
    public static int size;

     public void print(){ // print link  list function.
        Node temp =  head;
        while(temp != null){
            System.out.print(temp.data +  "->");
            temp = temp.next;
        }
        System.out.println("null");

     }

     public void addMiddle(int data , int idx){
         if(idx == 0){
             addFirst(data);
             return;
            }
        Node newNode = new Node(data);
        size++;

        Node temp =  head ;
        int i = 0;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }    //i = idx -1                i.e previous
        newNode.next  = temp.next;
        temp.next = newNode;
    }

    public void addLast(int data){
            //  step 1 - > create a  new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
       
        // step 2 -> tail next =  newNode;
        tail.next = newNode;
        //  step 3 ->  
        tail = newNode;
    }

    public void addFirst(int data){
        // step 1 -> create new node;
        Node newNode =  new Node(data);
        size++;
        if(head == null){   // linklist is empty
            head  = tail = newNode;
            return;
        }
        
        //  step 2 -> newNode.next = head
        newNode.next = head; // link

        //  step 3 ->  head = newNode
        head = newNode;


    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("Linkedlist empty");
            return Integer.MAX_VALUE;  // infinity  - or  + 
        }else if(size == 1){
            int val = head.data;
            head =  tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public int  removeLast(){
        if(size == 0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1 ){
            int val = head.data;
            head = tail = null;
            size = 0 ; 
            return val;
        }
      // prev: i =  size - 2;
      Node prev = head ;
      for(int i = 0 ; i< size-2; i++){
        prev = prev.next;
      }
      int val = prev.next.data; // tail.data
      prev.next = null;
      tail = prev;
      size--;
      return val;
    }

    public int linearSearch( int key ){
        Node temp = head;
        int i  = 0 ;
        while(temp != null){
            if(temp.data == key){
            return i;
           }
           temp = temp.next;
           i++;
        }
        return -1;               // key not found

    }
      
    
    public int helper(Node head , int key){  // T.C = O(n)       // to change head helper fn used // actual recursive function
        if(head == null){   // base case
            return -1;
        }

        if(head.data == key ){
            return 0;
        }
        int  idx =  helper(head.next , key );
        if(idx == -1){
            return  -1; 
        }
        return idx + 1;

    }
    
    public int recSearch(int key ){
        return helper(head , key);
    }

    public static void main(String[] args) {
        linkedlist1 ll = new linkedlist1();
    // addition  and deletion is not done in main  functin. i.e done in some othe method 
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        
        ll.print();
        ll.addFirst(2);
        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addLast(4);
        ll.print();

        ll.addLast(5);
        ll.print();

        ll.addMiddle(3, 2);
        ll.print();
        
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        System.out.println(ll.linearSearch(3));    //iterative search 
        System.out.println(ll.linearSearch(30));    //iterative search 
        System.out.println(ll.recSearch(3));    //recurssive search 


    }
}
