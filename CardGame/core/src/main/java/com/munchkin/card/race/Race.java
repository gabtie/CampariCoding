package com.munchkin.card.race;

import com.munchkin.MunchkinUtils;
import com.munchkin.card.Card;
import com.munchkin.MunchkinUtils.*;
public class Race extends Card {





    public MunchkinRace race;

    public Race(String name, String description, MunchkinRace race) {
        super(name, description);
        this.race = race;
    }


    @Override
    public CardType getCardType() {
        return CardType.RACE;
    }

    @Override
    public CardDeckType getCardDeckType() {
        return CardDeckType.DOOR;
    }


}
