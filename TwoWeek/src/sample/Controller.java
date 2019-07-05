package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.List;

public class Controller {
    public TableColumn id;
    public TableColumn name;
    @FXML
    private TableView table;



    private void initialize() throws IOException {
    }

    public void show() throws IOException {
        ObservableList<User> list = FXCollections.observableArrayList();

        Mybatis ms = new Mybatis();
        List<User> user = ms.findAll();
        while (!user.isEmpty()) {
            User temp = user.get(0);
            user.remove(0);
            System.out.println(temp.getId() + temp.getName());
            list.add(temp);
        }

        id.setCellValueFactory(new PropertyValueFactory("id"));
        name.setCellValueFactory(new PropertyValueFactory("name"));
        table.setItems(list);

    }
}
