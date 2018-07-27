package exercise;

import interfaceProgram.EffectShadow;
import interfaceProgram.RootExercises;
import interfaceProgram.RootWindows;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;

public class Exercises implements RootWindows
{
    private RootExercises rootExercises = new RootExercises();


    // Получим окно с заданиями
    public void getExercises(){
        addRootPaneExercises();
    }

    private void addRootPaneExercises(){

        // Меню Present Simple
        rootExercises.getMenuPresentSimple().setEffect(EffectShadow.getShadow());
        rootExercises.getMenuPresentSimple().setStyle(rootExercises.getStyleMouseReleased());
        rootExercises.getMenuPresentSimple().setOnMousePressed(event ->
                rootExercises.getMenuPresentSimple().setStyle(rootExercises.getStyleOnMousePressed())
        );
        rootExercises.getMenuPresentSimple().setOnMouseReleased(event ->
                rootExercises.getMenuPresentSimple().setStyle(rootExercises.getStyleMouseReleased()));
        rootExercises.getMenuPresentSimple().setOnAction(event -> {
            clear();
            rootExercises.getRectangle().setX(WIDTH_SIZE/5.5);
            rootExercises.getRectangle().setY(HEIGHT_SIZE/4);
            rootExercises.getContMenuPS().getChildren().addAll(rootExercises.getAppPS(), rootExercises.getNegPS(),
                    rootExercises.getQuesPS());
            addRectangle();
        });

        // Утверждения PS
        rootExercises.getAppPS().setStyle(rootExercises.getStylePS());
        rootExercises.getAppPS().setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        rootExercises.getAppPS().setOnAction(event -> {
            clear();
            System.out.println("тут будет окно утверждений");
        });

        // Отрицания PS
        rootExercises.getNegPS().setStyle(rootExercises.getStylePS());
        rootExercises.getNegPS().setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        rootExercises.getNegPS().setOnAction(event -> {
            clear();
            System.out.println("тут будет окно отрицаний");
        });

        // Вопросы PS
        rootExercises.getQuesPS().setStyle(rootExercises.getStylePS());
        rootExercises.getQuesPS().setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        rootExercises.getQuesPS().setOnAction(event -> {
            clear();
            System.out.println("тут будет окно вопросов");
        });

        // Меню to be
        rootExercises.getMenuFormToBe().setEffect(EffectShadow.getShadow());
        rootExercises.getMenuFormToBe().setStyle(rootExercises.getStyleMouseReleased());
        rootExercises.getMenuFormToBe().setOnMousePressed(event ->
                rootExercises.getMenuFormToBe().setStyle(rootExercises.getStyleOnMousePressed())
        );
        rootExercises.getMenuFormToBe().setOnMouseReleased(event ->
                rootExercises.getMenuFormToBe().setStyle(rootExercises.getStyleMouseReleased()));
        rootExercises.getMenuFormToBe().setOnAction(event -> {
            clear();
            rootExercises.getRectangle().setX(WIDTH_SIZE/5.5);
            rootExercises.getRectangle().setY(HEIGHT_SIZE/3.3);
            rootExercises.getContMenuToBe().getChildren().addAll(rootExercises.getAppToBe(), rootExercises.getNegToBe(),
                    rootExercises.getQuesToBe());
            addRectangle();
        });

        // Утверждения tobe
        rootExercises.getAppToBe().setStyle(rootExercises.getStylePS());
        rootExercises.getAppToBe().setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        rootExercises.getAppToBe().setOnAction(event -> {
            clear();
            System.out.println("тут будет окно утверждений");
        });
        // Отрицания tobe
        rootExercises.getNegToBe().setStyle(rootExercises.getStylePS());
        rootExercises.getNegToBe().setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        rootExercises.getNegToBe().setOnAction(event -> {
            clear();
            System.out.println("тут будет окно отрицаний");
        });
        // Вопросы tobe
        rootExercises.getQuesToBe().setStyle(rootExercises.getStylePS());
        rootExercises.getQuesToBe().setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        rootExercises.getQuesToBe().setOnAction(event -> {
            clear();
            System.out.println("тут будет окно вопросов");
        });

        // Разделитель
        rootExercises.getSeparatorExercises().setLayoutX(WIDTH_SIZE/4);
        rootExercises.getSeparatorExercises().setLayoutY(HEIGHT_SIZE/7);
        rootExercises.getSeparatorExercises().setPrefHeight(HEIGHT_SIZE/1.4);

        // Объединение меню в одну панель
        rootExercises.getGroupSplit().setLayoutX(WIDTH_SIZE/15);
        rootExercises.getGroupSplit().setLayoutY(HEIGHT_SIZE/5);
        rootExercises.getGroupSplit().setSpacing(20);
        rootExercises.getGroupSplit().setAlignment(Pos.CENTER_LEFT);
        rootExercises.getGroupSplit().setMaxHeight(HEIGHT_SIZE/7);
//        rootExercises.getGroupSplit().setStyle("-fx-border-color: RED");
        rootExercises.getGroupSplit().getChildren().addAll(rootExercises.getMenuPresentSimple(),
                rootExercises.getMenuFormToBe());

        ROOT_PANE.getChildren().addAll(rootExercises.getGroupSplit(), rootExercises.getSeparatorExercises());
    }

    // Добавляем прямоугольник
    private void addRectangle(){
        rootExercises.getRectangle().setWidth(WIDTH_SIZE/8);
        rootExercises.getRectangle().setHeight(HEIGHT_SIZE/5);
        rootExercises.getRectangle().setArcHeight(20);
        rootExercises.getRectangle().setArcWidth(20);
        rootExercises.getRectangle().setStroke(Color.GREEN);
        rootExercises.getRectangle().setEffect(EffectShadow.getShadow());
        rootExercises.getRectangle().setFill(Color.rgb(255, 200, 100, 0.7));

        rootExercises.getContMenuPS().setSpacing(10);
        rootExercises.getContMenuPS().setAlignment(Pos.CENTER);
        rootExercises.getContMenuPS().setLayoutX(WIDTH_SIZE/5.2);
        rootExercises.getContMenuPS().setLayoutY(HEIGHT_SIZE/3.8);

        rootExercises.getContMenuToBe().setSpacing(10);
        rootExercises.getContMenuToBe().setAlignment(Pos.CENTER);
        rootExercises.getContMenuToBe().setLayoutX(WIDTH_SIZE/5.2);
        rootExercises.getContMenuToBe().setLayoutY(HEIGHT_SIZE/3.15);

        ROOT_PANE.getChildren().addAll(rootExercises.getRectangle(), rootExercises.getContMenuPS(),
                rootExercises.getContMenuToBe());
    }

    private void clear(){
        rootExercises.getContMenuPS().getChildren().clear();
        rootExercises.getContMenuToBe().getChildren().clear();
        ROOT_PANE.getChildren().removeAll(rootExercises.getRectangle(), rootExercises.getContMenuPS(),
                rootExercises.getContMenuToBe());
    }
}
