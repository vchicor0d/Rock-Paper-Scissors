package com.vcr.rps.service;

import com.vcr.rps.model.GameResult;
import com.vcr.rps.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author chicovi
 */
@Service
public class Game {
    
    @Autowired
    Scores scores;
    
    public GameResult play(Player player1, Player player2) {
        
        GameResult gameResult = new GameResult(player1.playMove(), player2.playMove());
        scores.addGameResult(gameResult);
        return gameResult;
        
    }
    
}
