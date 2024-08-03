package HashMap;

import java.util.HashMap;

public class HashMapEg {

    public static void main(String [] args){

        //put and get method

        HashMap <String, Integer> l1= new HashMap<>();

        l1.put("Anand", 1);
        l1.put("Kumar", 2);
        l1.put("Gupta", 3);
        l1.put("Anandd", 1);
        l1.put("Kumarr", 22);
        l1.put("Gupta1", 33);

        System.out.println(l1);

        System.out.println(l1.get("Kumar"));

        // o/p ==> {Gupta=3, Kumarr=22, Kumar=2, Anandd=11, Anand=1, Gupta1=33}
        // 2  

        // unordered
        // do not store dublicate key  if dublicate 




    }
    
}
