import java.util.Scanner;
public class searchIn2DArray {

    public static boolean isPresent(int [][] arr, int target,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in 2D Array: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns in 2D Array: ");
        int col = sc.nextInt();

        //memory allocation
        int [][] arr = new int[row][col];
        
        System.out.println("Enter the array elements: ");
        //getting the array elements;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //printing the array elements
        System.out.println("The array elements are : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //function to search for an ele in the array
        System.out.println("Enter an element to search in the array: ");
        int target = sc.nextInt();
        if(isPresent(arr,target,row,col)){
            System.out.println("Element Found!");
        }
        else{
            System.out.println("Element not found!");
        }

        sc.close();

    }
}
