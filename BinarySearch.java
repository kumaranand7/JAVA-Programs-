public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[]={11,22,33,44,55,660};
        int target=44;


         int start=0;
         int end=arr.length-1;


         while(start<=end){
            int mid=(start+end)/2;


            if(target==arr[mid]){
                System.out.println(target+ " element is at index "+ mid);
                break;
            }

            else if(target<arr[mid]){
                end=mid-1;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }

         }
    }
    
}
