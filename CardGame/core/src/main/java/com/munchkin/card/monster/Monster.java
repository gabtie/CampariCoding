package com.munchkin.card.monster;

import com.munchkin.Player.Player;
import com.munchkin.card.Card;
import com.munchkin.modifier.monster.MonsterModifier;
import com.munchkin.MunchkinUtils.*;

public class Monster extends Card {

    private final int level;

    private BadThings badThings ;

    //TODO add monster type

    private MonsterModifier modifier;

    public Monster(String name, String description, int level, BadThings badThings, MonsterModifier modifier) {
        super(name, description);
        this.level = level;
        this.badThings = badThings;
        this.modifier = modifier;
    }

    public Monster(String name, String description, int level) {
        this(name, description, level, BadThings.DEFAULT, new MonsterModifier());
    }

    public int getLevel() {return level;}

    public int getDamage(Player p) {
        return level + modifier.getDamage(p);
    }

    @Override
    public CardType getCardType() {
        return CardType.MONSTER;
    }

    @Override
    public CardDeckType getCardDeckType() {
        return CardDeckType.DOOR;
    }
}
