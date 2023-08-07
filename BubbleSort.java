//Implementing Bubble Sort
//Time Complexity = O(n^2)
//Space Complexity = O(1)
//max no of swaps in worst case: n(n-1)/2
//n-1 passes
public class BubbleSort {

static void bubbleSort(int[] arr){
    //sorting in ascending order
    int n=arr.length;
    //total n-1 iterations
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){//inner loop to swap the elements 
            //last i elements are already sorted at their correct positions;no need to check them
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
            System.out.print(element + " ");
        }

    } 
}
