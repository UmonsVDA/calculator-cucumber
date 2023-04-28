package view;

import javafx.scene.control.Label;

/**
 * This class is used to display the result of the expression entered by the user.
 */
public class ResultLabel extends Label {

    private static ResultLabel instance;

    private ResultLabel() {
        setPrefWidth(Integer.MAX_VALUE);
        getStyleClass().add("result-label");
    }

    /**
     * This method returns the unique instance of the ResultLabel.
     *
     * @return The unique instance of the ResultLabel.
     */
    public static ResultLabel getInstance() {
        if (instance == null)
            instance = new ResultLabel();
        return instance;
    }

}