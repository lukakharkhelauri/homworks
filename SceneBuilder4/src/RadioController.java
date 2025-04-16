import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class RadioController {
    @FXML
    private Label label;
    @FXML
    private RadioButton choiceA, choiceB, choiceC, choiceD;
    @FXML
    private TextField textField;
    @FXML
    private Button button;

    private String selectedAnimal = "";

    @FXML
    private void handleButtonClick() {
        String input = textField.getText();
        label.setText(selectedAnimal + " named " + input);
    }

    @FXML
    private void pick() {
        if (choiceA.isSelected()) {
            selectedAnimal = choiceA.getText();
        } else if (choiceB.isSelected()) {
            selectedAnimal = choiceB.getText();
        } else if (choiceC.isSelected()) {
            selectedAnimal = choiceC.getText();
        } else if (choiceD.isSelected()) {
            selectedAnimal = choiceD.getText();
        } else {
            selectedAnimal = "Select animal";
        }
    }
}
