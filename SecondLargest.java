public class SecondLargest {

    // Method to find the largest element in the array
    public static int largest(int[] arr) {
        int MAX_ELEMENT = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] > MAX_ELEMENT) {
                MAX_ELEMENT = arr[i];
            } 
        }
        return MAX_ELEMENT;
    }

    // Method to find the second largest element in the array
    public  int secondLargest(int[] arr, int max_element) {
        int s_MAX_ELEMENT = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] > s_MAX_ELEMENT && arr[i] < max_element) { 
                s_MAX_ELEMENT = arr[i];
            }
        }
        return s_MAX_ELEMENT;
    }

    public static void main(String[] args) {
        int arr[] = {7, 4, 555, 8, 99, 2};
        int max_element = largest(arr);
        System.out.println("Largest element is " + max_element);
        SecondLargest obj = new SecondLargest();
        System.out.println("Second Largest element is " + obj.secondLargest(arr, max_element));
    }
}
