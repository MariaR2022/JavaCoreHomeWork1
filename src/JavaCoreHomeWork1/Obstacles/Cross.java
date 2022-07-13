package JavaCoreHomeWork1.Obstacles;

import JavaCoreHomeWork1.Competitors.Animal;
import JavaCoreHomeWork1.Competitors.Competitor;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}