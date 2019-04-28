package Marathon.obstacle;

import Marathon.animal.Animal;

public abstract class Obstacle {
    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    float size;

    public abstract void doIt(Animal a);
}
