package com.vcr.rps.model;

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
public class GameResultTest {
    
    @Test
    public void player1WinTest(){
        
        Moves p1move = Moves.PAPER;
        Moves p2move = Moves.ROCK;
        
        GameResult result = new GameResult(p1move, p2move);
        
        Assert.assertEquals(GameResult.Result.P1_WON, result.getResult());
        
    }
    
    @Test
    public void player2WinTest(){
        
        Moves p1move = Moves.SCISSORS;
        Moves p2move = Moves.ROCK;
        
        GameResult result = new GameResult(p1move, p2move);
        
        Assert.assertEquals(GameResult.Result.P2_WON, result.getResult());
        
    }
    
    @Test
    public void drawTest(){
        
        Moves p1move = Moves.PAPER;
        Moves p2move = Moves.PAPER;
        
        GameResult result = new GameResult(p1move, p2move);
        
        Assert.assertEquals(GameResult.Result.DRAW, result.getResult());
        
    }
    
    
}
