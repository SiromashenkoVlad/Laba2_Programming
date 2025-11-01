package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class AquaJet extends PhysicalMove {
    public AquaJet(){
        super(Type.PSYCHIC, 40, 1.0, +1, 1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    public String describe(){
        return "применяет физическую атаку Aqua Jet";
    }
}
