//using recursive approach--T.C.=O(logn)
public class BinarySearch2 {
     public static boolean recBinarySearch(int [] arr,int start,int end,int target){
            //base case
            if(start > end){
                return false;
            }
            int mid=(start+end)/2;
            if(target == arr[mid]){
                return true;
            }
            else if (target<arr[mid]){
               return recBinarySearch(arr, start, mid-1, target);
            }
            
           else {
                return recBinarySearch(arr, mid+1, end, target);
            }
            
            
     }
     public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n=arr.length;
        int target=0;
        while(target <=10){ //checking for multiple test cases
            System.out.printf("%d exists in the array: %b\n",target,recBinarySearch(arr,0,n-1,target));
            target++;
        }
     }
    
}
