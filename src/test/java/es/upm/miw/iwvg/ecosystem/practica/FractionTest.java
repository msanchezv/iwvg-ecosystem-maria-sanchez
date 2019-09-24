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
        assertEquals(true, fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertEquals(false, fraction.isImproper());
    }

    @Test
    void testHigher() {
        Fraction fraction2 = new Fraction(3, 4);
        assertEquals(fraction2, fraction.higher(fraction2));
    }

    @Test
    void testLower() {
        Fraction fraction2 = new Fraction(3, 4);
        assertEquals(fraction, fraction.lower(fraction2));
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction2 = new Fraction(3, 6);
        assertEquals(true, fraction.isEquivalent(fraction2));
    }

}
