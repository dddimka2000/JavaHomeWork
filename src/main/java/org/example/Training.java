package org.example;

public class Training {
    protected double average_heart,duration_of_the_workout,weight;
    public Training(double average_heart, double duration_of_the_workout, double weight) {
        this.average_heart = average_heart;
        this.duration_of_the_workout = duration_of_the_workout;
        this.weight = weight;
    }
    protected double calorie() {
        return (0.014 * weight * duration_of_the_workout * (0.12 * average_heart - 7));
    }
}

