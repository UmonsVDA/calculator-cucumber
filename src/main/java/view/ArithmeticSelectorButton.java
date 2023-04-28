package view;

import calculator.ArithmeticType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

import java.util.List;
import java.util.stream.Stream;

public class ArithmeticSelectorButton extends Button {

    private static final List<ArithmeticType> VALUES = Stream.of(ArithmeticType.values())
            .toList();
    private static ArithmeticSelectorButton instance;
    private int index;

    private final Tooltip tooltip;

    private ArithmeticSelectorButton() {
        super(VALUES.get(0).toString());
        index = 0;
        setOnAction(actionEvent -> swapArithmetic());
        MainApplication.getCalculator().setType(VALUES.get(index));
        tooltip = new Tooltip();
        tooltip.setText(getText());
        setTooltip(tooltip);
    }

    public static ArithmeticSelectorButton getInstance() {
        if (instance == null) {
            instance = new ArithmeticSelectorButton();
        }
        return instance;
    }

    private void swapArithmetic() {
        index = (index + 1) % VALUES.size();
        setText(VALUES.get(index).toString());
        tooltip.setText(getText());
        MainApplication.getCalculator().setType(VALUES.get(index));
    }
}
