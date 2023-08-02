//Implementing Singly LinkedList from scratch

public class LinkedList{
    static Node head;
    private static int size;
    
    LinkedList(){
        this.size=0;
    }
    
    public static class Node{
        int data;
       
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size+=1;
            
        }
    }

        //adding nodes from head
        public void addFirst(int data){
            //creating a new node
            Node newNode = new Node(data);
            //if the LinkedList is empty--> add a newNode
            if(head == null){
                head = newNode;
                return;
            }
            //else add the new node from head
            newNode.next = head;
            head = newNode;
        }

        //adding nodes from last
        public void addLast(int data){
                Node newNode = new Node(data);
                if(head == null){
                head = newNode;
                return;
            }
            //creating a curr node pointing towards head to traverse the linked list
            Node currNode = head;
            while(currNode.next != null){
                //keep traversing
                currNode=currNode.next;
            }
            //adding the new node at the tail
            currNode.next = newNode;

        }

        //deleting nodes from head
        public void deleteFirst(){
            if(head == null){
                System.out.println("The List is Empty");
                return;
            }
                size-=1;
                head = head.next;
        }

        //deleting nodes from the tail
        public void deleteLast(){
            if(head == null){
                System.out.println("The list is Empty");
            }
            //if only 1 node is present
            size-=1;
            if(head.next == null){
                head = null;
                return;
            }
            //traverse till the second last node
            Node secondLast = head;
            Node lastNode = head.next;

            while(lastNode.next != null){
                secondLast=secondLast.next;
                lastNode=lastNode.next;
                
            }
            secondLast.next = null;
        }

        //size
        public int getSize(){
            return size;
        }

        //printing the list
        public void printList(){
            if(head == null){
                System.out.println("The List is Empty");
            }
            Node currNode = head;
            while(currNode != null){ // if currNode.next then it will traverse only till second last element and not print the last one
                System.out.print(currNode.data+"->");
                currNode  =currNode.next;
            }
            System.out.println("Null");
        }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList();

        list.addFirst(0);

        list.printList();

        list.addLast(6);
        list.deleteFirst();
        list.printList();

        list.addLast(7);
        list.deleteLast();
        list.printList();
       
       System.out.println(list.getSize()); 

    }
   
}