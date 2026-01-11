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
public class TransmissionTest {
    @Test
    void constructor_and_getters_work() {
        Transmission t = new Transmission("CVT 6 speed", "4x2 - Front wheels");
        assertEquals("CVT 6 speed", t.getType());
        assertEquals("4x2 - Front wheels", t.getTraction());
    }

    @Test
    void setters_and_equals_hashCode_work() {
        Transmission a = new Transmission();
        a.setType("Automatic");
        a.setTraction("FWD");

        Transmission b = new Transmission("Automatic", "FWD");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertTrue(a.toString().contains("Automatic"));
    }
}
