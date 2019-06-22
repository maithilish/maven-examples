package util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilTest {

    @Test
    public void testJoin() {
        assertEquals(Util.join("x", "y"), "xy");
    }

}
