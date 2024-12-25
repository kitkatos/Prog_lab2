package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Volbeat extends Pokemon {
    public Volbeat(String name,Integer level) {
        super(name, level);
        setType(Type.BUG);
        setStats(65, 73, 75, 47, 85, 85);
        setMove(new Thunder(), new Confide(), new SignalBeam());
    }
}
