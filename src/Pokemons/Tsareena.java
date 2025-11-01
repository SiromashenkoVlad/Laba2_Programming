package Pokemons;

import Moves.LeafStorm;
import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Steenee{
    public Tsareena(String name, int level){
        super(name, level);
        setType(Type.GRASS);
        addMove(new LeafStorm());
    }
}
