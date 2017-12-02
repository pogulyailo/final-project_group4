package view;

public interface Display {
     void displayMenu();
     void chooseItem();

    static String trueFalseCheckFromString(String input) {  // метод для считывания стринга который делает lowerCase если был введён "TruE" or "False"
        String work = input.toLowerCase();
            if (work.equals("true") || work.equals("false")) {         //проверка на валидность данных
                if (work.equals("true")) {
                    return "true";
                } else return "false";
            } else
                System.err.println("Invalid input");      // если введено отличающиеся от "true" or "False" - выдёет ошибку в меню
            return "error";
        }
}