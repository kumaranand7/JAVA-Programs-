public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = { 7, 4, 5, 8, 99, 3, 44, 1 };

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    // swap
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }

        }

        for(int element : arr){ 
        System.out.println(element);
        }
    }
}
