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
public class EngineTest {
    @Test
    void constructor_sets_all_fields_and_getters_return_them() {
        Engine engine = new Engine(
                2499,          // displacement
                "Petrol",      // fuel
                4,             // noCylinders
                false,         // hasTurbo
                true,          // hybrid
                false          // running
        );

        assertEquals(2499, engine.getDisplacement());
        assertEquals("Petrol", engine.getFuel());
        assertEquals(4, engine.getNoCylinders());
        assertFalse(engine.isHasTurbo());
        assertTrue(engine.isHybrid());
        assertFalse(engine.isRunning());
    }

    @Test
    void startStop_toggles_running_state_branch_coverage() {
        Engine engine = new Engine();
        engine.setRunning(false);

        engine.StartStop();
        assertTrue(engine.isRunning());

        engine.StartStop();
        assertFalse(engine.isRunning());
    }

    @Test
    void equals_and_hashCode_work_for_identical_engines() {
        Engine a = new Engine(2000, "Diesel", 4, true, false, true);
        Engine b = new Engine(2000, "Diesel", 4, true, false, true);

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void toString_contains_key_values() {
        Engine engine = new Engine(1800, "Petrol", 4, true, false, true);
        String s = engine.toString();

        assertTrue(s.contains("Engine Specs"));
        assertTrue(s.contains("1800"));
        assertTrue(s.contains("Petrol"));
        assertTrue(s.contains("true")); // turbo/running flags appear in output
    }
}
