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

}
