package Pokemons;

import Moves.EnergyBall;
import Moves.RockPolish;
import Moves.ShadowClaw;
import Moves.ZapCannon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Genesect extends Pokemon {
    public Genesect (String name, int level){
        super(name, level);
        setType(Type.BUG, Type.STEEL);
        setStats(71, 120, 95, 120, 95, 99);
        addMove(new ShadowClaw());
        addMove(new EnergyBall());
        addMove(new ZapCannon());
        addMove(new RockPolish());
    }
}
