package JavaCoreHomeWork1;

import JavaCoreHomeWork1.Competitors.*;
import JavaCoreHomeWork1.Obstacles.*;

public class RunCourse {

    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Иван"), new Cat("Маркиз"), new Dog("Вольф")};
        Obstacle[] obstacles = {new Cross(500), new Wall(2), new Water(10)};

        Team team = new Team("Победители", competitors);

        System.out.println("Создана команда!");
        System.out.println(team.getTeamName());

        System.out.println("Приветствуем участников команды:");
        team.showResults();

        // new Course
        Course course = new Course(obstacles);

        System.out.println("Команда проходит препятствия...");
        course.doIt(team);

        System.out.println("Результаты участников команды:");
        team.showResults();

        System.out.println("Участники, прошедшие все препятствия:");
        team.showMembersFinishedCourse();
    }

}
