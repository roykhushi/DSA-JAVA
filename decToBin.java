import java.util.*;
public class decToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert into Binary ");
        int n = sc.nextInt();

        double ans = 0;
        int i =0;
        while(n!=0) {
            int bit = n & 1; //getting the rightmost bit 
            ans = (bit*(Math.pow(10,i))) + ans ; //storing the bit
            n = n >> 1; //shifting the bit to right by one position //dividing by 2
            i++;
            
        }
        System.out.println("The binary form is " + (int)ans);
    }
}
