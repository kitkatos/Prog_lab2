package move;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove{
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
    @Override
    protected String describe(){
        return "использует Focus blast";
    }
}
