// Create a simple Employee class with attributes like id, name, and salary. 
// Write a method to give a raise(hike)  to the employee and print the employee details.
// the hike should have two parameters base salary and percentage hike


public class Employee {

   private int id;
   private String name;
   private float salary;

   public void setSalary(int id, String name, float salary) {
    this.id=id;
    this.salary = salary;
    this.name=name;
    
}
    public String getName(){
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getId(){
        return id;
    }

    Employee(int id,float salary, String name ){
        this.id=id;
        this.salary=salary;
        this.name=name;

    }



    public float hike(float salary, int percentage){

     float totalHike= salary + (salary*percentage/100);
     return totalHike;

    }

    
    public static void main(String[] args) {

        Employee obj = new Employee(100,24000,"John");

       
        float finalHike= obj.hike(2300,10);

        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
        System.out.println("hike is "+finalHike);



       
       
        

    }

    
}
