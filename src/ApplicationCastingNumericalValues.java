public class ApplicationCastingNumericalValues {

    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23555;

        float floatValue = 8834.8f;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int)longValue;
        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(intValue); // doesn't round, it cut decimal

        byteValue = (byte)235;
        System.out.println(byteValue); // go circle from max to start again from min
    }

}
