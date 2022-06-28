package org.abstract_class;


import org.testng.Assert;
import org.testng.annotations.*;

public class CubeTest {

    @BeforeClass
    void setUp() {
    }

    @AfterClass
    void tearDown() {
    }

    @Test
    void testGetVolume() {
        Cube cube1 = new Cube(3.0);
        Assert.assertEquals(cube1.getVolume(), 27.0, "error!");
    }
}
