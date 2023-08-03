//Optimizing bubble sort in the case of nearly sorted arrays by keeping the track of swaps
//Time Complexity: worst case-> O(n^2)
//Time Complexity: best case-> O(n)
public class BubbleSort2 {

    static void bubbleSort(int[] arr){
        //sorting in ascending order
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            boolean flag = false;//for every iteration of i we will check if the swapping has happened
            for(int j=0;j<n-i-1;j++){//inner loop to swap the elements 
               
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
    
            }
            if(flag == false){
            return;
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

//stable bubble sort: order of appearence of duplicate elements is same
//unstable bubble sort: order of duplicates is not confirmed
//Bubble sort = stable sort(not considering equality)
//It is an in-place algo : no extra space needed 