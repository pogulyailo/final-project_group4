package view;

import entity.Main;
import entity.Settings;
import entity.YouTubeAnalytics;

import java.util.Scanner;

public class SettingsDisplay implements Display{
    private static final String MENU = "Select an action :";
    private static final String ITEM1 = "1. Return to home screen";
    private static final String ITEM2 = "2. Edit Use cache";
    private static final String ITEM3 = "3. Edit Cache Path";
    private static final String ITEM4 = "3. Change the time spent executing";

    private Main main;
    private YouTubeAnalytics youTubeAnalytics;
    private Settings settings;

    public SettingsDisplay() {
        this.main = new Main();
        this.youTubeAnalytics = new YouTubeAnalytics();
        this.settings = new Settings();                   //что не так?
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
            case 1: main.displayMenu();                     //вернуться на главный экран
            case 2:                                         // Task использовать кеш
            case 3:                                         // Изменить Путь к кэшу
            case 4:                                         // Изменить Отображение времени затраченного не выполнение
        }
    }
}