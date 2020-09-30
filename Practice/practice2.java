public class practice2 {

    // byte short int long

    public static void main(String[] args) {

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer min value is " + myMinIntValue);
        System.out.println("Integer max value is " + myMaxIntValue);
        System.out.println("Busted max value is " + (myMaxIntValue + 1));
        System.out.println("Busted min value is " + (myMinIntValue - 1));
        System.out.println();

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value is " + myMinByteValue);
        System.out.println("Byte max value is " + myMaxByteValue);
        System.out.println();

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value is " + myMinShortValue);
        System.out.println("Short max value is " + myMaxShortValue);
        System.out.println();
        
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long min value is " + myMinLongValue);
        System.out.println("long max value is " + myMaxLongValue);
        System.out.println();
        long toBigForInteger = 2147483647L;         // add the L to convert from int to long

        int myTotal = (myMinIntValue / 2);

        System.out.println(myTotal);

        byte intToByte = (byte) (myMinByteValue / 2);       // this is known as casting
        System.out.println(intToByte);

        short intToShort = (short) (myMinShortValue / 2);   // this is known as casting
        System.out.println(intToShort);



    }


}
