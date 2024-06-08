package Overloading;



public class OverloadingProgram {

  
    public static void main(String[] args) {

        Calculator obj= new Calculator();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2,3, 9));
        System.out.println(obj.add(2.5f,3.43f, 9.4f));
        
        
    } 

    
}