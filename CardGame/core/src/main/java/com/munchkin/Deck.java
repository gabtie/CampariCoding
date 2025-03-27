package com.munchkin;

import com.munchkin.card.Card;

import java.util.ArrayList;

public class Deck {

    public ArrayList<Card> treasure;

    public ArrayList<Card> door;

    public ArrayList<Card> discardTreasure;

    public ArrayList<Card> discardDoor;

    public Deck() {
        treasure = new ArrayList<>();
        door = new ArrayList<>();
    }

    public Card drawDoorCard() {
        //TODO gestire mazzo vuoto
        if (door.isEmpty()) throw new RuntimeException("MAZZO VUOTO DIO CANE");
        Card c = door.getFirst();
        door.removeFirst();
        return c;
    }

    public Card drawTreasureCard() {
        //TODO gestire mazzo vuoto
        if (door.isEmpty()) throw new RuntimeException("MAZZO VUOTO DIO CANE");
        Card c = treasure.getFirst();
        treasure.removeFirst();
        return c;
    }

    public void discardDoorCard(Card c) {
        discardDoor.add(c);
    }

    public void discardTreasureCard(Card c) {
        discardTreasure.add(c);
    }


    private Deck(ArrayList<Card> treasure, ArrayList<Card> door) {
        this.treasure = treasure;
        this.door = door;
    }




    public static Deck generatDeck() {
        Deck d = new Deck(new ArrayList<Card>(), new ArrayList<Card>());

        // treasure
        int weapon = 10;
        int protection = 10;
        int usable = 10;
        int perk = 10;


        //door
        int monster = 20;
        int curse = 0;




        return d;
    }


}
