package org.abstract_class;


import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

class CircleTest {

    @BeforeClass
    void setUp() {
    }

    @AfterClass
    void tearDown() {
    }

    @Test
    void getPerimeter() {
        new Circle(1);
    }

    @Test
    public void getSquare() {
    }
}