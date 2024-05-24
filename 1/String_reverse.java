public class String_reverse {

    public static void main(String[] args) {

        String str = "HeLlO WoRlD";
        String nstr = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            nstr = nstr + str.charAt(i);
        }

        System.out.println(nstr);
    }
}

