//Implementing using 2 stacks 
import java.util.*;
public class QueueClass5 {
    static class Queue4{
       
       static Stack<Integer> s1 = new Stack<>();
       static Stack<Integer> s2 = new Stack<>();

       //isEmpty();
       public static boolean isEmpty(){
        return s1.isEmpty();
       }

       //adding element
       public static void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        //add the data
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
       }

       //remove
       public static int remove(){
         if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
       }
        return s1.pop();
       }
      
       //peek
       public static int peek(){
         if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
       }
        return s1.peek();
       }
       }
       public static void main(String[] args) {
        Queue4 q= new Queue4();
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
