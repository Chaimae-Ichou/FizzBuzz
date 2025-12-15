package com.controls.td6;

public class FizzBuzz {
    public static String de(int nombre){
        if (nombre % 5 == 0 && nombre % 3 == 0) {
            return "FizzBuzz";
        }
        if (nombre % 5 == 0) {
            return "Buzz";
        }
        if (nombre % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(nombre);
    }
}
