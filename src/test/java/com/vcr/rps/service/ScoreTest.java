package com.vcr.rps.service;

import com.vcr.rps.model.GameResult;
import com.vcr.rps.model.Moves;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author chicovi
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ScoreTest {
    
    @Autowired
    Scores scores;
    
    List<GameResult> scoreList;
    
    @BeforeAll
    public void setUp() {
        
        scoreList = Arrays.asList(
                new GameResult(Moves.PAPER, Moves.PAPER),
                new GameResult(Moves.ROCK, Moves.ROCK),
                new GameResult(Moves.SCISSORS, Moves.SCISSORS),
                new GameResult(Moves.ROCK, Moves.PAPER),
                new GameResult(Moves.SCISSORS, Moves.PAPER),
                new GameResult(Moves.ROCK, Moves.SCISSORS));
        
        scoreList.forEach(result -> scores.addGameResult(result));
        
        
    }
    
    @Test
    public void totalGamesTest(){
        
        Assertions.assertEquals(6, scores.getTotalGames());
        
    }
    
    @Test
    public void totalP1WinsTest(){
        
        Assertions.assertEquals(2, scores.getTotalP1Wins());
        
    }
    
    @Test
    public void totalP2WinsTest(){
        
        Assertions.assertEquals(1, scores.getTotalP2Wins());
        
    }
    
    @Test
    public void totalDrawsTest(){
        
        Assertions.assertEquals(3, scores.getTotalDraws());
        
    }
    
    
}
