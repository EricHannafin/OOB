public class IfStatements {

    public static void main(String[] args) {

        boolean isAlien = true;
            if (isAlien==false) {
                System.out.println("This is not an Alien");
            }
            else {
                System.out.println("It is an Alien");
            }

            int topScore = 80;

            if (topScore>=100) {
                System.out.println("You got the top score");
            }

            int secondTopScore = 60;

            if ((topScore>secondTopScore) && (topScore >= 80)){   // and
                System.out.println("First score is greater");
            }

            if ((topScore>90) || (topScore==80));{                //or
                System.out.println("Or statement is working");
            }

            boolean isCar = false;
            if (!isCar);{
                System.out.println("This is OK");
            }

            isCar = true;
            boolean wasCar = isCar ? true : false;  // boolean isPersonOverEighteen = (age > 18) ? true : false
            if (wasCar){
                System.out.println("wasCar is true");
            }


    }
}
