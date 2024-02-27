//reversing the array using the two pointer approach

import java.util.ArrayList;

public class reverseArray {

    public static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        int start = 0;
        int end = arr.size()-1;

        while(start <= end){
            int temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end, temp);
            start ++;
            end --;
        }
        return arr;
    }

    public static void print(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        reverse(arr);
        print(arr);
        
    }
}
