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
public class ExteriorTest {
     @Test
    void constructor_sets_all_fields_and_getters_return_them() {
        Exterior exterior = new Exterior("Black", "235/45 R18", 18);

        assertEquals("Black", exterior.getColour());
        assertEquals("235/45 R18", exterior.getTyreSize());
        assertEquals(18, exterior.getWheelRimSize_inch());
    }

    @Test
    void setters_update_values() {
        Exterior exterior = new Exterior();
        exterior.setColour("Blue");
        exterior.setTyreSize("205/55 R16");
        exterior.setWheelRimSize_inch(16);

        assertEquals("Blue", exterior.getColour());
        assertEquals("205/55 R16", exterior.getTyreSize());
        assertEquals(16, exterior.getWheelRimSize_inch());
    }

    @Test
    void equals_and_hashCode_work_for_identical_exteriors() {
        Exterior a = new Exterior("Red", "195/65 R15", 15);
        Exterior b = new Exterior("Red", "195/65 R15", 15);

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void toString_contains_key_values() {
        Exterior exterior = new Exterior("White", "225/50 R17", 17);
        String s = exterior.toString();

        assertTrue(s.contains("Exterior"));
        assertTrue(s.contains("White"));
        assertTrue(s.contains("225/50 R17"));
        assertTrue(s.contains("17"));
    }
}
