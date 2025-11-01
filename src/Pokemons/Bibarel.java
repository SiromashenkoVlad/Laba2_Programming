package Pokemons;

import Moves.AquaJet;
import ru.ifmo.se.pokemon.Type;

public class Bibarel extends Bidoof {
    public Bibarel(String name, int level){
        super(name, level);
        setType(Type.NORMAL, Type.WATER);
        setStats(79, 85, 60, 55, 60, 71);
        addMove(new AquaJet());
    }
}
