import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.SKYBLUE);

        stage.setWidth(600);
        stage.setHeight(500);
        Image icon = new Image("img.png");
        Text text = new Text("გამარჯობა ეს არის აპლიკაცია");
        text.setX(225);
        text.setY(100);
        root.getChildren().add(text);


        //კვადრატი
        Rectangle rectangle = new Rectangle();
        rectangle.setX(150);
        rectangle.setY(120);
        rectangle.setWidth(70);
        rectangle.setHeight(70);
        rectangle.setFill(Color.GREEN);
        root.getChildren().add(rectangle);

        Line firstLine = new Line();
        firstLine.setStartX(150);
        firstLine.setStartY(120);
        firstLine.setEndX(220);
        firstLine.setEndY(190);
        firstLine.setStrokeWidth(2);
        firstLine.setStroke(Color.RED);
        root.getChildren().add(firstLine);

        Line secondLine = new Line();
        secondLine.setStartX(220);
        secondLine.setStartY(120);
        secondLine.setEndX(150);
        secondLine.setEndY(190);
        secondLine.setStrokeWidth(2);
        secondLine.setStroke(Color.RED);
        root.getChildren().add(secondLine);

        //4 ხაზით გაკეთებული მართკუთხედი
        Line topLine = new Line();
        topLine.setStartX(300);
        topLine.setStartY(150);
        topLine.setEndX(500);
        topLine.setEndY(150);
        topLine.setStrokeWidth(2);
        topLine.setStroke(Color.BLUE);
        root.getChildren().add(topLine);

        Line bottomLine = new Line();
        bottomLine.setStartX(300);
        bottomLine.setStartY(450);
        bottomLine.setEndX(500);
        bottomLine.setEndY(450);
        bottomLine.setStrokeWidth(2);
        bottomLine.setStroke(Color.BLUE);
        root.getChildren().add(bottomLine);

        Line leftLine = new Line();
        leftLine.setStartX(300);
        leftLine.setStartY(150);
        leftLine.setEndX(300);
        leftLine.setEndY(450);
        leftLine.setStrokeWidth(2);
        leftLine.setStroke(Color.BLUE);
        root.getChildren().add(leftLine);

        Line rightLine = new Line();
        rightLine.setStartX(500);
        rightLine.setStartY(150);
        rightLine.setEndX(500);
        rightLine.setEndY(450);
        rightLine.setStrokeWidth(2);
        rightLine.setStroke(Color.BLUE);
        root.getChildren().add(rightLine);

        Line diagonal = new Line();
        diagonal.setStartX(300);
        diagonal.setStartY(150);
        diagonal.setEndX(500);
        diagonal.setEndY(450);
        diagonal.setStrokeWidth(2);
        diagonal.setStroke(Color.YELLOW);
        root.getChildren().add(diagonal);

        //smile
        Circle face = new Circle();
        face.setCenterX(200);
        face.setCenterY(300);
        face.setRadius(50);
        face.setStrokeWidth(5);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.BLACK);
        root.getChildren().add(face);

        Circle leftEye = new Circle();
        leftEye.setCenterX(180);
        leftEye.setCenterY(280);
        leftEye.setRadius(5);
        leftEye.setFill(Color.BLACK);
        root.getChildren().add(leftEye);

        Circle rightEye = new Circle();
        rightEye.setCenterX(220);
        rightEye.setCenterY(280);
        rightEye.setRadius(5);
        rightEye.setFill(Color.BLACK);
        root.getChildren().add(rightEye);

        Line mouth = new Line();
        mouth.setStartX(180);
        mouth.setStartY(320);
        mouth.setEndX(220);
        mouth.setEndY(320);
        mouth.setStrokeWidth(5);
        mouth.setStroke(Color.BLACK);
        root.getChildren().add(mouth);

        stage.setScene(scene);
        stage.show();
    }
}