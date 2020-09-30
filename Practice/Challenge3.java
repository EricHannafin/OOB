public class Challenge3 {

    public static void main(String[] args) {

        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double thirdDouble = (firstDouble + secondDouble) * 100;

        System.out.println(thirdDouble);

        double fourthDouble = thirdDouble % 40.00;
        System.out.println(fourthDouble);


        boolean doubleCheck = (fourthDouble == 0) ? true : false;
        if (doubleCheck) {
            System.out.println("The remainder is 0");
        } else {
            System.out.println("The remainder is not 0");
        }
    }


}
