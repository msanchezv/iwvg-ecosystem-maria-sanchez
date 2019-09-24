package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "mateo", "sánchez");
    }

    @Test
    void testFormat() {
        assertEquals("Mateo Sánchez", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("M.", user.initials());
    }

    @Test
    void testNumber() {
        assertEquals(1, user.getNumber());
    }

    @Test
    void testName() {
        assertEquals("Mateo", user.getName());
    }

    @Test
    void testFamilyName() {
        assertEquals("Sánchez", user.getFamilyName());
    }

    @Test
    void testNameUpperCase() {
        assertEquals("MATEO", user.getNameUpperCase());
    }
}
