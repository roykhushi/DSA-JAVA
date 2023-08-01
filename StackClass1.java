//IMPLEMENTATION OF THE STACK USING LINKEDLIST

public class StackClass1{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class Stack{
        public static Node head;

        //function to check if the stack if empty 
        public static boolean isEmpty(){
            return head==null;
        }

       
        //implementing push function
        public static void push(int data){
            //creating a new node for the data
            Node newNode= new Node(data);

            if(isEmpty()){//if stack is empty then new node is the tos
                head=newNode;
                return;
            }
            //if already existing elements
            newNode.next=head;
            head=newNode;
        }

         //implementing pop function--> returns the popped ele
         public static int pop(){
           
            if(head==null){ //if stack is empty
                return -1;
            }
            int top = head.data;
            head = head.next;

            return top;
         }


         //implementing peek function
         public static int peek(){
            if(head==null){ //if stack is empty
                return -1;
            }
            return head.data;
         }

    }
    public static void main(String[] args) {
        Stack s= new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        //printing the stack
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}