package com.munchkin.card;

import com.munchkin.card.Effect.ActiveEffect;
import com.munchkin.MunchkinUtils.*;

/**
 * Classe carta generica, contiene tutte le cose in comune
 *
 *
 */
public abstract class Card {

    protected String name;

    protected String description;

    //effetto che può attivare il player
    protected ActiveEffect effect;


    public Card(String name, String description) {
        this.name = name;
        this.description = description;
        effect = null;
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

    public boolean hasEffect() {return effect != null;}

}
