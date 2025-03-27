package com.munchkin.card.item;

import com.munchkin.card.Card;
import com.munchkin.MunchkinUtils.*;

import java.lang.reflect.Modifier;

public class Item extends Card {

    private ItemType itemType;

    private boolean isBig;

    private int Value;

    //ci sono alcune carte che dicono usale appena le peschi
    private boolean isInstantCard;

    //private Modifier modifier;

    //NULL = 0, FALSE = 1, TRUE = 2
    private Boolean isTwoHand;



    private Item(String name, String description ) {
        super(name, description);
    }

    private Item(String name, String description, ItemType itemType, boolean isBig, int value, boolean isInstantCard, Boolean isTwoHand) {
        super(name, description);
        this.itemType = itemType;
        this.isBig = isBig;
        Value = value;
        this.isInstantCard = isInstantCard;
        this.isTwoHand = isTwoHand;
    }

    public static Item createItem(String name, String description, ItemType itemType, boolean isBig,
                                  Boolean isTwoHand, int value, boolean isInstantCard ) {

        switch (itemType) { //ik it can be done with 2 if but like this is scalable
            case ARMOR:
            case HELMET:
            case BOOTS:
                isTwoHand = null;
                isInstantCard = false;
                break;
            case USABLE : {
                isTwoHand = null;
                isBig = false;
            }
            case WEAPON: {
            }
        }
        return new Item( name,  description,  itemType,  isBig,  value,  isInstantCard,  isTwoHand);
    }

    @Override
    public CardDeckType getCardDeckType() {
        return CardDeckType.TREASURE;
    }

    @Override
    public CardType getCardType() {
        return CardType.ITEM;
    }

}
