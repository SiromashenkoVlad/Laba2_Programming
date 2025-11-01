package Moves;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        super(Type.PSYCHIC, 70, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        if (1 / (double)8.0F > Math.random()) {
            return (double)2.0F;
        } else {
            return (double)1.0F;
        }
    }

    @Override
    public String describe() {
        return "применяет физическую атаку Shadow Claw";
    }
}
