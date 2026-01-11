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
public class InteriorTest {
    @Test
    void constructor_and_getters_work() {
        List<Seats> seats = List.of(
                new Seats("Leather", true, true),
                new Seats("Leather", true, false)
        );

        Interior i = new Interior(seats, 12.3, 8, true);

        assertEquals(2, i.getSeats().size());
        assertEquals(12.3, i.getDiagonalInfotainmentDisplay(), 0.0001);
        assertEquals(8, i.getNoSpeakers());
        assertTrue(i.isHeatedWindscreen());
    }

    @Test
    void setters_and_equals_hashCode_work() {
        Interior a = new Interior();
        a.setSeats(List.of(new Seats("Cloth", false, false)));
        a.setDiagonalInfotainmentDisplay(10.1);
        a.setNoSpeakers(6);
        a.setHeatedWindscreen(false);

        Interior b = new Interior(List.of(new Seats("Cloth", false, false)), 10.1, 6, false);

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertTrue(a.toString().contains("10.1") || a.toString().contains("10,1"));
    }
}
