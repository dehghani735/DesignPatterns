package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = new ConfigManager();
        manager.set("name", "Mosh");

        ConfigManager other = new ConfigManager();
        System.out.println(other.get("name"));
    }
}
