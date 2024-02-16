public class swapAlternate {

    public static void printArray(int [] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void swapAlt(int [] arr,int n){
        n = arr.length;
        for(int i=0;i<n;i+=2){
            if(i+1<n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        //result = {2,1,4,3,6,5}
        swapAlt(arr, 6);
        printArray(arr, 6);
       
    }
}
