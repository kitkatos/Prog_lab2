package move;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
    public Confide() {
        super(Type.NORMAL, 0, 100);
    }
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    public String describe() {
        return "используте Confide и уменьшает специальную атаку противника";
    }
}
