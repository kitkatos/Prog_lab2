package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Liclilicly extends Lickitung {
    public Liclilicly(String name, Integer level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(90, 55, 75, 60, 75, 30);
        setMove(new FocusBlast());
    }
}
