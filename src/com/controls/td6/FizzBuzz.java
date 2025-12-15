package com.controls.td6;

public class FizzBuzz {
    public static String de(int nombre){
        boolean divisiblePar3 = nombre % 3 == 0;
        boolean divisiblePar5 = nombre % 5 == 0;

        if (divisiblePar3 && divisiblePar5) {
            return "FizzBuzz";
        }
        if (divisiblePar3) {
            return "Fizz";
        }
        if (divisiblePar5) {
            return "Buzz";
        }
        return Integer.toString(nombre);

    }
}
