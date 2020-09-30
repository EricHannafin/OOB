public class FloatAndDouble {

    public static void main(String[] args) {

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("Minimun float value is " + minFloat);
        System.out.println();
        System.out.println("Maximum float value is " + maxFloat);
        System.out.println();
        System.out.println("Minimum double value is " + minDouble);
        System.out.println();
        System.out.println("Maximum double value is " + maxDouble);

        System.out.println();

        int myIntValue = 5 / 3;                  // cant handle the decimal point
        float myFloatValue = 5F / 3F;
        double myDoubleValue = 5 / 3;

        System.out.println("My float value " +  myFloatValue);
        System.out.println();

        System.out.println("My int value " + myIntValue);
        System.out.println();

        System.out.println("My double value " + myDoubleValue);
        System.out.println();

    }
}
