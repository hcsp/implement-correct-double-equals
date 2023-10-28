package com.github.hcsp.datatype;

public class Main {
    public static void main(String[] args) {

        System.out.println(doubleEquals(0.1 + 0.2, 0.3));
    }


    public static boolean doubleEquals(double a, double b) {
        if (Math.abs(a - b) < 0.00000001) {

            return true;
        }
        else {
            return  false;
        }
    }
}

