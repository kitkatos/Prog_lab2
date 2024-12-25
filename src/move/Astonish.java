package move;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Astonish extends PhysicalMove {
    public Astonish(){
        super(Type.GHOST, 30, 100);
    }
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Astonish";
    }
}
