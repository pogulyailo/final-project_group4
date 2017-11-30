package project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainFx extends Application{
    //размер окна

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane(); // пустая панель
        Scene scene = new Scene(root); //привязываем окно к нашей сцене
        primaryStage.setScene(scene); //привязываем окно программы к сцене
        primaryStage.setWidth(WIDTH); // прижимаем к правому краю экрана
        primaryStage.setHeight(HEIGHT);
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getWidth());
        primaryStage.show(); // отображаем окно

    }
}
