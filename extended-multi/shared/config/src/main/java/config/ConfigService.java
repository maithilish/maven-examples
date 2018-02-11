package config;

import org.apache.commons.configuration2.CompositeConfiguration;

public class ConfigService {

    private CompositeConfiguration configs;

    public ConfigService() {
        configs = new CompositeConfiguration();
        configs.addProperty("datastore", "app");
    }

    public String getConfig(final String key) {
        return configs.getString(key);
    }
}
