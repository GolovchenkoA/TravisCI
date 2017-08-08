package ua.golovchenko.artem.travisci;

import org.junit.Test;

import static org.junit.Assert.*;

public class XYZTest {

    @Test
    public void testSum() throws Exception {
        assertTrue(XYZ.sum(2,1).equals(3));
        assertTrue(XYZ.sum(2,2).equals(4));
    }

}