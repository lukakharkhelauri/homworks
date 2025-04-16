package image;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GalleryController {
    @FXML
    private ImageView imageView;

    private final Image[] images = {
            new Image(getClass().getResourceAsStream("/image/american-football.png")),
            new Image(getClass().getResourceAsStream("/image/golf.png")),
            new Image(getClass().getResourceAsStream("/image/bowling-pin.png")),
            new Image(getClass().getResourceAsStream("/image/ping-pong.png")),
            new Image(getClass().getResourceAsStream("/image/basketball.png")),
            new Image(getClass().getResourceAsStream("/image/basketball-rim.png")),
            new Image(getClass().getResourceAsStream("/image/basketball-court.png")),
            new Image(getClass().getResourceAsStream("/image/scoreboard.png")),
            new Image(getClass().getResourceAsStream("/image/trophy.png")),
    };
    private int pointer;

    public void next(ActionEvent event) {
        imageView.setImage(getNextImage());
    }

    public void previous(ActionEvent event) {
        imageView.setImage(getPreviousImage());
    }

    private Image getPreviousImage() {
        if (pointer > 0) {
            pointer--;
        }
        return images[pointer];
    }

    public Image getNextImage() {
        if (pointer < images.length - 1) {
            pointer++;
        }
        return images[pointer];
    }
}
