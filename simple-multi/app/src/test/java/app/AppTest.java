package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        assertEquals(app.greet("world"),"Hello world");
    }

}
