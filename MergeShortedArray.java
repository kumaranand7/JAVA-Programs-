import java.util.ArrayList;

public class MergeShortedArray {

    public static void shortedArray(int arr1[], int arr2[]) {
        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] < arr2[j]) {
                    l1.add(arr1[i]);
                } else if (arr2[j] < arr1[i]) {
                    l1.add(arr2[j]);
                }
            }
        }

        for (int element : l1) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        shortedArray(arr1, arr2);
    }
}
