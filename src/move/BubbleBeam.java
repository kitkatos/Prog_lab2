package move;

import ru.ifmo.se.pokemon.*;

public class BubbleBeam extends SpecialMove{
    public BubbleBeam() {
        super(Type.WATER, 65, 100);
    }
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe(){
        return "использует Bubble beam";
    }
}
