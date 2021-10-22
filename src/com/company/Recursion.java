package com.company;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(Factorial(4));
    }
    static int Factorial(int n){
        if( n >= 1){
            return n * Factorial(n -1);
        }
        else{
            return 1;
        }
    }

}
