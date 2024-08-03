package Encapsulation;

public class Person {

    private int id;
    private String name;


    public void setId(int id, String name) {
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return id;
    }
    

    public String getName() {
        return name;
    }


    Person (int id, String name){
        this.id = id;
        this.name=name;

    }

    public static void main(String[] args) {


        Person p1 = new Person(12,"Anand");
        System.out.println(p1.getId());
        System.out.println(p1.getName());

        Person p2 = new Person(2,"Pratik");
        System.out.println(p2.getId());
        System.out.println(p2.getName());

        
    }
    
}
