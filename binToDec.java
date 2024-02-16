import java.util.*;
public class binToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no to convert into decimal : ");
        int n = sc.nextInt();

        double ans = 0;
        int i = 0;
        while(n!=0){
            int digit = n%10;
            
            if(digit == 1){
                ans = Math.pow(2, i) + ans;
            }
            n = n/10;
            i++;
        }
        System.out.println("The decimal form is : " + (int)ans);
    }
}
