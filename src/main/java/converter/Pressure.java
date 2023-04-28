package converter;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class for pressure conversions
 */
public class Pressure extends Measurement {
    //Factors of different pressure conversions to Pascals.
    final private double hPa_TO_Pa = 100; //hectoPascals
    final private double kPa_TO_Pa = 1000; //kiloPascals
    final private double dbar_TO_Pa = 10000; //decibars
    final private double bar_TO_Pa = 100000; //bars
    final private double atm_TO_Pa = 101325; //standard atmosphere
    final private double Pa_TO_Pa = 1.0; //Pascals

    private double factor;

    //This constructor will be useful to get the right factors.
    public Pressure(String unit) {
        try {
            //We set the factor depending on the asked unit using the names
            //we defined at the beginning.
            Field field = this.getClass().getDeclaredField(unit + "_TO_Pa");
            factor = field.getDouble(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Unknown unit, try something else");
        }
    }

    /**
     * This method converts a value that is in the desired unit to Pascals.
     * @param value the value to convert
     * @return the value in Pascals
     */
    public double toPascals(double value){
        return value*factor;
    }

    /**
     * This method converts a value that is in Pascals to the desired unit.
     * @param value the value to convert
     * @return the value in the desired unit
     */
    public double fromPascals(double value){
        return value/factor;
    }

    /** This method prints the conversion of a value from one unit to another.
     * @param value the value to convert
     * @param fromUnit the unit of the value
     * @param toUnit the unit to convert to
     * @return the converted value
     */
    public static BigDecimal printConversion(double value, String fromUnit, String toUnit) {
        Pressure from = new Pressure(fromUnit);
        Pressure to = new Pressure(toUnit);

        double inPascals = from.toPascals(value);

        //We use BigDecimal and RoundingMode to avoid rounding errors.
        BigDecimal result = BigDecimal.valueOf(to.fromPascals(inPascals));
        int scale = 9;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        result = result.setScale(scale, roundingMode);

        System.out.println(value + fromUnit + " = " + result + toUnit);
        return result;
    }
}
