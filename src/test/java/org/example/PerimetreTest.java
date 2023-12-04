package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerimetreTest {
    @Test
    public void perimEquals () {
        System. out.println ("Test perimEquals") ;
        assertEquals(Perimetre.perim(5,3,2),16);
    }
    @Test
    public void perimNotEquals () {
        System. out.println ("Test perimNotEquals") ;
        assertNotEquals(Perimetre.perim( 1,1,3), 3);
    }
}