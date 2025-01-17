package move;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove{
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1){
            Effect.freeze(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Ice beam";
    }
}
