public class ApplicationArrays {
    public static void main(String[] args) {
        int[] values;

        values = new int[3]; // allocate enough memory for 3 integers

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        for (int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }

        // initialize array and assign values
        int[] numbers = { 5, 6, 7 };

        for (int k=0; k<numbers.length; k++) {
            System.out.println(numbers[k]);
        }
     }
}
