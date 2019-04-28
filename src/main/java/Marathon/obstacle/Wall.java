package Marathon.obstacle;

import Marathon.animal.Animal;
import Marathon.animal.Jumpable;

public class Wall extends Obstacle {
    public Wall(float size) {
        this.size = size;
    }

    @Override
    public void doIt(Animal a) {
        if(a instanceof Jumpable) {
            ((Jumpable) a).jump(size);
        } else {
            a.getOutFromDistance("jump");
        }
    }
}
