package settings;

public class Time extends SuperSettings{
    private boolean timework;                          //переменная которая отвечает за работоспособность метода
    private long time;                                 //переменная куда мы записываем время за которое происходит операция

    public Time() {
        this.timework = true;
    }
    public void TimeWork (){                                       // метод проверки на ошибочный ввод
        String superOut = SuperSettings.toLowerCase(timework);
        if (!superOut.equals("error")) {
            if (superOut.equals("true")) ;
            this.timework = true;
        }else this.timework = false;
    }

    public void TimeStart(){                                   //запускаем в начале процесса для подсчёта времени выполнения
        this.time = System.currentTimeMillis();
    }

    public long getTime() {                                 //запускаем в конце процесса для подсчёта времени затраченого на выполнени
        return time;
    }

    public boolean getTimework() {                          // сохраняет из json
        return timework;
    }

    public void setTimework(boolean timework) {              //  сохраняет в json
        this.timework = timework;
    }
}
