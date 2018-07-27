package interfaceProgram;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class RootExercises
{
    private VBox groupSplit = new VBox();
    private VBox contMenuPS = new VBox();
    private VBox contMenuToBe = new VBox();
    private Separator SeparatorExercises = new Separator(Orientation.VERTICAL);

    private Button menuPresentSimple = new Button("Present Simple");
    private Button appPS = new Button("Утверждения");
    private Button negPS = new Button("Отрицания");
    private Button quesPS = new Button("Вопросы");

    private Button menuFormToBe = new Button("Form 'to be'");
    private Button appToBe= new Button("Утверждения");
    private Button negToBe = new Button("Отрицания");
    private Button quesToBe = new Button("Вопросы");

    private String styleMouseReleased = "-fx-color: #ffcc99; -fx-font: bold italic 12pt Georgia; " +
            "-fx-border-color: linear-gradient(#ffcc99, #ffcc00);";
    private String styleOnMousePressed = "-fx-color: #ff9900; -fx-font: bold italic 12pt Georgia; " +
            "-fx-border-color: linear-gradient(#ffcc99, #ffcc00);";
    private String stylePS = "-fx-color: #ffcc99; -fx-font: bold italic 10pt Georgia; " +
            "-fx-background-color: linear-gradient(#ffcc99, #ffcc00);";

    private Rectangle rectangle = new Rectangle();

    public VBox getContMenuPS() {
        return contMenuPS;
    }

    public VBox getContMenuToBe() {
        return contMenuToBe;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public VBox getGroupSplit() {
        return groupSplit;
    }

    public Separator getSeparatorExercises() {
        return SeparatorExercises;
    }

    public Button getMenuPresentSimple() {
        return menuPresentSimple;
    }

    public Button getMenuFormToBe() {
        return menuFormToBe;
    }

    public Button getAppPS() {
        return appPS;
    }

    public Button getNegPS() {
        return negPS;
    }

    public Button getQuesPS() {
        return quesPS;
    }

    public Button getAppToBe() {
        return appToBe;
    }

    public Button getNegToBe() {
        return negToBe;
    }

    public Button getQuesToBe() {
        return quesToBe;
    }

    public String getStyleMouseReleased() {
        return styleMouseReleased;
    }

    public String getStyleOnMousePressed() {
        return styleOnMousePressed;
    }

    public String getStylePS() {
        return stylePS;
    }
}
