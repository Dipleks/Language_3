package menu;

import interfaceProgram.ClockDisplay;
import interfaceProgram.RootExercises;
import interfaceProgram.RootWindows;

public class ClearDisplay implements RootWindows
{
    // Полная зачистка главного окна:
    public static void clearMethod() {
        ROOT_PANE.getChildren().clear();
        ClockDisplay.clock();
    }

}
