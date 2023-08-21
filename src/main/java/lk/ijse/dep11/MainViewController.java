package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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

    public void mnuserguidOnAction(ActionEvent actionEvent) {
    }

    public void mnaboutOnAction(ActionEvent actionEvent) {
    }
}
