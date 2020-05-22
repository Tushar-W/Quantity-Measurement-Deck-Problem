/*******************************************************************************************
 * @Purpose: calculate quantity measurement
 * @author: Tushar W.
 * @date: 18-05-2020
 *******************************************************************************************/
package com.bl.model;

import com.bl.exception.QuantityMeasurementException;
import java.util.Objects;

public class Length {
    /**
     * declaring enum constatnts
     */
    public enum Units {
        FEET,INCH
    }
    /**
     * static constant variable
     */
    private static final int FEET_TO_INCH = 12;
    /**
     * value variable store the number entered by the user as the input
     * unit variable store the enum constanats
     */
    private final int value;
    private final Units unit;
    /**
     * Parameterized constructor to take one input value
     * @param value
     */
    public Length(Units unit, Integer value) throws QuantityMeasurementException {
        try{
            this.unit = unit;
            this.value = value;
        }catch (NullPointerException e) {
                throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "VALUES IS NULL");
        }
    }
    /**
     * This method comapre unit length of the current object with object of same or different type
     * @param that
     * @return true or false
     */
    public boolean compare(Length that) {
        if (this.unit.equals(Units.FEET) && that.unit.equals(Units.FEET))
            return Integer.compare(this.value, that.value) == 0;
        if (this.unit.equals(Units.INCH) && that.unit.equals(Units.INCH))
            return Integer.compare(this.value, that.value) == 0;
        if (this.unit.equals(Units.FEET) && that.unit.equals(Units.INCH))
            return Integer.compare(this.value*FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Units.INCH) && that.unit.equals(Units.FEET))
            return Integer.compare(this.value, that.value*FEET_TO_INCH) == 0;
        return false;
    }
    /**
     * This method compares the equality of the current object with the object of same type
     * @param that
     * @return true or false
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        if (value < 0 && length.value < 0)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE,
                                                          "VALUE_IS_NEGATIVE");
        return value == length.value &&
                unit == length.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
