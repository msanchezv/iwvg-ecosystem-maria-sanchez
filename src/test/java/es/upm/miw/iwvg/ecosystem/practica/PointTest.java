package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void before() {
        point = new Point(2, 3, 4);
    }

    @Test
    void testPointIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
        assertEquals(4, point.getZ());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
        assertEquals(2, point.getZ());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
        assertEquals(0, point.getZ());
    }

    @Test
    void testSetPoint() {
        point = new Point();
        point.setX(12);
        point.setY(13);
        point.setZ(26);
        assertEquals(12, point.getX());
        assertEquals(13, point.getY());
        assertEquals(26, point.getZ());
    }

    @Test
    void testModule() {
        assertEquals(5.3851, point.module(), 10e-5);
    }

    @Test
    void testPhase() {
        assertEquals(0.5880, point.phase(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
        assertEquals(3, point.getZ());
    }

    @Test
    void testToString() {
        String pointStr = "Point{" +
                "x=" + point.getX() +
                ", y=" + point.getY() +
                ", z=" + point.getZ() +
                '}';
        assertEquals(pointStr, point.toString());
    }
}
