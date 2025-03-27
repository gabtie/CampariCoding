package com.munchkin.Player;

import com.munchkin.card.Card;


import java.util.ArrayList;

/**
 * Classe player contiene tutte le cose del player
 *
 *
 */
public class Player {

    private String name;

    private int level;

    private int totalAttack;

    private boolean isAlive;

    private ArrayList<Card> hand;

    private ArrayList<Card> equipped;


    public int calculateAttack() {
        return level;
    }

}
