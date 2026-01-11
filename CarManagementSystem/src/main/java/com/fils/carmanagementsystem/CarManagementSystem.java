/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fils.carmanagementsystem;
import com.fils.carmanagementsystem.car.*;
import com.fils.carmanagementsystem.editor.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
/**
 *
 * @author davidioans
 */
public class CarManagementSystem {

    public static void main(String[] args) {
        Engine engine = new Engine(2499, "Petrol", 4, false, true, false);
        Transmission transmission = new Transmission("CVT 6 speed", "4x2 - Front wheels");
        List<Seats> seats = List.of(
                new Seats("Leather", true, true),
                new Seats("Leather", true, true),
                new Seats("Leather", true, false),
                new Seats("Leather", true, false)
        );
        Interior interior = new Interior(seats, 12.3, 8, true);
        Safety safetyFeatures = new Safety(9, true, true, true);
        Exterior exteriorOptions = new Exterior("Black", "235/45 R18", 18);
        
        Car toyota_camry_black = new Car("Toyota Camry", 2025, engine, transmission, interior, safetyFeatures, exteriorOptions);
        
        System.out.println(toyota_camry_black);
        
        System.out.println("Working dir = " + System.getProperty("user.dir"));

        try {
            Path yaml = Paths.get("src/main/java/com/fils/carmanagementsystem/resources/toyota_camry.yml");
            Car toyota_camry_white = Loader.fromYAML(yaml);
            System.out.println(toyota_camry_white);
        } catch (Exception e){
            System.err.println("Failed to load car definition.\n");
            e.printStackTrace();
        }
    }
}