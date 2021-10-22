package com.company;

public class KangrooProb {
    public static void main(String[] args) {
        System.out.println(LapEachOther(0, 3, 4, 2, 4));
    }

    static String LapEachOther(int firstKStartPnt, int secondKStartPnt, int firstKJumpRate, int secondKJumpRate,
                               int jumptime) {
        if (firstKStartPnt > secondKStartPnt && firstKJumpRate > secondKJumpRate) {
            return "NO";
        }
        if (secondKStartPnt > firstKStartPnt && secondKJumpRate > firstKJumpRate) {
            return "NO";
        }
        for (int i = 0; i <= jumptime; i++) {
            int firstKcurrentLocation = firstKStartPnt + (firstKJumpRate * i);
            int secondKcurrentLocation = secondKStartPnt + (secondKJumpRate * i);
            if (firstKcurrentLocation == secondKcurrentLocation) {
                return "Yes";
            }
        }
        return "NO";
    }
}

