package move;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove{
    public RockTomb() {
        super(Type.ROCK, 60 ,95);
    }
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe(){
        return "использует Rock tomb";
    }
}
