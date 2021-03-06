package JavaCoreHomeWork1.Obstacles;

import JavaCoreHomeWork1.Competitors.Animal;
import JavaCoreHomeWork1.Competitors.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}