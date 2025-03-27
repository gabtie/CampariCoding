package com.munchkin.card.Effect;

import com.munchkin.Player.Player;

public abstract class ActiveEffect {

    //search
    enum Target {
        PLAYER,
        MONSTER,
        CARD
    }

    //funzione che prende o i player o i mostri o le carte dei player e seleziona su quali possono essere usate
    abstract Object search(Object source);

    //the effect to apply to Object
    abstract void use(Player user , Object receiver) ;

}
