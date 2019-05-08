package Marathon;

import Marathon.Competitor.*;
import Marathon.Obstacle.Course;
import Marathon.Obstacle.Cross;
import Marathon.Obstacle.Obstacle;
import Marathon.Obstacle.Wall;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Rocket", new Human("Bob"), new Cat("Vaska"), new Dog("Bobik"));
        Course course = new Course(new Cross(80), new Wall(2), new Wall(1), new Cross(120));
        course.doIt(team);
        team.showWinners();
    }
}