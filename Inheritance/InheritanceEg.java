package Inheritance;

public class InheritanceEg {
    public static void main(String[] args) {

        Phone basicPhone = new Phone();
        basicPhone.canCall();
        basicPhone.torch();

        System.out.println("----------");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.canCall();     
        smartPhone.torch();           
        smartPhone.browseInternet();   
        System.out.println("dial from "+smartPhone.number);         

        System.out.println("----------");

        Phone obj= new SmartPhone();
        obj.torch();  
        System.out.println("dial from "+obj.number);         

    }
}
