import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class CurrencyController implements Initializable {
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private ChoiceBox<String> choiceBox2;
    @FXML
    private Spinner<Integer> spinner;
    @FXML
    private Label label2;

    private String[] currencys={"Dollar", "Euro", "GEL", "Fount"};

    private final Map<String, Double> rates = new HashMap<>();

    int currentValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        rates.put("GEL", 1.0);
        rates.put("Dollar", 2.7);
        rates.put("Euro", 2.9);
        rates.put("Fount", 3.3);

        choiceBox.getItems().addAll(currencys);
        choiceBox2.getItems().addAll(currencys);
        choiceBox.setValue("GEL");
        choiceBox2.setValue("Dollar");


        SpinnerValueFactory<Integer> valueFactory1 =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 1000, 1);

        valueFactory1.setValue(1);
        spinner.setValueFactory(valueFactory1);
        currentValue = spinner.getValue();
        label2.setText(Integer.toString(currentValue));
        spinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> arg0, Integer oldVal, Integer newVal) {
                convert();
            }
        });

        choiceBox.setOnAction(e -> convert());
        choiceBox2.setOnAction(e -> convert());

        convert();
    }
    private void convert() {
        String from = choiceBox.getValue();
        String to = choiceBox2.getValue();
        int amount = spinner.getValue();

        if (from == null || to == null || !rates.containsKey(from) || !rates.containsKey(to)) {
            label2.setText("შეცდომა");
            return;
        }

        double result = amount * rates.get(from) / rates.get(to);
        label2.setText(String.format("შედეგი: %.2f %s", result, to));
    }
}
