package move;
import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Thunder";
    }
}
