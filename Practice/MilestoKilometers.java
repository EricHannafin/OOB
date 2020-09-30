import java.util.Scanner;


public class MilestoKilometers {
    // write your code here

    public static void main(String[] args) {

        long answer = toMilesPerHour(10.25);
        System.out.println("this should be the answer " + answer);

    }

    public static long toMilesPerHour(double kilometersPerHour) {


        if (kilometersPerHour < 0) {
            return -1;
        } else
            return Math.round(kilometersPerHour / 1.609);


    }

    public static void printCoversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid");
        } else {

            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println("kmph = " + kilometersPerHour + "mph = " + milesPerHour);
        }


    }
}
