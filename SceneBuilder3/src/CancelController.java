import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import java.util.Optional;

public class CancelController {
    private int clickCount = 0;

    @FXML
    private void quitButton() {
        clickCount++;
        if (clickCount == 5) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("დადასტურება");
            alert.setHeaderText("გსურთ აპლიკაციის გათიშვა?");
            alert.setContentText("დააჭირე OK გასათიშად ან Cancel გასაგრძელებლად");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                System.exit(0);
            } else {
                clickCount = 0;
            }
        }
    }
}
