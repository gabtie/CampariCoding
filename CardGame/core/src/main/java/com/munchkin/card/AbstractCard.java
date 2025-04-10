package com.munchkin.card;

/**
 * Classe carta generica, contiene tutte le cose in comune
 *
 *
 */
public abstract class AbstractCard {

    private String name;

    private String description;

    public enum CardType {
        MONSTER,
        RACE,
        CLASS,
        ITEM,
        CURSE
    }

    public enum CardDeckType {
        TREASURE,
        DOOR
    }

    public AbstractCard(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract CardType getCardType();
    public abstract CardDeckType getCardDeckType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
