package com.company;

public class GradingStudents {
    public static void main(String[] args) {
        Grading(73);
        Grading(67);
        Grading(40);
        Grading(33);
    }
    static void Grading(int mark) {
        if (mark < 38) {
            System.out.println(mark);
        } else {
            if (roundToMultiplOfFive(mark) - mark < 3) {
                System.out.println(roundToMultiplOfFive(mark));
            } else {
                System.out.println(mark);
            }
        }
    }
    static int roundToMultiplOfFive(int mark) {
        int modulus = mark % 5;
        int addNumber = 5 - modulus;
        return mark + addNumber;
    }
}
