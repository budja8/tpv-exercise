package oop.inheritance.ingenico;

import java.util.Properties;

public class IngenicoStorageSystem {
    private static volatile IngenicoStorageSystem storageSystem;

    private IngenicoStorageSystem(){

    }

    public static IngenicoStorageSystem getStorageSystem(){
        if(storageSystem == null){
            synchronized (IngenicoStorageSystem.class){
                if(storageSystem == null){
                    storageSystem = new IngenicoStorageSystem();
                }
            }
        }
        return storageSystem;
    }


    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
