package InterfaceProgram;

interface Swimmer{
    void swim();
}

interface  Walker{
    void walk();
}

class  Dolphin implements Swimmer{
    public  void  swim(){
        System.out.println("Dolphin can swim");
    }

}

class  Human implements  Walker{
    public  void  swim(){
        System.out.println("Human can swim");
    }

    public  void  walk(){
        System.out.println("Human can walk");
    }


}



public class InterfaceEg {
    public static void main(String[] args) {


        Dolphin d1= new Dolphin();
        d1.swim();

        Human h1= new Human();
        h1.swim();
        h1.walk();


    }
}
