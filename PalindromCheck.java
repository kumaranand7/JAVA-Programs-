// How do you determine if a string is a palindrome?


import java.util.*;
public class PalindromCheck {


    public static String reverseString(String str){

     
        String nstr="";
        for(int i=str.length()-1; i>=0; i--){
            nstr= nstr+str.charAt(i);
                }
                return nstr;
    }

    public static boolean checkPlaindrom(String reverse,String str  ){


        return str.equals(reverse);
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the any string:");
        String str=sc.nextLine();

        

          String reverse= reverseString(str);
          
          Boolean result= checkPlaindrom(reverse,str);
          System.out.println(result);

     

        
    }

}