package view;

import calculator.ArithmeticType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

import java.util.List;
import java.util.stream.Stream;

/**
 * This class represents a button that allows the user to swap between arithmetic types.
 */
public class ArithmeticSelectorButton extends Button {

    private static final List<ArithmeticType> VALUES = Stream.of(ArithmeticType.values())
            .toList();
    private static ArithmeticSelectorButton instance;
    private int index;

    private ArithmeticSelectorButton() {
        super(VALUES.get(0).toString());
        index = 0;
        setOnAction(actionEvent -> swapArithmetic());
        MainApplication.getCalculator().setType(VALUES.get(index));
        setTooltip(new Tooltip(getText()));
    }

    /**
     * This method returns the unique instance of the ArithmeticSelectorButton.
     * @return the instance of the ArithmeticSelectorButton
     */
    public static ArithmeticSelectorButton getInstance() {
        if (instance == null) {
            instance = new ArithmeticSelectorButton();
        }
        return instance;
    }

    /**
     * This method swaps the arithmetic type of the calculator.
     */
    private void swapArithmetic() {
        index = (index + 1) % VALUES.size();
        setText(VALUES.get(index).toString());
        setTooltip(new Tooltip(getText()));
        MainApplication.getCalculator().setType(VALUES.get(index));
    }
}
