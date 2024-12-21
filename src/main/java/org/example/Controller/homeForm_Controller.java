package org.example.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class homeForm_Controller {
    public void btnAddFormOnAction(ActionEvent actionEvent) throws IOException {
        Stage addStage = new Stage();
        addStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/addForm.fxml"))));
        addStage.show();
    }

    public void btnViewFormOnAction(ActionEvent actionEvent) throws IOException {
        Stage viewStage = new Stage();
        viewStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/viewForm.fxml"))));
        viewStage.show();
    }


}
