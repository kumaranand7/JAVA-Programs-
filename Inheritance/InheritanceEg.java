package Inheritance;

public class InheritanceEg {
    public static void main(String[] args) {

        Phone basicPhone = new Phone();
        basicPhone.canCall();
        basicPhone.torch();

        System.out.println("----------");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.canCall();           // Inherited from Phone
        smartPhone.torch();             // Overridden method in SmartPhone
        smartPhone.browseInternet();    // Method specific to SmartPhone
    }
}
