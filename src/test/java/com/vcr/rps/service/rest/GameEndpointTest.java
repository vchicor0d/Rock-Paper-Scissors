package com.vcr.rps.service.rest;

import com.vcr.rps.model.GameResult;
import com.vcr.rps.model.Moves;
import com.vcr.rps.model.Player;
import com.vcr.rps.service.Game;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 *
 * @author chicovi
 */
@WebMvcTest(GameEndpoint.class)
@RunWith(SpringRunner.class)
public class GameEndpointTest {
    
    @Autowired
    MockMvc mvcMock;
    
    @MockBean
    Game gameMock;
    
    @Test
    public void testGameEndpoint() throws Exception {
        
        GameResult result = new GameResult(Moves.PAPER, Moves.PAPER);
        Mockito.when(gameMock.play(ArgumentMatchers.any(Player.class), ArgumentMatchers.any(Player.class))).thenReturn(result);
        mvcMock.perform(MockMvcRequestBuilders.get("/game/play"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.player1Move").value(Moves.PAPER.name()));
        
    }
    
    
}
