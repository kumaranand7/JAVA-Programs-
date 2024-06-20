
//third largest

// a=1; b=2; c=3;

public class Test2 {

    public static void thirdLarget(int a, int b, int c){

  if(a>b && a>c)
  {
    System.out.println("third largest no. is "+ a);
  }
  else if(b>a && b>c){
    System.out.println("third largest no. is "+ b);
  }
  else{
    System.out.println("third largest no. is "+c);
  }

    }
    public static void main(String[] args) {
        int a=13;
        int b=21;
        int c=5;

        thirdLarget(a,b,c);
         

    }
    
}
