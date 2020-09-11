package com.vcr.rps.service.rest;

import com.vcr.rps.service.Scores;
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
@RequestMapping("/scores")
@CrossOrigin(origins = "*")
public class ScoreEndpoint {
    
    @Autowired
    Scores scores;
    
    @GetMapping("/totalGames")
    public ResponseEntity<Integer> getTotalGames() {
        return new ResponseEntity<>(scores.getTotalGames(),HttpStatus.OK);
    }
    
    @GetMapping("/totalP1Wins")
    public ResponseEntity<Integer> getTotalP1Wins() {
        return new ResponseEntity<>(scores.getTotalP1Wins(),HttpStatus.OK);
    }
    
    @GetMapping("/totalP2Wins")
    public ResponseEntity<Integer> getTotalP2Wins() {
        return new ResponseEntity<>(scores.getTotalP2Wins(),HttpStatus.OK);
    }
    
    @GetMapping("/totalDraws")
    public ResponseEntity<Integer> getTotalDraws() {
        return new ResponseEntity<>(scores.getTotalDraws(),HttpStatus.OK);
    }
    
}
