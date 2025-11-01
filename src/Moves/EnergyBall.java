package Moves;

import ru.ifmo.se.pokemon.*;


public class EnergyBall extends SpecialMove {
    public EnergyBall(){
        super(Type.GRASS, 90, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.1).turns(1).stat(Stat.SPECIAL_DEFENSE, -1));
    }

    @Override
    public String describe() {
        return "применяет физическую атаку Energy Ball";
    }
}
