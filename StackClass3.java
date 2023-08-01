//IMPLEMENTING USING JAVA COLLECTIONS FRAMEWORK

import java.util.Stack;

public class StackClass3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5); 
        s.add(6); //tos

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
