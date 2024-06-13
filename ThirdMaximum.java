public class ThirdMaximum {

    public static int findMaxElement(int[] array) {
        int maxElement = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > maxElement) {
                maxElement = element;
            }
        }

        return maxElement;
    }

    public static int findSecondMaxElement(int[] array, int maxValue) {
        int secondMaxElement = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > secondMaxElement && element < maxValue) {
                secondMaxElement = element;
            }
        }

        return secondMaxElement;
    }

    public static int findThirdMaxElement(int[] array, int secondMaxValue) {
        int thirdMaxElement = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > thirdMaxElement && element < secondMaxValue) {
                thirdMaxElement = element;
            }
        }

        return thirdMaxElement;
    }

    public static void main(String[] args) {
        int[] numbers = {111, 333, 555, 6666, 888};

        int maxElement = findMaxElement(numbers);
        System.out.println("Max element is " + maxElement);

        int secondMaxElement = findSecondMaxElement(numbers, maxElement);
        System.out.println("Second max element is " + secondMaxElement);

        int thirdMaxElement = findThirdMaxElement(numbers, secondMaxElement);
        System.out.println("Third max element is " + thirdMaxElement);
    }
}
