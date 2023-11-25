public class a1_StaticVarEg {


    static int a=10;

    public static void main(String[] args) {

        System.out.println(a++); //10
        System.out.println(a); //11
        a++;
        System.out.println(a); //12

    }
}
