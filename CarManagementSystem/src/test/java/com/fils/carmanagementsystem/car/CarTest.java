/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.carmanagementsystem.car;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author davidioans
 */
public class CarTest {
    @Test
    void all_args_constructor_sets_fields() {
        Engine engine = new Engine(2499, "Petrol", 4, false, true, false);
        Transmission transmission = new Transmission("CVT 6 speed", "4x2 - Front wheels");
        Interior interior = new Interior(List.of(new Seats("Leather", true, true)), 12.3, 8, true);
        Safety safety = new Safety(9, true, true, true);
        Exterior exterior = new Exterior("Black", "235/45 R18", 18);

        Car car = new Car("Toyota Camry", 2025, engine, transmission, interior, safety, exterior);

        assertEquals("Toyota Camry", car.getModel());
        assertEquals(2025, car.getProductionYear());
        assertEquals(engine, car.getEngineSpecs());
        assertEquals(transmission, car.getTransmission());
        assertEquals(interior, car.getInteriorFeatures());
        assertEquals(safety, car.getSafetyFeatures());
        assertEquals(exterior, car.getExteriorOptions());
    }

    @Test
    void toString_includes_model_year_and_some_components() {
        Car car = new Car(
                "Toyota Camry",
                2025,
                new Engine(2499, "Petrol", 4, false, true, false),
                new Transmission("CVT 6 speed", "4x2 - Front wheels"),
                null,
                null,
                new Exterior("Black", "235/45 R18", 18)
        );

        String s = car.toString();

        assertTrue(s.contains("Toyota Camry"));
        assertTrue(s.contains("2025"));
        assertTrue(s.contains("Engine Specs"));
        assertTrue(s.contains("Exterior"));
    }

    @Test
    void equals_and_hashCode_work_for_identical_cars() {
        Engine engine = new Engine(2000, "Diesel", 4, true, false, true);
        Transmission transmission = new Transmission("Automatic", "FWD");
        Exterior exterior = new Exterior("Blue", "205/55 R16", 16);

        Car a = new Car("ModelX", 2020, engine, transmission, null, null, exterior);
        Car b = new Car("ModelX", 2020, new Engine(2000, "Diesel", 4, true, false, true),
                new Transmission("Automatic", "FWD"), null, null,
                new Exterior("Blue", "205/55 R16", 16));

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
