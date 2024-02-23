//finding sqrt of a no using binary search upto three decimal places
import java.util.*;
public class sqrtx{
    public static int binarySearch(int n){
        int start = 0;
        int end = n;
        int ans = -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            
           // long sq = (mid*mid);
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid > n){
                end = mid-1;
            }
            else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }

    public static double precision(int n,int places,int intPart){
        double factor = 1;
        double ans = intPart;
        for(int i=0;i<places;i++){
            factor /= 10;
            for(double j=ans;j*j<n;j+=factor){
                ans = j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int intPart = binarySearch(n);
        System.out.println("The sqrt of the number is :" + precision(n, 3 , intPart));
    }
}
