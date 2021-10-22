package com.company;

public class AppleAndOranges {
    static int homeStartpoint = 7;
    static int homeEndPoint = 10;
    static int numberOfApples = 0;
    static int numberOfOranges = 0;
    static int appleTreePoint = 4;
    static int orangeTreePoint = 12;
    public static void main(String[] args) {


        int[] applesThrownDistance = {2, 3, -4};
        int[] orangesThrownDistance = {3, -2, -4};
        FindApplesAndOranges(applesThrownDistance, orangesThrownDistance);

    }

    private static void FindApplesAndOranges(int[] applesThrownDistance, int[] orangesThrownDistance) {
        int[] applesLandPoint = new int[applesThrownDistance.length];
        for(int i = 0; i < applesThrownDistance.length; i++){
             applesLandPoint[i] = applesThrownDistance[i] + appleTreePoint;
        }

        int[] orangesLandPoint = new int[orangesThrownDistance.length];
        for(int i = 0; i < orangesThrownDistance.length; i++){
            orangesLandPoint[i] = orangesThrownDistance[i] + orangeTreePoint;
        }

        for(int j: orangesLandPoint){
            if(j >= homeStartpoint && j <= homeEndPoint){
                numberOfOranges++;
            } else {

            }
        }
        for (int j: applesLandPoint){
            if(j >= homeStartpoint && j <= homeEndPoint){
                numberOfApples++;
            } else {

            }
        }

        System.out.println("Number of Apples: " + numberOfApples);
        System.out.println("Number of Oranges: " + numberOfOranges);
    }
}
