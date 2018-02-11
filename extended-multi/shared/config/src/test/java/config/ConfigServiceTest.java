package config;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConfigServiceTest {

    @Test
    public void testGetConfig() {
        ConfigService cs = new ConfigService();
        assertEquals(cs.getConfig("datastore"), "app");
    }

}
