package com.munchkin;

import java.util.Random;

public class MunchkinUtils {

    public static Random rand = new Random();

    public enum MunchkinClass {
        WARRIOR,
        WIZARD,
        THIEF,
        CLERIC
    }

    public enum MunchkinRace {
        HUMAN,
        ELF,
        DWARF,
        HALFLING,
        //ORC,
        //GNOME;
    }

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

    public enum ItemType {
        ARMOR,
        HELMET,
        BOOTS,
        WEAPON,
        USABLE,
    }

    public enum GameState {
        START_TURN,
        DOOR_PHASE,
        COMBAT,
        LOOT_PHASE,
        END_TURN
    }

    public static MunchkinClass getRandomClass() {
        MunchkinClass[] races = MunchkinClass.values();
        return races[MunchkinUtils.rand.nextInt(races.length)];
    }

    public static MunchkinRace getRandomRace() {
        MunchkinRace[] races = MunchkinRace.values();
        return races[MunchkinUtils.rand.nextInt(races.length)];
    }





}
