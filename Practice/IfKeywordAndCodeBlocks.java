public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score <= 5000 && score > 1000 ) {
//            System.out.printf("Your score was 5000");
//        } else if (score < 1000) {
//            System.out.printf("Your score is less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver == true){ // can also use if(gameOver) instead of if (gameOver == true)
            int finaScore = score + (levelCompleted * bonus);
            System.out.println("This is your final score " + finaScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true){ // can also use if(gameOver) instead of if (gameOver == true)
            int finaScore = score + (levelCompleted * bonus);
            System.out.printf("This is your final score " + finaScore);
        }
    }
}
