package settings;

public class Cache extends SuperSettings {
    private boolean cachework;                           //переменная которая отвечает за работоспособность метода
    private String pathToYouTubeCache;                   //путь к файлу кэша канала Ютуб

    public Cache() {
        this.cachework = true;
        this.pathToYouTubeCache = "settings/YouTubeCache.json";
    }

    public void CacheWork() {                                     // метод проверки на ошибочный ввод
        String superOut = SuperSettings.toLowerCase(cachework);
        if (!superOut.equals("error")) {
            if (superOut.equals("true")) ;
            this.cachework = true;
        }else this.cachework = false;
    }

    public String getPathToYouTubeCache() {
        return pathToYouTubeCache;
    }

    public void setPathToYouTubeCache(String pathToYouTubeCache) {
        this.pathToYouTubeCache = pathToYouTubeCache;
    }

    public boolean getCachework() {                          // сохраняет из json
        return cachework;
    }

    public void setCachework(boolean cachework) {            //  сохраняет в json
        this.cachework = cachework;
    }
}


