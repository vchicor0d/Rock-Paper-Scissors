package com.vcr.rps.model;

/**
 *
 * @author chicovi
 */
public class Player {
    
    PlayerType playerType;

    public Player(PlayerType playerType) {
        this.playerType = playerType;
    }
    
    public Moves playMove(){
        
        if (PlayerType.ROCK.equals(playerType)){
            return Moves.ROCK;
        } else {
            return Moves.randomMove();
        }
        
    }
    
}
