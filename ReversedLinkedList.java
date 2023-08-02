public class ReversedLinkedList {
    static Node head;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static void reverseIterate(){
        //if list is empty or has a single element
        if(head == null || head.next == null){
            System.out.println("The list is reversed");
            return;
        }
        Node prevNode = head;
        
    }
}
