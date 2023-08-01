//Implementing queue using LinkedList

public class QueueClass3 {
   static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;

        }
    }
    static class Queue3{
        static Node head=null;
        static Node tail=null;

       //isEmpty()
       public static boolean isEmpty(){
            return head == null && tail==null;
       } 

       //adding a newNode from tail
       public static void add(int data){
        Node newNode = new Node(data);
            if(tail==null){//if only 1 element
                tail=head=newNode;
                return;
            }
            tail.next= newNode;
            tail=newNode;
        }
       
        //removing element from front
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.data;
            
            if(head == tail){//if only single element
                tail = null;
            }
            head=head.next; //element removed
            return front;
        }

        //peek()
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue3 q= new Queue3();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

    
    
}
