package settings;

import view.MainDisplay;

import java.util.Scanner;

public class PathCache {

    private static final String MENU = "Select an action :";
    private static final String ITEM1 = "1. Enter a new path to the cache";
    private static final String ITEM2 = "2. Exit";

    private MainDisplay mainDisplay;
    private PathCache pathCache;

    public PathCache() {
        this.mainDisplay = new MainDisplay();
        this.pathCache = new PathCache();
    }

    public void displayMenu() {
        System.out.println(MENU);
        System.out.println(ITEM1);
        System.out.println(ITEM2);

        chooseItem();
    }

    public void chooseItem() {
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        switch (item) {
            case 1:
                scanner.nextLine();
                System.out.println("Enter a new path to the cache :");

                String userInput = scanner.nextLine();
                StaticSettings.setCachePath(Input);
            case 2: mainDisplay.displayMenu();                           //вернуться на главный экран
        }
    }
}
