package com.company;

public class TimeConversion {
    public static void main(String[] args) {
        TimeConversion(3, 28, 16, "pm");
    }

    static void TimeConversion(int hh, int mm, int ss, String amorpm) {
        if (amorpm.equalsIgnoreCase("AM") && hh == 12) {
            System.out.println(0 + " : " + mm + " : " + ss);
        } else if (amorpm.equalsIgnoreCase("am")) {
            System.out.println(hh + " : " + mm + " : " + ss);
        } else if (amorpm.equalsIgnoreCase("PM") && hh == 12) {
            System.out.println(hh + " : " + mm + " : " + ss);
        } else if (amorpm.equalsIgnoreCase("PM")) {
            System.out.println(hh + 12 + " : " + mm + " : " + ss);
        } else {
            System.out.println("Null");
        }
    }
}
