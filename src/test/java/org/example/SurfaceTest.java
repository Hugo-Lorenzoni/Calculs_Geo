package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurfaceTest {
    @Test
    public void surfEquals () {
        System. out.println ("Test surfEquals") ;
        assertEquals(Produit.mult(5,3),15);
    }
    @Test
    public void surfNotEquals () {
        System. out.println ("Test surfNotEquals") ;
        assertNotEquals(Produit.mult( 1,1), 3);
    }
}
