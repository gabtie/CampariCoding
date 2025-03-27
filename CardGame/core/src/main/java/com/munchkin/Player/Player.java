package com.munchkin.Player;

import com.munchkin.card.AbstractCard;
import com.munchkin.card.curse.AbstractCurse;

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

    private ArrayList<AbstractCard> hand;

    private ArrayList<AbstractCurse> equipped;


    public int calculateAttack() {
        return level;
    }

}
