
// find out if the given two strings are anagrams or not?

import java.util.Arrays;

public class AnagramStirng {

    public static boolean checkAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }

    public static void main(String[] args) {

        String str1 = "HEART";
        String str2 = "EARTH";

        boolean result = checkAnagram(str1, str2);
        System.out.println(result);

    }

}
