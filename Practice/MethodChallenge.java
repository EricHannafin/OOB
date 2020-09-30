public class MethodChallenge {

    public static void main(String[] args) {
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Eric ", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tom ", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob ", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Lee ", playerPosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + "position " + playerPosition);

    }


    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;  //assuming position 4 will be returned

        if(playerScore >= 1000){
            position = 1;
        }
        else if(playerScore>=500){
            position = 2;
        }
        else if(playerScore >= 100);{
            position = 3;
        }
        return position;
    }

}
