 //Implementing Selection Sort
 //sorted and unsorted array 
 //Space Complexity: O(1)
 //Time Complexity: O(n^2)
 //Selection is not stable
 //selection sort is an in-place algo

public class SelectionSort {

    static void selectionSort(int [] arr){
        int n = arr.length;
    //traversing the current index(sorted part)
    for(int i=0;i<n-1;i++){

        //finding the min element in the unsorted part of the array
        int min_index = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_index]){
                //update the min index
                min_index = j;
            }
        }
        //swap the values
        if(min_index!= i){ //not swapping the same element with itself
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
        }

    }
    }
    public static void main(String[] args) {
        int [] arr = {7,6,5,4,3,2,1,0};
        selectionSort(arr);
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}
