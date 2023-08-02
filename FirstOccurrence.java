//return the first index of a given repeating element else return -1

public class FirstOccurrence {
    
    public static int firstOcc(int[] arr,int x){
        int n=arr.length;
        int index=-1;//index to track the repeating element
        int start=0;
        int end=n-1;
        while(start <= end){
            int mid=start + (end-start)/2;
            if(arr[mid] == x){
                index = mid;
                //to check other occurrences possible
                end = mid-1; //checking on the left side
            }
            else if(x < arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

            
        }
        return index;



    }
    public static void main(String[] args) {
        int [] arr = {1,2,5,5,5,5,6,7};
        int x=5;
        System.out.println(firstOcc(arr, x));
    }
}
