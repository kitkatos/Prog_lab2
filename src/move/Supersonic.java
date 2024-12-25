package move;

import ru.ifmo.se.pokemon.*;

public class Supersonic extends StatusMove {
    public Supersonic() {
        super(Type.NORMAL, 0, 55);
    }
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3){
            Effect.confuse(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Supersonic";
    }
}
