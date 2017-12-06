package settings;

public class SuperSettings {
    public Cache cache;
    public Time time;

    static String toLowerCase(boolean input) {               // метод для считывания стринга, который преобразует все символы данной строки в нижний регистр, для "TruE" or "False"
        String work = input.toLowerCase();
        if (work.equals("true") || work.equals("false")) {  //проверка на валидность данных
            if (work.equals("true")) {
                return "true";
            } else return "false";
        } else
            System.err.println("Invalid input");    // ошибка в меню если не "true" or "False"
        return "error";                             // если не правильные даннык возвращает error
    }
}
