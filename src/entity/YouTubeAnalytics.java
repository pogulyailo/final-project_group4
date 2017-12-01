package entity;

import view.Display;

public class YouTubeAnalytics implements Display{
    private String youtubeanalytics;

    public YouTubeAnalytics(){
        this.youtubeanalytics = "YouTube Analytics";
    }

    public YouTubeAnalytics(String youtubeanalytics) {
        this.youtubeanalytics = youtubeanalytics;
    }

    public String getYoutubeanalytics() {
        return youtubeanalytics;
    }

    public void setYoutubeanalytics(String youtubeanalytics) {
        this.youtubeanalytics = youtubeanalytics;
    }

    @Override
    public void displayMenu() {

    }

    @Override
    public void chooseItem() {

    }
}

