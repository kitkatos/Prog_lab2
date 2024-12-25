package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Lickitung extends Pokemon {
    public Lickitung(String name,Integer level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(90, 55, 75, 60, 75, 30);
        setMove(new Supersonic(), new Flamethrower(), new RockTomb());
    }
}
