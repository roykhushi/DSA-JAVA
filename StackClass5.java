//Reverse the stack

import java.util.Stack;

public class StackClass5 {
   
    public static void pushAtBottom(int data, Stack<Integer>s){
        //base case
        if(s.isEmpty()){ //when stack is empty add the data
            s.push(data);
            return;
        }
        int top = s.pop(); //removing tos 
        pushAtBottom(data, s); //recursively calling the func until stack isnt empty 
        s.push(top); //start adding the top
    }

    public static void reverse(Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            return;
        }
        //remove the tos
        int top=s.pop();
        reverse(s);
        pushAtBottom(top,s); //adding the element at bottom
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
