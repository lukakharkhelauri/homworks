import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

//        Parent root = FXMLLoader.load(
//                getClass().getResource("radio.fxml")
//        );
//
//        Scene scene = new Scene(root);

//        Parent gallery = FXMLLoader.load(
//                getClass().getResource("image/gallery.fxml")
//        );
//
//        Scene scene = new Scene(gallery);

        Parent birthday = FXMLLoader.load(
                getClass().getResource("birthday.fxml")
        );

        Scene scene = new Scene(birthday);

        stage.setScene(scene);
        stage.show();
    }
}