package src.main.java.com.shoefinder.configuration;

public class ConfigurationManager {

    private static ConfigurationManager webConfigurationManager;
    private static Configuration currentConfiguration;

    private ConfigurationManager(){}

    public static ConfigurationManager getInstance() {
        if (webConfigurationManager == null)
            webConfigurationManager = new ConfigurationManager();
        return webConfigurationManager;
    }

    public void loadConfigurationFile (String filePath) {

    }

    public void getCurrentConfiguration() {

    }

}
