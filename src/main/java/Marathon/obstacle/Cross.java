package Marathon.obstacle;

import Marathon.animal.Animal;

public class Cross extends Obstacle {
    public Cross(float size) {
        this.size = size;
    }

    @Override
    public void doIt(Animal a) {
        a.cross(size);
    }
}
