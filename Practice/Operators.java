public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.printf("1 + 2 = " + result);
        System.out.println();
        int previousResult = result;
        System.out.println("Previous result is equal to " + previousResult);
        result = result - 1;
        System.out.println("Result - 1 = " + result);

        result = result * 10; //2 * 10
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 / 5
        System.out.println("20 / 5 = " + result);

        result = result % 3;  // remainder of (4 % 3)
        System.out.println("4 % 3 = " + result);

        // result++ = result + 1
        result++;
        System.out.println("1 + 1 = " + result);

        //result-- = result - 1
        result--;
        System.out.println("1 - 1 = " + result);

        //result + 2 shortcut
        result+= 2;
        System.out.println("1`+ 2 = " + result);

        // result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);
        
        // result = result - 5
        result -= 5;
        System.out.printf("10 - 5 = " + result);

    }
}
