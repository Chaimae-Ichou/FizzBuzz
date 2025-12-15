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
    @Test
    public void testNombre6RetourneFizz() {
        String resultat = FizzBuzz.de(6);

        System.out.println("Résultat obtenu pour 6 : " + resultat);

        assertEquals("Fizz", resultat);
    }
    @Test
    public void testNombre9RetourneFizz() {
        String resultat = FizzBuzz.de(9);

        System.out.println("Résultat obtenu pour 9 : " + resultat);

        assertEquals("Fizz", resultat);
    }
    @Test
    public void testNombre5RetourneBuzz() {
        String resultat = FizzBuzz.de(5);

        System.out.println("Résultat obtenu pour 5 : " + resultat);

        assertEquals("Buzz", resultat);
    }

}
