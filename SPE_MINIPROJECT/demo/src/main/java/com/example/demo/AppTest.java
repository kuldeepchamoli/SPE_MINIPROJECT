package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    App app = new App();
    double delta = 0.001;

    @Test
    public void testSquareroot() {
        assertEquals(2.0, app.squareRoot(4.0), delta);
    }

    @Test
    public void testFactorial() {
        assertEquals(24, app.factorial(4));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.386, app.naturalLogarithm(4.0), delta);
    }

    @Test
    public void testPower() {
        assertEquals(16.0, app.powerFunction(4.0, 2.0), delta);
    }
}