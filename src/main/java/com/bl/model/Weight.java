/*******************************************************************************************
 * @Purpose: calculate weight in quantity measurement
 * @author: Tushar W.
 * @date: 19-05-2020
 *******************************************************************************************/
package com.bl.model;

import com.bl.enums.Unit;
import com.bl.exception.QuantityMeasurementException;

import java.util.Objects;

public class Weight {
    /**
     * value variable store the number entered by the user as the input
     * unit variable store the enum constants
     */
    public final double value;
    public Unit unit;
    /**
     * Parameterized constructor to take one input value
     * @param unit, value
     */
    public Weight(Unit unit, Double value) throws QuantityMeasurementException {
        try{
            this.unit = unit;
            this.value = value;
        }catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "VALUES IS NULL");
        }
    }
    /**
     * This method comapre unit weight of the current object with object of same or different type
     * @param that
     * @return true or false
     */
    public boolean compare(Weight that) {
        return  unit.compareWeight(this,that);
    }
    /**
     * This method add value of unit weight of the two objects
     * @param that
     * @return addition
     */
    public double add(Weight that) {
        return unit.addWeight(this,that);
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
        Weight weight = (Weight) that;
        if (value < 0 && weight.value < 0)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE,
                    "VALUE_IS_NEGATIVE");
        return Double.compare(weight.value, value) == 0 &&
                unit == weight.unit;
    }
}
