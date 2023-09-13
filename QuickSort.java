//Implementing Quick Sort
//using pivot and partition
//making the last element as the pivot and comparing elements w it
/*Time Complexity: O(n^2) in worst--> occurs always when the pivot is the smallest or the largest element 
                   O(nlogn) in avg
Space Complexity: O(logn)
*/
 
public class QuickSort {
    public static int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1; //tracks the space to be left for the elements smaller than pivot

        for(int j=low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //placing pivot at its correct position
        
        i++; //making place for pivot
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;//pivot index

    }
    public static void quickSort(int[]arr,int low,int high){
        if(low < high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
        
    } 
   public static void main(String[] args) {
    int [] arr = {9,8,7,6,5,4,3,2,1,0};
    int n = arr.length;

    quickSort(arr, 0, n-1);
    System.out.print("The sorted array using Quick Sort is : ");
    for(int element: arr){
        System.out.print(element+" ");
    }
   } 
}
