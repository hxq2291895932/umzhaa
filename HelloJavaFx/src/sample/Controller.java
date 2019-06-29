package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    private boolean check = true;
    public Button login;
    public Button sign;
    public TextField myTextField;
    public Label error;

    public void setVisible(ActionEvent event) {
        check = !check;
        login.setDisable(check);
        sign.setDisable(check);
    }

    public void sign(ActionEvent actionEvent) {
        error.setVisible(true);
    }

    public void login(ActionEvent actionEvent) {
        error.setVisible(true);
    }
}
