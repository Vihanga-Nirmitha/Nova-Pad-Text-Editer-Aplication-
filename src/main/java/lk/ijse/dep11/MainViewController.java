package lk.ijse.dep11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainViewController {
    public MenuBar mnmain;
    public AnchorPane root;


    public void initializer(){



    }

    public void mnnewOnAction(ActionEvent actionEvent) throws Exception{


        AnchorPane newroot = FXMLLoader.load(getClass().getResource("/view/MainView.fxml"));
        Scene newscene = new Scene(newroot);
        Stage newstage = new Stage();

        newstage.setScene(newscene);
        newstage.setTitle("Nova Pad");
        newstage.centerOnScreen();
        newstage.setHeight(900);
        newstage.setWidth(700);
        newstage.show();



    }

    public void mnexitOnAction(ActionEvent actionEvent) {


    }

    public void mnuserguidOnAction(ActionEvent actionEvent) throws  Exception{
        AnchorPane guidroot = FXMLLoader.load(getClass().getResource("/view/UserGuid.fxml"));
        Scene guidscene = new Scene(guidroot);
        Stage guidstage = new Stage();
        guidstage.initModality(Modality.APPLICATION_MODAL);
        guidstage.setScene(guidscene);
        guidstage.setTitle("New Modal Window");
        guidstage.setAlwaysOnTop(true);
        guidstage.show();
    }


    public void mnaboutOnAction(ActionEvent actionEvent) throws  Exception{

        AnchorPane aboutroot = FXMLLoader.load(getClass().getResource("/view/AboutUs.fxml"));
        Scene aboutscene = new Scene(aboutroot);
        Stage aboutstage = new Stage();
        aboutstage.setScene(aboutscene);
        aboutstage.initStyle(StageStyle.TRANSPARENT);
        aboutstage.centerOnScreen();
        aboutstage.show();
    }
}
