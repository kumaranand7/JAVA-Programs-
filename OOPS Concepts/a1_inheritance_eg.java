class Phone {
    void dialNo() {
        System.out.println("Dial a no.");
    }

    void flashLight() {
        System.out.println("Turn on flashlight.");
    }

    void sendSms() {
        System.out.println("Send SMS");
    }
}

class Smartphone extends Phone {
    void cameraOn() {
        System.out.println("Turn camera on");
    }

    void musicPlayer() {
        System.out.println("Play Music");
    }
}

public class a1_inheritance_eg {
    public static void main(String[] args) {
        System.out.println("Phone can: ");

        Phone obj1 = new Phone();
        obj1.dialNo();
        obj1.flashLight();
        obj1.sendSms();

        System.out.println("Smartphone can: ");

        Smartphone obj2 = new Smartphone();
        obj2.dialNo();
        obj2.flashLight();
        obj2.sendSms();
        obj2.cameraOn();
        obj2.musicPlayer();

        // Now, let's use polymorphism
        Phone obj3 = new Smartphone(); // Using the reference type Phone to refer to a Smartphone object

        obj3.dialNo();
        obj3.flashLight();
        obj3.sendSms();
        // obj3.cameraOn();   // This will result in a compilation error
        // obj3.musicPlayer(); // This will result in a compilation error
    } 
}
