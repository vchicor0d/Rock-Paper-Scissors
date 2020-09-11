package com.vcr.rps.model;

/**
 *
 * @author chicovi
 */
public class GameResult {
    
    public static enum Result {
        P1_WON("Player 1 won!"),
        P2_WON("Player 2 won!"),
        DRAW("It's a draw!");
    
        private String resultText;

        private Result(String resultText) {
            this.resultText = resultText;
        }

        public String getResultText() {
            return resultText;
        }
    }
    
    private Moves player1Move;
    private Moves player2Move;
    private Result result;

    public GameResult(Moves player1Move, Moves player2Move) {
        this.player1Move = player1Move;
        this.player2Move = player2Move;
        if (player1Move.equals(player2Move)) {
            result = Result.DRAW;
        } else if (player1Move.beats().equals(player2Move)) {
            result = Result.P1_WON;
        } else {
            result = Result.P2_WON;
        }
    }

    public Moves getPlayer1Move() {
        return player1Move;
    }

    public Moves getPlayer2Move() {
        return player2Move;
    }

    public Result getResult() {
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GameResult other = (GameResult) obj;
        if (this.player1Move != other.player1Move) {
            return false;
        }
        if (this.player2Move != other.player2Move) {
            return false;
        }
        if (this.result != other.result) {
            return false;
        }
        return true;
    }
    
    
}
