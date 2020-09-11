package com.vcr.rps.service.rest;

import com.vcr.rps.dto.GameResultDto;
import com.vcr.rps.model.GameResult;
import com.vcr.rps.model.Player;
import com.vcr.rps.model.PlayerType;
import com.vcr.rps.service.Game;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chicovi
 */
@RestController
@RequestMapping("/game")
@CrossOrigin(origins = "*")
public class GameEndpoint {
    
    @Autowired
    Game game;
            
    
    @GetMapping("/play")
    public ResponseEntity<GameResultDto> play() {
        
        Player player1 = new Player(PlayerType.ROCK);
        Player player2 = new Player(PlayerType.RANDOM);
        
        GameResult gameResult = game.play(player1, player2);
        
        ResponseEntity<GameResultDto> result;
        
        if (gameResult != null) {
            Function<GameResult, GameResultDto> dtoConverter = entity -> new GameResultDto(entity.getPlayer1Move(), entity.getPlayer2Move(), entity.getResult());
            result = new ResponseEntity<>(dtoConverter.apply(gameResult), HttpStatus.OK);
        } else {
            result = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return result;
        
    }
}
