//codehelp --> finding pivot in a sorted rotated array
import java.util.*;
public class getPivot {
    public static int getPivot(int[] arr,int n){
        int start = 0;
        int end = n-1;
        while (start < end) {
            int mid = start + (end=start)/2;
            if(arr[mid] >= arr[0]){//bs on first line
                start = mid+1;
            }
            else{
                end = mid;
            }
            
        }
        return start;
    }
    public static void main(String[] args) {
        int [] arr = {7,9,1,2,3};
        int pivot = getPivot(arr, 5);
        System.out.println("The pivot of the array is: " + pivot);

    }
}
