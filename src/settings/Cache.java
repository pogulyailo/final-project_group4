package settings;

public class Cache extends SuperSettings {
    private boolean cachework;
    private String pathToYouTubeCache;

    public Cache() {
        this.cachework = false;
        this.pathToYouTubeCache = "";
    }

    public void setCacheWork(String Input) {
        this.cachework = SuperSettings.setWorkStatus(Input);
    }

    public String getPathToYouTubeCache() {
        return this.pathToYouTubeCache;
    }

    public void setPathToYouTubeCache(String pathToYouTubeCache) {
        this.pathToYouTubeCache = pathToYouTubeCache;
    }

    public boolean getCachework() {
        return this.cachework;
    }

    public void setCachework(boolean cachework) {
        this.cachework = cachework;
    }
}

