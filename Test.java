class A {
    void fun1() {
        System.out.println("fun1 is called from A");
    }
}

class B extends A {
    void fun2() {
        System.out.println("fun2 is called from B");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.fun1();

        B obj2 = new B();
        obj2.fun1();
        obj2.fun2();

        A obj3 = new B();
        obj3.fun1();

        // Now, to call fun2 on obj3, you need to cast obj3 to B
        if (obj3 instanceof B) {
            ((B) obj3).fun2();


            int intValue=100;
            double doubleValue=intValue;
            System.out.println(doubleValue); //implicit type casting
            System.out.println(intValue);

            double doubleValue1=12.6;
            int intValue1= (int )doubleValue1;  //explicit type casting


            int intVar=10;
            float floatVar= intVar;

            float floatVar1= 10.4f;
            int intVar1= (int )floatVar1;
            System.out.println(floatVar1);
            System.out.println(intVar1);




        }
    }
}
