package com.company;

public class PlusMinusProb {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, -1, -1};
        PlusMinusProblem(array);
    }

    private static void PlusMinusProblem(int[] array) {
        int noOfPositiveValue = 0;
        int noOfNegativeValue = 0;
        int noOfZero = 0;

        for (int j : array) {
            if (j > 0) {
                noOfPositiveValue++;
            } else if (j < 0) {
                noOfNegativeValue++;
            } else {
                noOfZero++;
            }


        }
        double ratioOfPostive = (double) noOfPositiveValue / array.length;
        double ratioOfNegative = (double) noOfNegativeValue / array.length;
        double ratioOfZero = (double) noOfZero / array.length;

        System.out.println(ratioOfPostive);
        System.out.println(ratioOfNegative);
        System.out.println(ratioOfZero);
    }
}
