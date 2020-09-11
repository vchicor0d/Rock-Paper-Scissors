package com.vcr.rps.service;

import com.vcr.rps.model.GameResult;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author chicovi
 */
@Service
public class Scores {
    
    private List<GameResult> scoreList;
    
    public Scores() {
        scoreList = new ArrayList<>();
    }
    
    public void addGameResult(GameResult result) {
        scoreList.add(result);
    }

    public List<GameResult> getScoreList() {
        return scoreList;
    }
    
    public int getTotalGames(){
        return scoreList.size();
    }
    
    public int getTotalP1Wins(){
        return (int)scoreList.stream().filter(gameResult -> GameResult.Result.P1_WON.equals(gameResult.getResult())).count();
    }
    
    public int getTotalP2Wins(){
        return (int)scoreList.stream().filter(gameResult -> GameResult.Result.P2_WON.equals(gameResult.getResult())).count();
    }
    
    public int getTotalDraws(){
        return (int)scoreList.stream().filter(gameResult -> GameResult.Result.DRAW.equals(gameResult.getResult())).count();
    }
    
}
