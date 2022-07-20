package it.euris.patterns.behavioral.template.exercise;

public class Main {

    public static void main(String[] args) {
        DayTemplate day1 = new Day1();
        day1.startDay();
        System.out.println("************");
        DayTemplate day2 = new Day2();
        day2.startDay();
        System.out.println("************");
        DayTemplate day3 = new Day3();
        day3.startDay();
    }

}
