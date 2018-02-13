package ru.stqa.pft.java_pft;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nickolay on 09.02.18.
 */
public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }

}