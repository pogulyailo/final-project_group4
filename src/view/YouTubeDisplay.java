package view;

import entity.Main;
import entity.Settings;
import entity.YouTubeAnalytics;

import java.util.Scanner;

public class YouTubeDisplay implements Display{
    private String youtubeanalytics;
    private static final String MENU = "Select a task :";
    private static final String ITEM1 = "1. Return to home screen";
    private static final String ITEM2 = "2. Lists all tasks";
    private static final String ITEM3 = "3. Return to the main screen";

    private Main main;
    private YouTubeAnalytics youTubeAnalytics;
    private Settings settings;

    public YouTubeDisplay() {
        this.main = new Main();
        this.youTubeAnalytics = new YouTubeAnalytics();
        this.settings = new Settings();
        this.youtubeanalytics = youTubeAnalytics.getYoutubeanalytics();
    }
    public String getYoutubeanalytics() {
        return youtubeanalytics;
    }
    public void setYoutubeanalytics(String youtubeanalytics) {
        this.youtubeanalytics = youtubeanalytics;
    }
        public void displayMenu(){
        System.out.println(youtubeanalytics);
        System.out.println(MENU);
        System.out.println(ITEM1);
        System.out.println(ITEM2);
        System.out.println(ITEM3);

        chooseItem();
}
    public void chooseItem() {
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        switch (item){
            case 1: main.displayMenu();               //вернуться на главный экран
            case 2:                                   //будет какой-то класс Task  в котором будет перечень задач, выбрав одну из них переходим на ТОТ экран(меню)
        }
    }
}
