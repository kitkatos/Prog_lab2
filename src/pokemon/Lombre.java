package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Lombre extends Lotad {
    public Lombre(String name, Integer level) {
        super(name, level);
        setType(Type.GRASS, Type.WATER);
        setStats(60, 50, 50, 60, 70, 50);
        setMove(new BubbleBeam());
    }
}
