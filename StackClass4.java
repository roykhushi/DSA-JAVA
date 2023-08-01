//Push an element at the bottom of the stack

import java.util.Stack;

public class StackClass4 {
    public static void pushAtBottom(int data, Stack<Integer>s){
        //base case
        if(s.isEmpty()){ //when stack is empty add the data
            s.push(data);
            return;
        }
        int top = s.pop(); //removing tos 
        pushAtBottom(data, s); //recursively calling the func until stack isn't empty
        s.push(top); //start adding the top
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4,s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
