package entity;

import view.Display;

public class CacheSettings extends Settings {
    private boolean cachework;
    private String pathToYouTubeCache;                   //путь к файлу кэша канала Ютуба

    public CacheSettings() {
        this.cachework = true;
        this.pathToYouTubeCache = "settings/YouTubeCache.json";
    }
    public void CacheWork(String Input) {                           //cachework на ошибочный ввод
        String superOut = Display.trueFalseCheckFromString(Input);
        if (!superOut.equals("error")) {                            // проверка на ошибочный ввод
            if (superOut.equals("true"))                            // если нет ошибки присваиваем соответствующее значение
                this.cachework = true;
            else this.cachework = false;
        }
    }
    public boolean getCachework() {
        return cachework;
    }
    public void setCachework(boolean cachework) {
        this.cachework = cachework;
    }
    public String getPathToYouTubeCache() {
        return pathToYouTubeCache;
    }
    public void setPathToYouTubeCache(String pathToYouTubeCache) {
        this.pathToYouTubeCache = pathToYouTubeCache;
    }
       public boolean getWork() {                     //сохранения в json
        return this.cachework;
    }
    public void setWork(boolean work) {              //сохранения из json
        this.cachework = work;
    }
}
