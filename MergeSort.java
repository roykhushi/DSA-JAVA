//Implementing Merge Sort
//divide and conquer algo
//Time Complexity O(nlogn)
//Space Complexity O(n)

public class MergeSort {

    public static void conquer(int arr [], int startIndx, int mid, int endIndex){
        int merged [] = new int [endIndex - startIndx +1];
        int idx1 = startIndx; //traversing the left subarray
        int idx2 = mid+1; // traversing the right subarray
        int x = 0; // traversing the merged array

        while(idx1 <= mid && idx2 <= endIndex){
            if(arr[idx1] <= arr[idx2]){ // comparing the elements in two subarrays
                merged[x++] = arr[idx1++]; //feeding, if any value is smaller in the left subarray into the new array and increasing the pointer to search for the next elements
            }
            else{
                merged[x++] = arr[idx2++];  // if right subarray has the smaller value
            }
        } 
        //feeding the left out values from the two subarrays into the new array 
        while(idx1 <= mid){
            merged[x++] = arr[idx1++]; 
        }
        while(idx2 <= endIndex){
            merged[x++] = arr[idx2++];
        }
        for(int i=0,j=startIndx; i<merged.length;i++,j++){ //merging the array
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int startIndx, int endIndex){
        if(startIndx >= endIndex){
            return;
        }
        int mid = startIndx + (endIndex-startIndx)/2; //for diving the array into two halves
        divide(arr, startIndx, mid); //left subarray
        divide(arr, mid+1, endIndex); //right subarray
        conquer(arr, startIndx, mid, endIndex); //merging 
    }

    public static void main(String[] args) {
        int arr[] ={9,8,7,6,5,4,3,2,1,0 };
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int element: arr){
            System.out.print(element+" ");
        }
        
    }
}
