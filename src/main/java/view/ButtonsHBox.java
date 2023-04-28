package view;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.util.List;

/**
 * This class create an HBox with a list of buttons and apply a style class to each button.
 */
public class ButtonsHBox extends HBox {

    public ButtonsHBox(List<? extends Button> buttonList, String styleClass) {
        super();
        buttonList.forEach((btn) -> {
            getChildren().add(btn);
            if (styleClass != null)
                btn.getStyleClass().add(styleClass);
            btn.prefWidthProperty().bind(widthProperty().multiply(1. / buttonList.size()));
            btn.prefHeightProperty().bind(heightProperty());
        });
    }

    public ButtonsHBox(List<? extends Button> buttonList) {
        this(buttonList, null);
    }
}
