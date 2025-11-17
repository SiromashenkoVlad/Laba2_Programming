package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class PlayNice extends PhysicalMove {
    public PlayNice(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    public String describe() {
        return "применяет атаку Play Nice";
    }
}
