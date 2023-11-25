public class a1_StaticMethodEg {

    static void f1(){

       System.out.println("Agar koi method static keyword ke sath declare kiya gaya hai, toh use class level par call kiya ja sakta hai, bina class ka object create kiye.");
           }

           static void f2(){

        f1();

           }

    public static void main(String[] args) {

        f1();
        f2();
    }
}
