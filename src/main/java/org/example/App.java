package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String array[] = new String[]{"Бег", "Боксинг", "Кроссфит", "Бег", "Боксинг", "Кроссфит", "Бег"};
        double weight[] = new double[]{70, 80, 90, 50, 45, 82, 60};
        double duration_of_the_workout[] = new double[]{70, 130, 190, 50, 145, 80, 70};
        double average_heart[] = new double[]{162, 170, 180, 170, 175, 182, 160};
        int distance[] = new int[]{25, 20, 30};
        int projectile_weight[] = new int[]{90, 80};
        int distance_count = 0;
        int projectile_weight_count = 0;

        List<Running> running = new ArrayList<>();
        List<Boxing> boxing = new ArrayList<>();
        List<Crossfit> crossfit = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "Бег":
                    running.add(new Running(average_heart[i], duration_of_the_workout[i], weight[i], distance[distance_count]));
                    distance_count++;
                    break;
                case "Боксинг":
                    boxing.add(new Boxing(average_heart[i], duration_of_the_workout[i], weight[i]));
                    break;
                case "Кроссфит":
                    crossfit.add(new Crossfit(average_heart[i], duration_of_the_workout[i], weight[i], projectile_weight[projectile_weight_count]));
                    projectile_weight_count++;
                    break;
            }
        }
        running.forEach(i -> i.Output());
        boxing.forEach(i -> i.Output());
        crossfit.forEach(i -> i.Output());

    }
}
