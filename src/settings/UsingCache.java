package settings;

import entity.Main;
import view.MainDisplay;
import java.util.Scanner;

public class UsingCache{
    private static final String MENU = "Select an action :";
    private static final String ITEM1 = "1. Return to home screen";
    private static final String ITEM2 = "2. Save the cache? (True / False)";
    private static final String ITEM3 = "3. Exit";

    private MainDisplay mainDisplay;
    private UsingCache usingCache;

    public UsingCache() {
        this.mainDisplay = new MainDisplay();
        this.usingCache = new UsingCache();
    }
    public void displayMenu() {
        System.out.println(MENU);
        System.out.println(ITEM1);
        System.out.println(ITEM2);
        System.out.println(ITEM3);

        chooseItem();
    }
    public void chooseItem() {
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        switch (item) {
            case 1:
                mainDisplay.displayMenu();                           //вернуться на главный экран
            case 2:
                scanner.nextLine();
                System.out.println("Enter a value of True or False");

                String Input = scanner.nextLine();
                if (SuperSettings.trueFalseCheckFromString(Input)) {
                    Main.superSettings.cache.setCacheWork(Input);
                }
            case 3: System.exit(0);                                //выход из программы
        }
    }
}
