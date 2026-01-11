/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.carmanagementsystem.car;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author davidioans
 */
public class SeatsTest {
    @Test
    void constructor_and_getters_work() {
        Seats s = new Seats("Leather", true, false);
        assertEquals("Leather", s.getMaterial());
        assertTrue(s.isAreHeated());
        assertFalse(s.isAreElectric());
    }

    @Test
    void setters_and_equals_hashCode_work() {
        Seats a = new Seats();
        a.setMaterial("Cloth");
        a.setAreHeated(false);
        a.setAreElectric(true);

        Seats b = new Seats("Cloth", false, true);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertTrue(a.toString().contains("Cloth"));
    }
}
