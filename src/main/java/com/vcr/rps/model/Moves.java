package com.vcr.rps.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author chicovi
 */
public enum Moves {
    
    ROCK("SCISSORS","PAPER"),
    PAPER("ROCK","SCISSORS"),
    SCISSORS("PAPER","ROCK");
    
    private String beats;
    private String beatenBy;
    
    Moves(String beats, String beatenBy){
        this.beats = beats;
        this.beatenBy = beatenBy;
    }
    
    private static final List<Moves> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final Random RANDOM = new Random();
    
    public static Moves randomMove() {
        return VALUES.get(RANDOM.nextInt(VALUES.size()));
    }
    
    public Moves beats(){
        return Moves.valueOf(this.beats);
    }
    
    public Moves beatenBy() {
        return Moves.valueOf(this.beatenBy);
    }
}
