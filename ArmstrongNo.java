public class ArmstrongNo {
    public static void main(String[] args) {
        
        int n=153;
        int original=n;
        int res=0; 

        while(n>0){
            int tmp=n%10;
            res=res+(tmp*tmp*tmp);
            n=n/10;
        }

        if(original==res){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
