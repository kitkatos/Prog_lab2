package move;

import ru.ifmo.se.pokemon.*;

public class SignalBeam extends SpecialMove {
    public SignalBeam() {
        super(Type.BUG, 75, 100);
    }
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1){
            Effect.confuse(p);

        }
    }
    @Override
    public String describe(){
        return "использует Signal beam";
    }
}
