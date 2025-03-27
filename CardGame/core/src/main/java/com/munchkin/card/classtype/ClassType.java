package com.munchkin.card.classtype;


import com.munchkin.MunchkinUtils;
import com.munchkin.card.Card;
import com.munchkin.MunchkinUtils.*;

public class ClassType extends Card {



    MunchkinClass classType;

    public ClassType(String name, String description, MunchkinClass classType) {
        super(name, description);
        this.classType = classType;
    }


    @Override
    public CardType getCardType() {
        return CardType.CLASS;
    }

    @Override
    public CardDeckType getCardDeckType() {
        return CardDeckType.DOOR;
    }
}
