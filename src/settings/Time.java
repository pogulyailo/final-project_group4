package settings;

import jdk.internal.util.xml.impl.Input;

public class Time extends SuperSettings{
    private boolean timework;
    private static long time;

    public Time() {
        this.timework = true;
    }
    public void setTime () {                                       // сеттер проверки на ошибочный ввод
        public void setTime (String Input){
            this.timework = SuperSettings.setWorkStatus(Input);
        }
    }
    public static void timeworkStart() {
        time = System.currentTimeMillis();
    }
    public static long timeworkEnd() {
        return time = System.currentTimeMillis() - time;
    }
    public boolean getTimework() {
        return this.timework;
    }
    public void setTimework(boolean timeworks) {
        timework = timeworks;
    }
}

