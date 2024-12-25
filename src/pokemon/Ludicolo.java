package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Ludicolo extends Lombre {
    public Ludicolo(String name, Integer level) {
        super(name, level);
        setType(Type.GRASS, Type.WATER);
        setStats(80, 70, 70, 90, 100, 70);
        setMove(new Astonish());
    }
}
