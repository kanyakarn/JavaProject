package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML public Button buttonYear1;
    @FXML public Button buttonYear2;
    @FXML public Button buttonYear3;
    @FXML public Button buttonYear4;

    public void changePageYear1 (ActionEvent actionEvent) throws IOException{
        Stage stage = (Stage) buttonYear1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("year1.fxml"));
        stage.setTitle("Regis");
        stage.setScene(new Scene(root,600,450));
        stage.show();
    }

    public void changePageYear2 (ActionEvent actionEvent) throws IOException{
        Stage stage = (Stage) buttonYear2.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("year2.fxml"));
        stage.setTitle("Regis");
        stage.setScene(new Scene(root,600,450));
        stage.show();
    }

    public void changePageYear3 (ActionEvent actionEvent) throws IOException{
        Stage stage = (Stage) buttonYear3.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("year3.fxml"));
        stage.setTitle("Regis");
        stage.setScene(new Scene(root,600,450));
        stage.show();
    }

    public void changePageYear4 (ActionEvent actionEvent) throws IOException{
        Stage stage = (Stage) buttonYear4.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("year4.fxml"));
        stage.setTitle("Regis");
        stage.setScene(new Scene(root,600,450));
        stage.show();
    }


}
