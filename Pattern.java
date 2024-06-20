

public class Pattern {

    public static void pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {

                System.out.print("* ");
            }
            System.out.println();

        }

    }



    public static void pattern2(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {

                System.out.print("* ");
            }
            System.out.println();

        }

    }


    public static void pattern3(int n) {

        for (int row = 1; row <= n; row++) {

        for(int space=1; space<=n-row; space++){
            System.out.print("  ");
        }


            for (int col = 1; col <= row; col++) {

                System.out.print("* ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        int n = 5;

// *
// **
// ***
// ****
// *****
System.out.println("pattern 1");
        pattern1(n);


// *****
// ****
// ***
// **
// *
System.out.println("pattern 2");

pattern2(n);


// *
// **
// ***
// ****
// *****
System.out.println("pattern 3");

pattern3(n);




    }

}
