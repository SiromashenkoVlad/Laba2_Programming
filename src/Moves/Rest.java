package Moves;
import ru.ifmo.se.pokemon.*;

public class Rest extends PhysicalMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    protected void	applySelfEffects(Pokemon p){
        p.setCondition((new Effect()).turns(2).attack((double)0).condition(Status.SLEEP));
        p.addEffect(new Effect().stat(Stat.HP, (int)p.getStat(Stat.HP)));
    }

    @Override
    public String describe(){
        return "применят физическое действие Rest";
    }
}
