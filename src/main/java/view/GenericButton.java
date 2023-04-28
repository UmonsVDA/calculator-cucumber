package view;

import javafx.scene.control.Button;

/**
 * This class is used to create a generic button. This button will update the ExpressionTextField when clicked.
 */
public class GenericButton extends Button {
    public GenericButton(String text) {
        super(text);
        setOnAction(actionEvent -> ExpressionTextField.getInstance().updateText(getText()));
    }
}
