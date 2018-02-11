package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        assertEquals(app.greet("world"), "Hello world");
    }

    @Test
    public void testStore() {
        App app = new App();
        assertTrue(app.store("x"));
    }

}
