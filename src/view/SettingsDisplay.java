package view;

import entity.Settings;
import settings.UsingCache;
import java.util.Scanner;

public class SettingsDisplay implements Display {
    private static final String MENU = "Select an action :";
    private static final String ITEM1 = "1. Return to home screen";
    private static final String ITEM2 = "2. Edit Use cache";
    private static final String ITEM3 = "3. Edit Cache Path";
    private static final String ITEM4 = "4. Change the time spent executing";

    private Settings settings;
    private MainDisplay mainDisplay;
    private UsingCache usingCache;

    public SettingsDisplay() {
        this.settings = new Settings();
        this.mainDisplay = new MainDisplay();
        this.usingCache = new UsingCache();
    }

    public void displayMenu() {
        System.out.println(settings.getSettings());
        System.out.println(MENU);
        System.out.println(ITEM1);
        System.out.println(ITEM2);
        System.out.println(ITEM3);
        System.out.println(ITEM4);

        chooseItem();
    }

    public void chooseItem() {
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        switch (item) {
            case 1: mainDisplay.displayMenu();             // вернуться на главный экран
            case 2: usingCache.displayMenu();              // использовать кеш
            case 3: pathcache();                           // Изменить Путь к кэшу
            case 4: timeSpent();                           // Изменить Отображение времени затраченного не выполнение
        }
    }
}