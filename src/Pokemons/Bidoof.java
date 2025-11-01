package Pokemons;

import Moves.Tackle;
import Moves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bidoof extends Pokemon {
    public Bidoof(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(59, 45, 40, 35, 40, 31);
        addMove(new Thunderbolt());
        addMove(new Tackle());
    }
}
