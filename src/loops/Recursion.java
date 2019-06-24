package loops;

public class Recursion {

    public static void main(String[] args) {
        int value = 10;
        System.out.println(factorial(value));
    }

    private static int factorial(int value) {

        if (value == 1) {
            return 1;
        }
        return factorial(value -1) * value;
    }
}
