package settings;

public class SuperSettings {
    public Cache cache;
    public Time time;
    public static final String VERSION = "0.0.1";

    public static boolean trueFalseCheckFromString(String Input) {
        String workTemp = Input.toLowerCase();                                  //переводим введённый стринг в lowercase
        if (workTemp.equals("true") || workTemp.equals("false")) {              //проверка на валидность данных
            return true;
        } else
            System.err.println("Wrong input data");                             // если введено отличающиеся от "true" or "False" - выдёет ошибку в меню
        return false;                                                           // возвращает значение false если не правильные данные
    }

    protected static boolean setWorkStatus(String Input) {
        String work = Input.toLowerCase();
        if (work.equals("true")) {                                              //проверка на "true";
            return true;
        } else
            return false;
    }
}
