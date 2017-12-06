package settings;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JsonExample {
    public static String readfromJson(String pathToJsonFile){         //считывание Json и возвращает в виде String
        try {
            String json = new Scanner(new File(pathToJsonFile)).useDelimiter("\\Z").next();

            return json;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void saveJson(String pathToJsonFile, Object object) {   //сохранение объекта в JSON формате
        try {
            FileWriter writer = new FileWriter(pathToJsonFile);
            String json = JSON.toJSONString(object);
            writer.write(json);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}