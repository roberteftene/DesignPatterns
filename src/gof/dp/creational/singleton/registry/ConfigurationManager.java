package gof.dp.creational.singleton.registry;

import java.util.HashMap;

public class ConfigurationManager {

    String type;
    String name;

    private static HashMap<String, ConfigurationManager> configs = new HashMap<>();

    private ConfigurationManager(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static synchronized ConfigurationManager getInstance(String type, String name) {
        ConfigurationManager configurationManager = configs.get(type);
        if(configurationManager == null) {
            configurationManager = new ConfigurationManager(type,name);
            configs.put(type,configurationManager);
        }
        return configurationManager;
    }

}
