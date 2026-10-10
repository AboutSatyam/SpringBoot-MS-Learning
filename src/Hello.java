
public class Hello {
    public static void main(String[] args) {
        int a = 110;
        int b = 212;
        int c = 10;
        int d = 0;


        /**
         * As We Know This is A way to declare the documentation
         *
         */
        try {
            if (a > 100 && b > 200) {
                System.out.println("First If Block");

                if (c == 10 || a < 50) {
                    System.out.println("Nested If Block");
                } else if (!(b < 100)) {
                    System.out.println("Nested Else If Block");
                } else {
                    System.out.println("Nested Else Block");
                }

            } else if (a == 10 || b == 12) {
                System.out.println("Second Else If Block");

            } else if (a + b > 500 && c != 0) {
                System.out.println("Third Else If Block");

            } else {
                System.out.println("Last Else Block");
            }

            if (a / c == 11 && b % c == 2) {
                System.out.println("Arithmetic Condition True");
            } else {
                System.out.println("Arithmetic Condition False");
            }

            System.out.println("Division: " + a / d);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught");

        } catch (Exception e) {
            throw new RuntimeException(e);

        } finally {
            System.out.println("Finally Block Executed");
        }

        System.out.println("Program Completed");
    }
}
