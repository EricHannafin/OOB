import java.sql.SQLOutput;

public class challenge1 {

    public static void main(String[] args) {

        byte byte1 = 10;
        short short1 = 20;
        int int1 = 50;
        long long1 = 50000L + 10 * (byte1 + short1 + int1);

        System.out.println("The long answer is " + long1);

        short shortTotal = (short) (50000L + 10 * (byte1 + short1 + int1));

        System.out.println("The short answer is " + shortTotal);


    }


}
