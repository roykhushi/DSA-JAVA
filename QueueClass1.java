//Implementing Queue using array

public class QueueClass1 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n){
            
            arr = new int[n];
            this.size = n;
        }

        

        public static boolean isEmpty(){
            return rear == -1;
        }

        //enqueue(add)-->O(1)
        public static int add(int data){
            //if queue is empty
            if(rear == size-1){
                System.out.println("Queue is full");
            }
            rear+=1;
            arr[rear] = data;
            return data;
        }

        //dequeue(remove)-->O(n)
        public static int remove(){
            if(isEmpty()){ //if empty 
                System.out.println("Queue is empty.Nothing to remove");
            }

            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1]; //shifting elements by one place
            }
            rear--;
            return front;
        }
         
        //peek
        public static int peek(){
             if(isEmpty()){ //if empty 
                System.out.println("Stack is empty.Nothing to remove");
            }

            return arr[0];
        }

    }
    public static void main(String[] args) {
         Queue q = new Queue(10);
         q.add(1);
         q.add(2);
         q.add(3);

         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
         


    }
    
}
