package gof.dp.creational.singleton.registry;

public class TestSingletonRegistry {

    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance("security",null);
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance("db",null);
        ConfigurationManager configurationManager3 = ConfigurationManager.getInstance("db",null);
        if(configurationManager.equals(configurationManager2)) {
            System.out.println("Same configuration 1-2");
        }
        if(configurationManager2.equals(configurationManager3)) {
            System.out.println("Same configuration 2-3");
        }

    }
}
