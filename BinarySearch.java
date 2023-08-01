//Iterative Approach--> T.C=O(logn)

public class BinarySearch {

    public static boolean binarySearch(int [] arr,int target){
        int n=arr.length;
        //0-based indexing
        int start=0;
        int end=n-1;
        while(start<=end){
        int mid=(start+end)/2; // if array contains large elements use 'mid=start+(end-start)/2'

        if(target == arr[mid]){
            return true;
        }
        else if(target < arr[mid]){
            end = mid-1; //moving to the left side
        }
        else{
            start = mid+1;
        }
    }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int target=0;
        while(target <=10){ //checking for multiple test cases
            System.out.printf("%d exists in the array: %b\n",target,binarySearch(arr,target));
            target++;
        }
        
    }
}
