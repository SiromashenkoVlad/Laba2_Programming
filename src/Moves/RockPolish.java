package Moves;

import ru.ifmo.se.pokemon.*;

public class RockPolish extends StatusMove {
    public RockPolish(){
        super(Type.ROCK, 0, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPEED, +2));
    }

    @Override
    public String describe() {
        return "применяет изменение статуса Rock Polish";
    }
}
