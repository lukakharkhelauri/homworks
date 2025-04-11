import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

import java.util.Random;

public class BrainTeaserController {

    Random random = new Random();

    @FXML
    private Button myButton;

    @FXML
    public void randomMove() {
        double maxX = 450;
        double maxY = 350;

        double randomX = random.nextDouble() * maxX;
        double randomY = random.nextDouble() * maxY;

        myButton.setLayoutX(randomX);
        myButton.setLayoutY(randomY);
    }

}
