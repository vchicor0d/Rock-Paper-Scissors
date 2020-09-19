package com.vcr.rps.dto;

import java.io.Serializable;

/**
 *
 * @author chicovi
 */
public class GameResultDto implements Serializable {
    
    String player1Move;
    String player2Move;
    String gameResult;

    public GameResultDto(String player1Move, String player2Move, String gameResult) {
        this.player1Move = player1Move;
        this.player2Move = player2Move;
        this.gameResult = gameResult;
    }

    public GameResultDto() {
    }

    public String getPlayer1Move() {
        return player1Move;
    }

    public void setPlayer1Move(String player1Move) {
        this.player1Move = player1Move;
    }

    public String getPlayer2Move() {
        return player2Move;
    }

    public void setPlayer2Move(String player2Move) {
        this.player2Move = player2Move;
    }

    public String getGameResult() {
        return gameResult;
    }

    public void setGameResult(String gameResult) {
        this.gameResult = gameResult;
    }
    
}
