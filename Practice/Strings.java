public class Strings {

    public static void main(String[] args) {

        String myString = "This is a string";

        System.out.println("My string is equal to, " + myString);
        myString = myString + ", this as well.";
        System.out.println("My string is equal to, " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string is equal to, " + myString);
        String numString = "2000";
        String numString2 = numString + "500";
        System.out.printf(numString2);
        System.out.println();

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.printf("Last string is equal to " + lastString);
        System.out.println();

        double doubleNUmber = 120.47;
        lastString = lastString + doubleNUmber;
        System.out.printf("Last string is equal to " + lastString);
    }
}
