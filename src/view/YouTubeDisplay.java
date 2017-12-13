package view;

import entity.Main;
import entity.Settings;
import entity.YouTubeAnalytics;

import java.util.Scanner;

public class YouTubeDisplay implements Display{

    private static final String MENU = "Select a task :";
    private static final String ITEM1 = "1. Return to main screen";
    private static final String ITEM2 = "2. Lists all tasks";

    private YouTubeAnalytics youTubeAnalytics;
    private MainDisplay mainDisplay;

    public YouTubeDisplay() {
        this.youTubeAnalytics = new YouTubeAnalytics();
        this.mainDisplay = new MainDisplay();
    }
    public void displayMenu(){
        System.out.println(youTubeAnalytics.getYoutubeanalytics());
        System.out.println(MENU);
        System.out.println(ITEM1);
        System.out.println(ITEM2);

        chooseItem();
}
    public void chooseItem() {
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        switch (item){
            case 1: mainDisplay.displayMenu();               //вернуться на главный экран
            case 2:                                          //будет какой-то класс Task  в котором будет перечень задач, выбрав одну из них переходим на ТОТ экран(меню)
        }
    }
}
