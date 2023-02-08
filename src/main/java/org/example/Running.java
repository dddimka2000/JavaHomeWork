package org.example;

public class Running extends Training implements Information_output{
    private int distance;

    public Running(double average_heart, double duration_of_the_workout, double weight, int distance) {
        super(average_heart, duration_of_the_workout, weight);
        this.distance = distance;
    }

    @Override
    public void Output() {
        System.out.println("Беговая тренировка! "+" Длительность: "+duration_of_the_workout+" минут. Дистанция "+distance+" км. Килокалорий "+calorie());
    }
}
