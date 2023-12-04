package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProduitTest {
    @Test
    public void multEquals () {
        System. out.println ("Test multEquals") ;
        assertEquals(Produit.mult(5,3),15);
    }
    @Test
    public void multNotEquals () {
        System. out.println ("Test multNotEquals") ;
        assertNotEquals(Produit.mult( 1,1), 3);
    }
}