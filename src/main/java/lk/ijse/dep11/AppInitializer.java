package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/MainView.fxml"));
        Scene mainScene = new Scene(root);

        AnchorPane splashroot = FXMLLoader.load(getClass().getResource("/view/SplashView.fxml"));
        Scene splashcene = new Scene(splashroot);

        primaryStage.setScene(splashcene);

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        splashroot.setBackground(Background.fill(Color.TRANSPARENT));
        splashcene.setFill(Color.TRANSPARENT);
        primaryStage.centerOnScreen();
        FadeTransition fade = new FadeTransition(Duration.millis(1000),splashroot);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.playFromStart();
        primaryStage.show();

        javafx.animation.PauseTransition pause = new javafx.animation.PauseTransition(Duration.seconds(3));
        pause.setOnFinished(event -> {
            primaryStage.close();
            Stage primaryStage2 = new Stage();
            primaryStage2.setScene(mainScene);
            primaryStage2.setTitle("Nova Pad");
            primaryStage2.setHeight(900);
            primaryStage2.setWidth(700);
            primaryStage2.centerOnScreen();
            primaryStage2.show();
        });
        pause.play();






    }
}
