package org.example.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.DbConnection.DBConnection;
import org.example.model.Items;

public class viewForm_Controller {

    public TableView tblViewForm;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colQty;
    public TableColumn colPrice;
    public TableColumn colDsc;

    public void btnReloadOnAction(ActionEvent actionEvent) {
        loadTable();
    }

    private void loadTable(){
        ObservableList<Items> itemObservableList = FXCollections.observableArrayList();
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colDsc.setCellValueFactory(new PropertyValueFactory<>("dsc"));

        DBConnection.getInstance().getConnection().forEach(obj->{
            itemObservableList.add(obj);
        });

        tblViewForm.setItems(itemObservableList);
    }


    public void btnDeleteOnAction(ActionEvent actionEvent) {
        Items selectedItem = (Items) tblViewForm.getSelectionModel().getSelectedItem();
        System.out.println(selectedItem.toString());

        if (selectedItem != null) {
            DBConnection.getInstance().getConnection().remove(selectedItem);
            tblViewForm.getItems().remove(selectedItem);
        }else{
            System.out.println("No selected item");
            loadTable();
        }


    }
}
