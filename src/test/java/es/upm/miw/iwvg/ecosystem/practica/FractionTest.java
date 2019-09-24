package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {
    private Fraction fraction;
    private Fraction fractionDefault;

    @BeforeEach
    void before() {
        fraction = new Fraction(1, 2);
        fractionDefault = new Fraction();
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, fraction.decimal());
        assertEquals(1, fractionDefault.decimal());
    }

    @Test
    void testNumerator() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fractionDefault.getNumerator());
    }

    @Test
    void testDenominator() {
        assertEquals(2, fraction.getDenominator());
        assertEquals(1, fractionDefault.getDenominator());
    }

    @Test
    void testIsProper() {
        Fraction f2 = new Fraction(5, 2);
        assertEquals(true, fraction.isProper());
        assertEquals(false, f2.isProper());
    }

    @Test
    void testIsImproper() {
        Fraction f2 = new Fraction(5, 2);
        assertEquals(false, fraction.isImproper());
        assertEquals(true, f2.isImproper());
    }

    @Test
    void testHigher() {
        Fraction f2 = new Fraction(3, 4);
        assertEquals(f2, fraction.higher(f2));
        Fraction f3 = new Fraction(1, 2);
        assertEquals(fraction, fraction.higher(f3));
    }

    @Test
    void testLower() {
        Fraction f2 = new Fraction(3, 4);
        assertEquals(fraction, fraction.lower(f2));
        Fraction f3 = new Fraction(1, 3);
        assertEquals(f3, fraction.lower(f3));
    }

}
