class A {

    A() {
        System.out.println("Constructor from class A called");
    }
}

class B extends A {

    B() {
        System.out.println("Constructor from class B called");
    }

}

class C extends B {

    C() {
        System.out.println("Constructor from class C called");
    }
}

public class ConstrProgram {

    public static void main(String[] args) {

        C obj = new C();

    }

}
