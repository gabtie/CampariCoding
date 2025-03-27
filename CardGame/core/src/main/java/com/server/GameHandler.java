package com.server;

import com.munchkin.Player.Player;
import com.munchkin.card.AbstractCard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GameHandler {

    private ArrayList<Player> players;

    private Player currentPlayer;

    public enum State {
        START_TURN,
        DOOR_PHASE,
        COMBAT,
        LOOT_PHASE,
        END_TURN
    }

    private State state;

    /**
     * get all interaction from player
     */
    public void input(){

        AbstractCard c;



    }


    public void logic() {
        switch (state) {
            case START_TURN -> {
                System.out.println("START_TURN");
            }
            case DOOR_PHASE -> {
                System.out.println("DOOR_PHASE");
            }
            case COMBAT -> {
                System.out.println("COMBAT");
            }
            case LOOT_PHASE -> {
                System.out.println("LOOT_PHASE");
            }
            case END_TURN -> {
                System.out.println("END_TURN");
            }
            default -> {
                System.out.println("porco dio");
            }
        }
    }


}
