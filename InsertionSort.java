//Implementing Insertion Sort
//Take an element from the unsorted part and iterate through the sorted part and place ele at correct pos
//Time complexity: O(n^2)
//Space Complexity: O(1)
//Inplace
//Insertion Sort is stable

public class InsertionSort {

    static void insertionSort(int[] arr){
        int n= arr.length;
    for(int i=1; i<n ;i++){//i=1 bcz we're treating arr[0] part in the sorted array
        int j=i; //tracking the sorted part
        while(j>0 && arr[j]<arr[j-1]){
            //swap 
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        insertionSort(arr);
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}
