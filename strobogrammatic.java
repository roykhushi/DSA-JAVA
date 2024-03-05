import java.util.*;
public class strobogrammatic {
    public static int isNum(int num){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(6,9);
        map.put(8,8);
        map.put(9,6);
         
        int ans = 0;
        int i = 0;
        while(num>0){
            int curr = num%10;
            int temp = map.getOrDefault(curr, -1);
            if( temp == -1)
                return -1;
            ans += temp* Math.pow(10,i++);
            num = num/10;
        }

        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        System.out.println(isNum(num));

        sc.close();

        
    }
}
