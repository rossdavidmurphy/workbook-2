package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        Arrays.sort(testScores);

        int sum = 0;
        for (int num : testScores) {
            sum += num;
        }
        double average = (double) sum / testScores.length;
        System.out.println("Average: " + average);

        //  Scores Variation
//        for (int i = 0; i < testScores.length; i++) {
//            int score = testScores[i];
//            System.out.println(score);
//            }

        // Average Variation
//        double average = Arrays.stream(testScores).average().orElse(0);
//        System.out.println("Average Score: " + average);

        int lowScore = testScores[0];
        int highScore = testScores[testScores.length-1];
        System.out.println("Lowest Score: " + lowScore);
        System.out.println("Highest Score: " + highScore);
    }

}
