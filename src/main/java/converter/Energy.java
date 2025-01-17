package converter;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class represents the Energy measurement.
 */
public class Energy extends Measurement {
    //Factors of different energy conversions to Joules.
    final private double cal_TO_J = 4.184; //calories
    final private double eV_TO_J = 1.60218e-19; //electronvolt
    final private double kWh_TO_J = 3.6e6; //kiloWatt.h
    final private double PET_TO_J = 4.1868e10; //Petroleum equivalent tonnes
    final private double J_TO_J = 1.0; //Joules

    private double factor;

    //This constructor will be useful to get the right factors.
    public Energy(String unit) {
        try {
            //We set the factor depending on the asked unit using the names
            //we defined at the beginning.
            Field field = this.getClass().getDeclaredField(unit + "_TO_J");
            factor = field.getDouble(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Unknown unit, try something else");
        }
    }

    /**
     * This method converts a value that is in the desired unit to Joules.
     * @param value The value to be converted
     * @return The value in Joules
     */
    public double toJoules(double value){
        return value*factor;
    }

    /**
     * This method converts a value that is in Joules to the desired unit.
     * @param value The value to be converted
     * @return The value in the desired unit
     */
    public double fromJoules(double value){
        return value/factor;
    }

    /**
     * This method prints the conversion of a value from one unit to another.
     * @param value The value to be converted
     * @param fromUnit The unit of the value
     * @param toUnit The unit to which the value will be converted
     * @return The value in the desired unit
     */
    public static BigDecimal printConversion(double value, String fromUnit, String toUnit) {
        Energy from = new Energy(fromUnit);
        Energy to = new Energy(toUnit);

        double inJoules = from.toJoules(value);

        //We use BigDecimal and RoundingMode to avoid rounding errors.
        BigDecimal result = BigDecimal.valueOf(to.fromJoules(inJoules));
        int scale = 9;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        result = result.setScale(scale, roundingMode);

        return result;
    }
}
