//Implementing circular queue using array

import java.util.Queue;

public class QueueClass2 {
    static class Queue2{
        static int arr[];
        static int size;
        static int front=-1;
        static int rear=-1;

            Queue2(int n){
                arr= new int[n];
                this.size=n;
            }

        //isEmpty() func
        public static boolean isEmpty(){
            return rear == -1 && front ==-1;
        }

        //isFull() func
        public static boolean isFull(){
            return (rear+1)%size == front;
            //System.out.println("The queue is full");
        }

        //enqueue-->O(1)
        public static void add(int data){
            if(isFull()){
                System.out.print("Queue is Full");
                return;
            }
            //adding the first element
            //update front 
            if(front == -1){
                front = 0;
            }
            //update rear
            rear = (rear+1) % size; //if size=6,rear=5,updated rear =0-->element added at 0;

            arr[rear] = data;

        }

        //dequeue-->O(1)
        public static int remove(){ //return type-->int coz remove the element and return it
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result= arr[front];
            if(rear==front){//if single element in queue 
                rear=front=-1;
            }
            else{//updating front to 1st index 
                front=(front+1)%size;
            }
            return result;

        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
         Queue2 q = new Queue2(10);
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         
         //removing the first ele and printing it 
         System.out.println(q.remove());
         //adding 6
         q.add(6);
         //removing 2nd ele
         System.out.println(q.remove());
         //adding 7
        q.add(7);

         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
         
    }
}
