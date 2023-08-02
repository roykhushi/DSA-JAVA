//Find the square root of a given non integer number rounded off to nearest floor integer value using binary search.

public class FindSqRoot {

    public static int sqrt(int x){
        int start = 0;
        int end = x;
        int ans = -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            long value = mid*mid; //long--> to avoid overflow

            if(value == x){ //perfect squares
                return mid;
            }
            else if(value > x){
                end = mid-1;
            }
            else{
                start = mid+1;
                ans = mid; //for non perfect squares
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 29;
        System.out.println(sqrt(x));
    }
}
