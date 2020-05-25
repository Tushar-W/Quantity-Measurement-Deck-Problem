/*******************************************************************************************
 * @Purpose: calculate tempereture in quantity measurement
 * @author: Tushar W.
 * @date: 19-05-2020
 *******************************************************************************************/
package com.bl.model;

import com.bl.enums.Unit;
import com.bl.exception.QuantityMeasurementException;

public class Temperature {
    /**
     * value variable store the number entered by the user as the input
     * unit variable store the enum constants
     */
    public final int value;
    public Unit unit;
    /**
     * Parameterized constructor to take one input value
     * @param unit, value
     */
    public Temperature(Unit unit, Integer value) throws QuantityMeasurementException {
        try{
            this.unit = unit;
            this.value = value;
        }catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "VALUES IS NULL");
        }
    }
    /**
     * This method equate unit Temperature of the current object with object of same or different type
     * @param that
     * @return true or false
     */
    public boolean equate(Temperature that) {
        return  unit.equate(this,that);
    }
    /**
     * This method check the equality of the current object with the object of same type
     * @param that
     * @return true or false
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Temperature temperature = (Temperature) that;
        if (value < 0 && temperature.value < 0)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE,
                    "VALUE_IS_NEGATIVE");
        return value == ((Temperature) that).value &&
                unit == ((Temperature) that).unit;
    }
}
