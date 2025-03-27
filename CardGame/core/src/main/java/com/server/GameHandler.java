package com.server;

import com.munchkin.Deck;
import com.munchkin.Player.Player;
import com.munchkin.card.Card;
import com.munchkin.MunchkinUtils.*;

import java.util.ArrayList;
import java.util.Scanner;

public class GameHandler {

    private ArrayList<Player> players;

    private Deck deck;

    private Player currentPlayer;

    private Scanner scanner;

    private GameState state;

    public GameHandler() {
        currentPlayer = new Player();
        deck = new Deck();
        state = GameState.START_TURN;
        scanner = new Scanner(System.in);
    }



    /**
     * get all interaction from player
     */
    public void input(){

    }


    public void logic() {
        System.out.println("-------------------------"+ state.toString()+ " --------------------------");
        switch (state) {

            case START_TURN -> startTurn();
            case DOOR_PHASE -> {
            }
            case COMBAT -> {
            }
            case LOOT_PHASE -> {
            }
            case END_TURN -> {
            }
            default -> {
                System.out.println("porco dio");
                throw new RuntimeException("ah boh");
            }
        }
    }

    private void startTurn() {
        System.out.println("vuoi giocare i tuoi oggetti (in realta non lo ho implementato)\n\n\n");
        state = GameState.DOOR_PHASE;
    }

    private void doorPhase() {
        System.out.println("------------------------- DOOR PHASE --------------------------");

        Card c = deck.drawDoorCard();

        System.out.println("è stata estratta la carta " + c.getName());


    }


}
