package converter;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class represents the Area measurement.
 */
public class Area extends Measurement {
    //Factors of different Area conversions to meters.
    final private double mm2_TO_m2 = 1e-6; //mm²
    final private double cm2_TO_m2 = 0.0001; //cm²
    final private double dm2_TO_m2 = 0.01; //dm²
    final private double dam2_TO_m2 = 100; //dam²
    final private double hm2_TO_m2 = 10000; //hm²
    final private double km2_TO_m2 = 1e6; //km²
    final private double m2_TO_m2 = 1.0; //m²

    private double factor;

    //This constructor will be useful to get the right factors.
    public Area(String unit) throws Exception {
        try {
            //We set the factor depending on the asked unit using the names
            //we defined at the beginning.
            Field field = this.getClass().getDeclaredField(unit + "_TO_m2");
            factor = field.getDouble(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new Exception("Unknown unit, try something else");
        }
    }

    /**
     * This method converts a value that is in the desired unit to square meters.
     * @param value The value to be converted
     * @return The value in square meters
     */
    public double toSquareMeters(double value){
        return value*factor;
    }

    /**
     * This method converts a value that is in square meters to the desired unit.
     * @param value The value to be converted
     * @return The value in the desired unit
     */
    public double fromSquareMeters(double value){
        return value/factor;
    }

    /**
     * This method prints the conversion of a value from one unit to another.
     * @param value The value to be converted
     * @param fromUnit The unit of the value
     * @param toUnit The unit to which the value will be converted
     * @return The value in the desired unit
     */
    public static BigDecimal printConversion(double value, String fromUnit, String toUnit) throws Exception {
        Area from = new Area(fromUnit);
        Area to = new Area(toUnit);

        double inSquareMeters = from.toSquareMeters(value);

        //We use BigDecimal and RoundingMode to avoid rounding errors.
        BigDecimal result = BigDecimal.valueOf(to.fromSquareMeters(inSquareMeters));
        int scale = 9;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        result = result.setScale(scale, roundingMode);

        return result;
    }
}
