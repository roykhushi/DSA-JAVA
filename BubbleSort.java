//Implementing Bubble Sort
//Time Complexity = O(n^2)

public class BubbleSort {

static void bubbleSort(int[] arr){
    //sorting in ascending order
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){//inner loop to swap the elements 
            if(arr[j]>arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

        }
    }
}
    public static void main(String[] args) {
        int [] arr = {7,6,5,4,3,2,1,0}; 
        bubbleSort(arr);
        for(int element: arr){
            System.out.print(element+" ");
        }

    } 
}
