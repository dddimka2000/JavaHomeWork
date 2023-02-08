package org.example;

public class Crossfit extends Training implements Information_output{
    private int maximum_projectile_weight;

    public Crossfit(double average_heart, double duration_of_the_workout, double weight, int maximum_projectile_weight) {
        super(average_heart, duration_of_the_workout, weight);
        this.maximum_projectile_weight = maximum_projectile_weight;
    }

    @Override
    public void Output() {
        System.out.println("Кроссфит тренировка! "+" Длительность: "+duration_of_the_workout+" минут. Средний вес штанги "+maximum_projectile_weight+"кг. Килокалорий "+calorie());
    }
}
