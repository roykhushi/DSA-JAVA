//IMPLEMENTING STACK USING ARRAYLIST

import java.util.ArrayList;
import java.util.Stack;

public class StackClass2 {
    
    static class Stack2{
        static ArrayList<Integer> list = new ArrayList<>();

        //checking if the stack is empty
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop function

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            //getting the tos
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek function

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack2 s= new Stack2();

        s.push(1);  
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5); //tos

        //printing the stack
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
