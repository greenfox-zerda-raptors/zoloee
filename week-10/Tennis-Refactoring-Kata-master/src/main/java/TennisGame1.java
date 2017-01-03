import static java.lang.Math.abs;

public class TennisGame1 implements TennisGame {
    private Player player1;
    private Player player2;
    
    public TennisGame1(String player1name, String player2Name) {
        player1 = new Player(player1name);
        player2 = new Player(player2Name);

    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.name))
            player1.score += 1;
        else
            player2.score += 1;
    }

    public String getScore() {
        String score = "";
        if (thereIsAwinner()) {
            score = "Win for " + theBetterPlayer();
        } else if (thereIsAdvantage()) {
            score = "Advantage " + theBetterPlayer();
        } else if (thereIsDeuce()) {
            score = "Deuce";
        } else {
            score = scoreNaming(player1.score) + "-";
            if (scoresEqual()) {
                score += "All";
            } else {
                score += scoreNaming(player2.score);
            }
        }
        return score;
    }
    
    private boolean scoreDifferenceIsMoreThanOne(){
        return (abs(player1.score - player2.score) >= 2);
    }
    private boolean scoreDifferenceIsOne(){
        return (abs(player1.score - player2.score) == 1);
    }
    private boolean scoresEqual(){
        return (player1.score == player2.score);
    }
    private boolean fourPointsReached(){
        return (Math.max(player1.score, player2.score) > 3);
    }
    private boolean threePointsReached(){
        return (Math.max(player1.score, player2.score) > 2);
    }
    private boolean thereIsAwinner() {
        return (scoreDifferenceIsMoreThanOne() && fourPointsReached());
    }
    private boolean thereIsDeuce() {
        return (scoresEqual() && threePointsReached());
    }
    private boolean thereIsAdvantage() {
        return (fourPointsReached() && scoreDifferenceIsOne());
    }
    private String theBetterPlayer(){
        if (player1.score > player2.score) {
            return player1.name;
        }
        else {
            return player2.name;
        }
    }
    private String scoreNaming(int playerScore) {
        String score="";
        switch(playerScore)
                {
                case 0:
                score = "Love";
                break;
                case 1:
                score = "Fifteen";
                break;
                case 2:
                score = "Thirty";
                break;
                case 3:
                score = "Forty";
                break;
                }
        return score;
    }
}
