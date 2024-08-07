package com.app.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import com.app.Model.Model;

public class IntroductionController {

    @FXML
    public Button backBtn;
    
    public void onCourse() {
        Model.getInstance().getViewFactory().getSelectedMenuItem().set("course");
    }

    public void onAssignment() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Assignment");
        alert.setHeaderText("Masuk halaman assignment");
        alert.setContentText("Anda tidak bisa mengakses halaman lain sebelum menyelesaikan assignment");
        alert.showAndWait();

        if (alert.getResult().getText().equals("OK")) {
            Stage stage = (Stage) backBtn.getScene().getWindow();
            Model.getInstance().getAccount().setProgress(0.5);
            Model.getInstance().getViewFactory().removeStage(stage);
            Model.getInstance().getViewFactory().showAssignmentWindow();
        }
    }
}
