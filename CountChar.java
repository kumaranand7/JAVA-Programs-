// Find the number of occurrences of a character in a String

public class CountChar {
    public static void main(String[] args) {
        
        char ch='D';

        String str="ANAND";
        int c=0;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)==ch)
            c++;
        }
        System.out.println(c);
    }
    
}
