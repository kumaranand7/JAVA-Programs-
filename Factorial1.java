public class Factorial1 {

    public static int factorial(int n){

    if(n<=1){
        return 1;
    }
    else{
        return n*factorial(n-1);
    }



    }
    public static void main(String[] args) {
        
        int n=10;

        int result= factorial(n);
        System.out.println("factorial of "+ n+ "is "+ result);

    }
    
}
