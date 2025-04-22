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

        Parent currency = FXMLLoader.load(
                getClass().getResource("currency.fxml")
        );

        Scene scene = new Scene(currency);

        stage.setScene(scene);
        stage.show();
    }
}