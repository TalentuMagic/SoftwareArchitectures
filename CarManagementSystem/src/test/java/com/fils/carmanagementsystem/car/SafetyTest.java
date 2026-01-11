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
public class SafetyTest {
    @Test
    void constructor_and_getters_work() {
        Safety s = new Safety(9, true, true, true);

        assertEquals(9, s.getNoAirbags());
        assertTrue(s.isHasFrontParkSensors());
        assertTrue(s.isHasBackParkSensors());
        assertTrue(s.isHasParkCamera());
    }

    @Test
    void setters_and_equals_hashCode_work() {
        Safety a = new Safety();
        a.setNoAirbags(6);
        a.setHasFrontParkSensors(false);
        a.setHasBackParkSensors(true);
        a.setHasParkCamera(false);

        Safety b = new Safety(6, false, true, false);

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertTrue(a.toString().contains("6"));
    }
}
