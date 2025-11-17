package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 1.0);
    }


    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    protected void	applyOppEffects(Pokemon p){
        if (1 / (double)10.0F > Math.random()){
            Effect.paralyze(p);
        }
    }

    @Override
    public String describe(){
        return "применил специальную атаку Thunderbolt";
    }
}


