// remove all occurrences of a given character from the input string?


public class ReplaceMethod {
    public static void main(String[] args) {
        String str="Australia";
        str=str.toLowerCase();

        //we want to remove a and A

        str=str.replace("a","").replace("A", "");
        System.out.println(str);
    }
    
}
