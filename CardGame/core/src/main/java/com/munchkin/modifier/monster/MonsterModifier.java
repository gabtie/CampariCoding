package com.munchkin.modifier.monster;

import com.munchkin.Player.Player;
import com.munchkin.modifier.PerkModifier;

import java.util.ArrayList;

/**
 *
 * combattimento :
 *
 * il mostro ha dei modifer :
 *
 *
 * - avoid : il mostro non combatterà con il player a meno che quest'ultimo non attacchi
 *  potrebbe dare in caso non attacchi anche delle ricompense
 *
 * - perks : vantaggi/svantaggi contro determinate categorie o situazioni o eventi
 *
 */
public class MonsterModifier {

    private ArrayList<AvoidModifier> avoidModifiers;

    private ArrayList<PerkModifier> perkModifier;


    public boolean canPlayerAvoid(Player player) {
        for (AvoidModifier modifer : avoidModifiers) {
            if (modifer.canAvoid(player)) return true;
        }
        return false;
    }

    public int getDamage(Player p) {
        int damage = 0;
        for (PerkModifier modifer : perkModifier) {
            damage += modifer.getDamage(p);
        }
        return damage;
    }

    public MonsterModifier(ArrayList<PerkModifier> perkModifier, ArrayList<AvoidModifier> avoidModifiers) {
        this.perkModifier = perkModifier;
        this.avoidModifiers = avoidModifiers;
    }

    public MonsterModifier() {
        this(new ArrayList<PerkModifier>() , new ArrayList<AvoidModifier>());
    }

    public ArrayList<AvoidModifier> getAvoidModifiers() {
        return avoidModifiers;
    }

    public void addAvoidModifiers(AvoidModifier avoidModifiers) {
        this.avoidModifiers.add(avoidModifiers);
    }

    public void setAvoidModifiers(ArrayList<AvoidModifier> avoidModifiers) {
        this.avoidModifiers = avoidModifiers;
    }

    public ArrayList<PerkModifier> getPerkModifier() {
        return perkModifier;
    }

    public void setPerkModifier(ArrayList<PerkModifier> perkModifier) {
        this.perkModifier = perkModifier;
    }

    public void addPerkModifiers(PerkModifier perkModifier) {
        this.perkModifier.add(perkModifier);
    }
}
