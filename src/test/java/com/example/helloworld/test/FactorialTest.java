package com.example.helloworld.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setUp() {
        // Initialize the factorial instance before each test
    }

    @Test
    public void testFindFactorialOfZero() {
        factorial = new Factorial(0);
        assertEquals(1, factorial.findFactorial(), "Factorial of 0 should be 1");
    }

    @Test
    public void testFindFactorialOfPositiveNumber() {
        factorial = new Factorial(5);
        assertEquals(120, factorial.findFactorial(), "Factorial of 5 should be 120");
    }

    @Test
    public void testFindFactorialOfOne() {
        factorial = new Factorial(1);
        assertEquals(1, factorial.findFactorial(), "Factorial of 1 should be 1");
    }

    @Test
    public void testFindFactorialOfNegativeNumber() {
        factorial = new Factorial(-5);
        assertEquals(1, factorial.findFactorial(), "Factorial of negative number should be treated as 1");
    }
}