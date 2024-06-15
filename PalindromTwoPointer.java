public class PalindromTwoPointer {
    public static boolean checkPalindrom(String str) {

        // Process the string first: remove spaces and convert to lowercase
        str = str.replace(" ", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        // Check for palindrome
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "madaM";

        boolean isPalindrom = checkPalindrom(str);
        System.out.println(isPalindrom); 
    }
}
