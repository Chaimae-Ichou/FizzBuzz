package com.controls.td6;

public class FizzBuzz {
    public static String de(int nombre){
        if (nombre % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(nombre);
    }
}
