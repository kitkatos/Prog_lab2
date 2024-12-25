import pokemon.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Volbeat p1 = new Volbeat("Волбит", 1);
        Lickitung p2 = new Lickitung("Ликитун", 1);
        Liclilicly p3 = new Liclilicly("Ликилики", 1);
        Lotad p4 = new Lotad("Лотад", 1);
        Lombre p6 = new Lombre("Ломбре", 1);
        Ludicolo p5 = new Ludicolo("Ладиколо", 1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p4);

        b.addFoe(p2);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}