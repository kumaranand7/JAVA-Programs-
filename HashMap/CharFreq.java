package HashMap;

import java.util.HashMap;

public class CharFreq {

    public static void main(String[] args) {

        String str = "hhheeffffffffsd";

        char[] ch = str.toCharArray();

        HashMap<Character, Integer> l1 = new HashMap<>();

        for (char element : ch) {

            l1.put(element, l1.getOrDefault(element, 0) + 1);

        }

        // o/p ==> {s=1, d=1, e=2, f=8, h=3}
        System.out.println(l1);

    }

}
