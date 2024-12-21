package org.example.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.DbConnection.DBConnection;
import org.example.model.Items;

import java.net.URL;
import java.util.ResourceBundle;

public class addForm_Controller implements Initializable {
    public TextField NameField;
    public TextField QtyField;
    public TextField PriceField;
    public TextField DescField;
    public Label lblField;

    private static int itemIdCount = 1;

    public void btnAddOnAction(ActionEvent actionEvent) {
        String Id = lblField.getText();
        String name = NameField.getText();
        int qty = Integer.parseInt(QtyField.getText());
        Double price = Double.parseDouble(PriceField.getText());
        String dsc = DescField.getText();


        DBConnection.getInstance().getConnection().add(new Items(Id,name,qty,price,dsc));
        System.out.println(DBConnection.getInstance().getConnection());
        updateNextItemId();


    }
    private void loadTable(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        updateNextItemId();
    }
    private void updateNextItemId(){
        itemIdCount = DBConnection.getInstance().getConnection().size() + 1;
        lblField.setText("INO-"+String.format("%04d",itemIdCount));
    }
}
