package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        int[] numbers = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        System.out.println(average);
    }
}
