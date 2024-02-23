//finding relative prime nos (co-primes)
import java.util.*;
public class eulersPhiAlgo {
    static int phi(int n){
        int result=1;
        for(int i=2;i<n;i++){
            if(gcd(i,n) == 1){
                result +=1;
            }
        }
        return result;
    }
    static int gcd(int i , int n){
        if(i ==0){
            return n;
        }
        return gcd(n%i,i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        System.out.println("relatively primes are " + phi(n));
    }
}
