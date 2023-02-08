package org.example;

public class Boxing extends Training implements Information_output{
    public Boxing(double average_heart, double duration_of_the_workout, double weight) {
        super(average_heart, duration_of_the_workout, weight);
    }

    @Override
    public void Output() {
        System.out.println("Тренировка по кибербоксингу! Длительность: "+duration_of_the_workout+" минут. Килокалорий "+calorie());
    }
}
