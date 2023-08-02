//Reversing the LinkedList using Iterative approach 
//Space Complexity: O(1);
//Time Complexity: O(n);

public class ReversedLinkedList {
    static Node head;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data){
        if(head == null){
            return;
        }
        Node newNode = new Node(data);
        Node traverseNode = head;
        while(traverseNode.next != null){
            traverseNode = traverseNode.next;
        }

        traverseNode.next = newNode;
        
        
    }
    //printing 
    public void printList(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }
    public static void reverseIterate(){
        //if list is empty or has a single element
        if(head == null || head.next == null){
            System.out.print("The list is reversed");
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head = prevNode;
    }
    public static void main(String[] args) {
        ReversedLinkedList list = new ReversedLinkedList();
        list.addFirst(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.reverseIterate();
        list.printList();
    }
}
