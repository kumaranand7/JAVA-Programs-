//reverse array using two pointer approach

public class ArrayReverse { 

    public static void main(String[] args) {
        
        int arr[]={7,4,5,8,99,3,44,1};

        int start=0;
        int end=arr.length-1;

        while(start<end){

            int tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;

            start++;
            end--;
        }

        System.out.println("Reverse array is: ");
        for (int i : arr) {
            System.out.print(i+ " ");
            
        }
    }
    
}
