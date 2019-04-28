package Marathon.obstacle;

import Marathon.animal.Animal;
import Marathon.animal.Swimable;

public class Water extends Obstacle {
    public Water(float size) {
        this.size = size;
    }

    @Override
    public void doIt(Animal a) {
        if (a instanceof Swimable) {
            ((Swimable) a).swim(size);
        } else {
            a.getOutFromDistance("water");
        }
    }
}