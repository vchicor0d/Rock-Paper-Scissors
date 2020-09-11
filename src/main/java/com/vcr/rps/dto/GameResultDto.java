package com.vcr.rps.dto;

import com.vcr.rps.model.GameResult.Result;
import com.vcr.rps.model.Moves;
import java.io.Serializable;

/**
 *
 * @author chicovi
 */
public class GameResultDto implements Serializable {
    
    Moves player1Move;
    Moves player2Move;
    Result gameResult;

    public GameResultDto(Moves player1Move, Moves player2Move, Result gameResult) {
        this.player1Move = player1Move;
        this.player2Move = player2Move;
        this.gameResult = gameResult;
    }

    public GameResultDto() {
    }

    public Moves getPlayer1Move() {
        return player1Move;
    }

    public void setPlayer1Move(Moves player1Move) {
        this.player1Move = player1Move;
    }

    public Moves getPlayer2Move() {
        return player2Move;
    }

    public void setPlayer2Move(Moves player2Move) {
        this.player2Move = player2Move;
    }

    public Result getGameResult() {
        return gameResult;
    }

    public void setGameResult(Result gameResult) {
        this.gameResult = gameResult;
    }
    
}
