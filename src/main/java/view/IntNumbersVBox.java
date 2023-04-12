package view;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class IntNumbersVBox extends CalculatorPart {
    private static IntNumbersVBox instance;

    private IntNumbersVBox(){
        getChildren().addAll(getGeneralHBox(new ArrayList<>(Arrays.asList("7","8","9"))),
                getGeneralHBox(new ArrayList<>(Arrays.asList("4","5","6"))),
                getGeneralHBox(new ArrayList<>(Arrays.asList("1","2","3"))),
                getGeneralHBox(new ArrayList<>(Arrays.asList("0"))));

                //getSevenToNineHBox(), getFourToSixHBox(), getOneToThreeHBox(), getZeroHBox());
    }





    //Create getInstance singleton
    public static IntNumbersVBox getInstance(){
        instance = instance == null ? new IntNumbersVBox() : instance;
        return instance;
    }


}
