import Pokemons.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Bibarel("Бобр Курва", 1);
        Pokemon p1_2 = new Bidoof("Бобре", 1);
        Pokemon p1_3 = new Steenee("Цветочек", 1);
        Pokemon p2 = new Genesect("Genesect", 1);
        Pokemon p2_2 = new Bounsweet("Грибок", 1);
        Pokemon p2_3 = new Tsareena("Царевна" , 1);
        b.addAlly(p1);
        b.addAlly(p1_2);
        b.addAlly(p1_3);
        b.addFoe(p2);
        b.addFoe(p2_2);
        b.addFoe(p2_3);
        b.go();
    }
}