package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Lotad extends Pokemon{
    public Lotad(String name, Integer level) {
        super(name, level);
        setType(Type.GRASS, Type.WATER);
        setStats(40, 30, 30, 40, 50, 30);
        setMove(new IceBeam(), new Facade());
    }
}
