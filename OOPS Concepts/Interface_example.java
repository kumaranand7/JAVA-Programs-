interface Walking {

    void walk();
}

interface Swimming {
    void swim();
}

class Penguin implements Swimming {
    public void swim() {
        System.out.println("Penguin can swim");
    }
}

class Human implements Walking, Swimming {
    public void walk() {
        System.out.println("Human can walk");
    }

    public void swim() {
        System.out.println("Human can swim");
    }
}

public class Interface_example {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.swim();
        obj.walk();

        Swimming obj2 = new Penguin();
        obj2.swim();
    }
}
