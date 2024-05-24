public class a1_MethodOverloadingExample {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        a1_MethodOverloadingExample obj = new a1_MethodOverloadingExample();

        System.out.println(obj.add(2, 4));
        System.out.println(obj.add(23, 4, 23));

        // Use System.out.println to print the result of the float method
        System.out.println(obj.add(34.5f, 43.5f, 34.4f));
    }
}
