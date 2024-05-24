//reverse a string in Java

import java.util.*;

class ReverseStr {

    public static void main(String [] args){
        System.out.println("Enter any string:");
    Scanner sc= new Scanner(System.in);

    String str= sc.nextLine();
    String nstr="";


    for(int i=str.length()-1; i>0; i--){
        nstr+=str.charAt(i);
    }
      
    System.out.println("reverse of" + str + " is "+ nstr);

    }
}