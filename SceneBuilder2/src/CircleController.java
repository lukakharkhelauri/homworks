import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.Random;

public class CircleController {
    @FXML
    private Circle myGameCircle;
    @FXML
    private AnchorPane anchorPane;
    private final Random random = new Random();

    private final Color[] colors = {
            Color.RED,
            Color.GREEN,
            Color.SKYBLUE,
            Color.YELLOW
    };

    private int currentColorIndex = 0;


    public void up() {
        myGameCircle.setCenterY(myGameCircle.getCenterY()- 10);
    }

    public void down() {
        myGameCircle.setCenterY(myGameCircle.getCenterY() + 10);
    }

    public void left() {
        myGameCircle.setCenterX(myGameCircle.getCenterX() - 10);
    }

    public void right() {
        myGameCircle.setCenterX(myGameCircle.getCenterX() + 10);
    }

    public void diagonalDownRight() {
        myGameCircle.setCenterY(myGameCircle.getCenterY() + 10);
        myGameCircle.setCenterX(myGameCircle.getCenterX() + 10);
    }

    public void diagonalUpRight() {
        myGameCircle.setCenterY(myGameCircle.getCenterY() - 10);
        myGameCircle.setCenterX(myGameCircle.getCenterX() + 10);
    }

    public void diagonalDownLeft() {
        myGameCircle.setCenterY(myGameCircle.getCenterY() + 10);
        myGameCircle.setCenterX(myGameCircle.getCenterX() - 10);
    }

    public void diagonalUpLeft() {
        myGameCircle.setCenterY(myGameCircle.getCenterY() - 10);
        myGameCircle.setCenterX(myGameCircle.getCenterX() - 10);
    }

    public void changeColor() {
        myGameCircle.setFill(Color.RED);
    }

    @FXML
    private void changeOneByOneColor() {
        myGameCircle.setFill(colors[currentColorIndex]);
        currentColorIndex = (currentColorIndex + 1) % colors.length;
    }

    @FXML
    private void changeBackgroundColorToRandom() {
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        String rgbStyle = String.format("-fx-background-color: rgb(%d, %d, %d);", red, green, blue);
        anchorPane.setStyle(rgbStyle);
    }
}
