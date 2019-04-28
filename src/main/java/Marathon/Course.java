package Marathon;

import Marathon.animal.Animal;
import Marathon.obstacle.Obstacle;

public class Course {
    private Obstacle[] obstacles = new Obstacle[3];

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Animal member : team.getTeamMembers()) {
            for (Obstacle obstacle : obstacles)
                obstacle.doIt(member);
        }
    }
}
