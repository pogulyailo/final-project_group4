package settings;

import entity.Main;

public class StaticSettings {
    public static boolean getChache() {
        return Main.superSettings.cache.getWork();
    }
    public static String getPath() {
        return Main.superSettings.cache.getPathToYouTubeCache();
    }
    public static boolean getTime() {
        return Main.superSettings.Time.getWork();
    }
    public static boolean setChache(String input) {
        if (SuperSettings.trueFalseCheckFromString(input)) {
            Main.superSettings.cache.setCacheWork(input);
            return true;
        } else return false;
    }
    public static boolean setChache(String input) {
        if (SuperSettings.trueFalseCheckFromString(input)) {
            Main.superSettings.cache.setCacheWork(input);
            return true;
        } else return false;
    }
    public static void setCachePath(String input) {
        Main.superSettings.cache.setPathToYouTubeCache(input);
    }
    public static void defaultSettings() {
        Main.superSettings = new SuperSettings();
        Main.superSettings.cache = new Cache();
        Main.superSettings.time = new Time();
    }
}
