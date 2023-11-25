import java.lang.StringBuffer;


public class StringBufferr {

    public static void main(String[] args) {

        String str = new String("Helloo");   // immutable
        str.concat("world");
        System.out.println(str);   // Helloo

        str = str + " Gupta";
        System.out.println(str); // Helloo Gupta

        StringBuffer sb = new StringBuffer("Anand");  // mutable
        sb.append(" Gupta");
        System.out.println(sb);  // Anand Gupta

        StringBuilder sbb = new StringBuilder("Anand");  // mutable
        sbb.append(" Gupta");
        System.out.println(sbb);  // Anand Gupta

    }
}
