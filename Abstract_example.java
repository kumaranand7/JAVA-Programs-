abstract class Bike {    //abstract class can have const, abst method and non abst method
     int a;
    Bike() { // constructor
        System.out.println("Bike is running:");
    }

    final void changeGear() { // non-abstract method
        System.out.println("Gear change:");
    }

    abstract void run(); // abstract method
}

class Honda extends Bike {

    void run() {
        System.out.println("Honda running");
    }

}

public class Abstract_example {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.changeGear();
        obj.run();
    }
}
