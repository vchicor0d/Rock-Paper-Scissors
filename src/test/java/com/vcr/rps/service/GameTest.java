package com.vcr.rps.service;

import com.vcr.rps.model.GameResult;
import com.vcr.rps.model.Moves;
import com.vcr.rps.model.Player;
import com.vcr.rps.model.PlayerType;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author chicovi
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GameTest {
    
    @Test
    public void playTest() {
        Player player1 = new Player(PlayerType.ROCK);
        Player player2 = new Player(PlayerType.ROCK);
        
        Game game = new Game();
        
        GameResult result = game.play(player1, player2);
        
        Assert.assertEquals(new GameResult(Moves.ROCK, Moves.ROCK), result);
    }
    
}
