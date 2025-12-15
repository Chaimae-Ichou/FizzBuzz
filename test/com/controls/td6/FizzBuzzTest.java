package com.controls.td6;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void testNombre1Retourne1() {
        String resultat = FizzBuzz.de(1);

        System.out.println("Résultat obtenu pour 1 : " + resultat);

        assertEquals("1", resultat);
    }
    @Test
    public void testNombre2Retourne2() {
        String resultat = FizzBuzz.de(2);

        System.out.println("Résultat obtenu pour 2 : " + resultat);

        assertEquals("2", resultat);
    }
    @Test
    public void testNombre3RetourneFizz() {
        String resultat = FizzBuzz.de(3);

        System.out.println("Résultat obtenu pour 3 : " + resultat);

        assertEquals("Fizz", resultat);
    }

}
