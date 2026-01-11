/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.carmanagementsystem.editor;

import com.fils.carmanagementsystem.car.Car;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author davidioans
 */
public class LoaderTest {
    @TempDir
    Path tempDir;

    @Test
    void fromYAML_parses_full_car_graph() throws Exception {
        Path yaml = tempDir.resolve("car.yml");

        String content = """
                model: TestCar
                productionYear: 2025
                engineSpecs:
                  displacement: 2000
                  fuel: Petrol
                  noCylinders: 4
                  hasTurbo: true
                  hybrid: false
                  running: false
                transmission:
                  type: Automatic
                  traction: FWD
                interiorFeatures:
                  seats:
                    - material: Cloth
                      areHeated: false
                      areElectric: false
                  diagonalInfotainmentDisplay: 10.1
                  noSpeakers: 6
                  heatedWindscreen: true
                safetyFeatures:
                  noAirbags: 6
                  hasFrontParkSensors: true
                  hasBackParkSensors: true
                  hasParkCamera: false
                exteriorOptions:
                  colour: Blue
                  tyreSize: 205/55 R16
                  wheelRimSize_inch: 16
                """;

        Files.writeString(yaml, content, StandardCharsets.UTF_8);

        Car car = Loader.fromYAML(yaml);

        assertNotNull(car);
        assertEquals("TestCar", car.getModel());
        assertEquals(2025, car.getProductionYear());

        assertNotNull(car.getEngineSpecs());
        assertEquals(2000, car.getEngineSpecs().getDisplacement());
        assertEquals("Petrol", car.getEngineSpecs().getFuel());
        assertTrue(car.getEngineSpecs().isHasTurbo());

        assertNotNull(car.getExteriorOptions());
        assertEquals("Blue", car.getExteriorOptions().getColour());
        assertEquals(16, car.getExteriorOptions().getWheelRimSize_inch());
    }

    @Test
    void fromJSON_parses_full_car_graph() throws Exception {
        Path json = tempDir.resolve("car.json");

        String content = """
                {
                  "model": "JsonCar",
                  "productionYear": 2024,
                  "engineSpecs": {
                    "displacement": 1600,
                    "fuel": "Petrol",
                    "noCylinders": 4,
                    "hasTurbo": false,
                    "hybrid": true,
                    "running": true
                  },
                  "transmission": {
                    "type": "CVT",
                    "traction": "FWD"
                  },
                  "exteriorOptions": {
                    "colour": "White",
                    "tyreSize": "195/65 R15",
                    "wheelRimSize_inch": 15
                  }
                }
                """;

        Files.writeString(json, content, StandardCharsets.UTF_8);

        Car car = Loader.fromJSON(json);

        assertNotNull(car);
        assertEquals("JsonCar", car.getModel());
        assertEquals(2024, car.getProductionYear());
        assertTrue(car.getEngineSpecs().isHybrid());
        assertTrue(car.getEngineSpecs().isRunning());
        assertEquals("White", car.getExteriorOptions().getColour());
    }
}
