package com.company;

public class TallestCandlesProb {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 4};
        System.out.println(CountTallestCandles(arr));
    }
    static int CountTallestCandles(int[] candles){
       int maxNo = candles[0];
       int highesCandlesNumber = 0;

       for(int i: candles){
           if(maxNo < i){
               maxNo = i;
           }
       }

       for(int i: candles){
           if(i == maxNo){
               highesCandlesNumber++;
           }
       }
        return highesCandlesNumber;
}
}
