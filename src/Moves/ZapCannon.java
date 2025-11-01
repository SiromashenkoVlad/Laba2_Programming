package Moves;

import ru.ifmo.se.pokemon.*;

public class ZapCannon extends SpecialMove {
    public ZapCannon(){
        super(Type.ELECTRIC, 120, 0.5);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        double acc = (accuracy * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION));
        boolean check = acc > Math.random();
        if (check) {
            applyOppEffects(def);
        }
        return check;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.confuse();
        Effect.paralyze(p);
    }

    @Override
    public String describe() {
        return "применяет физическую атаку Zap Cannon";
    }
}
