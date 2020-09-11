package com.vcr.rps.service.rest;

import com.vcr.rps.service.Scores;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
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
@WebMvcTest(ScoreEndpoint.class)
@RunWith(SpringRunner.class)
public class ScoreEndpointTest {
    
    @Autowired
    MockMvc mockMvc;
    
    @MockBean
    Scores scores;
    
    @Test
    public void getTotalGamesTest() throws Exception {
        Mockito.when(scores.getTotalGames()).thenReturn(10);
        mockMvc.perform(MockMvcRequestBuilders.get("/scores/totalGames"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").value(10));
    }
    
    @Test
    public void getTotalP1WinsTest() throws Exception {
        Mockito.when(scores.getTotalP1Wins()).thenReturn(5);
        mockMvc.perform(MockMvcRequestBuilders.get("/scores/totalGames"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").value(5));
        
    }
    
    @Test
    public void getTotalP2WinsTest() throws Exception {
        Mockito.when(scores.getTotalP2Wins()).thenReturn(2);
        mockMvc.perform(MockMvcRequestBuilders.get("/scores/totalGames"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").value(2));
        
    }
    
    @Test
    public void getTotalDrawsTest() throws Exception {
        Mockito.when(scores.getTotalDraws()).thenReturn(3);
        mockMvc.perform(MockMvcRequestBuilders.get("/scores/totalGames"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").value(3));
        
    }
    
}
