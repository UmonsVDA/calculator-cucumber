package converter;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class represents the Length measurement.
 */
public class Length extends Measurement {
    //Factors of different length conversions to meters.
    final private double mm_TO_m = 0.001; //millimeters
    final private double cm_TO_m = 0.01; //centimeters
    final private double dm_TO_m = 0.1; //decimeters
    final private double dam_TO_m = 10; //dekameters
    final private double hm_TO_m = 100; //hectometers
    final private double km_TO_m = 1000; //kilometers
    final private double in_TO_m = 0.0254; //inches
    final private double mi_TO_m = 1609.344; //miles
    final private double yd_TO_m = 0.9144; //yards
    final private double NM_TO_m = 1852; //nautical miles
    final private double ft_TO_m = 0.3048; //feet
    final private double m_TO_m = 1.0; //meters

    private double factor;

    //This constructor will be useful to get the right factors.
    public Length(String unit) {
        try {
            //We set the factor depending on the asked unit using the names
            //we defined at the beginning.
            Field field = this.getClass().getDeclaredField(unit + "_TO_m");
            factor = field.getDouble(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Unknown unit, try something else");
        }
    }

    /**
     * This method converts a value that is in the desired unit to meters.
     * @param value The value to be converted
     * @return The value in meters
     */
    public double toMeters(double value){
        return value*factor;
    }

    /**
     * This method converts a value that is in meters to the desired unit.
     * @param value The value to be converted
     * @return The value in the desired unit
     */
    public double fromMeters(double value){
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
        Length from = new Length(fromUnit);
        Length to = new Length(toUnit);

        double inMeters = from.toMeters(value);

        //We use BigDecimal and RoundingMode to avoid rounding errors.
        BigDecimal result = BigDecimal.valueOf(to.fromMeters(inMeters));
        int scale = 9;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        result = result.setScale(scale, roundingMode);

        return result;
    }
}
