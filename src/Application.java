import settings.Cache;
import settings.Time;
import view.MainDisplay;
import view.SettingsDisplay;
import view.YouTubeDisplay;

public class Application {
    public static void main(String[] args) {

        MainDisplay mainDisplay = new MainDisplay();
        mainDisplay.displayMenu();
        YouTubeDisplay youTubeDisplay = new YouTubeDisplay();
        youTubeDisplay.displayMenu();
        SettingsDisplay settingsDisplay = new SettingsDisplay();
        settingsDisplay.displayMenu();

        Cache cache = new Cache();
        cache.CacheWork();
        Time time = new Time();
        time.TimeWork();
    }
}
