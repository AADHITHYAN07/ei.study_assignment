public class MainSingleton {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        System.out.println("Initial Config: " + config1.getConfiguration());
        
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        config2.setConfiguration("Updated Configuration");

        System.out.println("Config1: " + config1.getConfiguration());
        System.out.println("Config2: " + config2.getConfiguration());
    }
}
