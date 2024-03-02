
public class reverseWords {

    public static String reverseWords2(String word){
        String [] str = word.split("\s");
        String res = "";
        for(int i=str.length-1;i>=0;i--){
            res += str[i] + " ";
        }
        return res;
    }
    public static void main(String[] args) {
        String word = "My name is Khushi"; //--> 
        System.out.println(reverseWords2(word));
    }
}
