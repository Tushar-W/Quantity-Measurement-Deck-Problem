/*******************************************************************************************
 * @Purpose: calculate Volume in quantity measurement
 * @author: Tushar W.
 * @date: 18-05-2020
 *******************************************************************************************/
package com.bl.model;

import com.bl.enums.Unit;
import com.bl.exception.QuantityMeasurementException;

import java.util.Objects;

public class Volume {
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
    public Volume(Unit unit, Double value) throws QuantityMeasurementException {
        try{
            this.unit = unit;
            this.value = value;
        }catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "VALUES IS NULL");
        }
    }
    /**
     * This method comapre unit volume of the current object with object of same or different type
     * @param that
     * @return true or false
     */
    public boolean compare(Volume that) {
        return  unit.compareVolume(this,that);
    }
    /**
     * This method add value of unit volume of the two objects
     * @param that
     * @return addition
     */
    public double add(Volume that) {
        return unit.addVolumes(this,that);
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
        Volume volume = (Volume) that;
        if (value < 0 && volume.value < 0)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE,
                    "VALUE_IS_NEGATIVE");
        return Double.compare(volume.value, value) == 0 &&
                unit == volume.unit;
    }
}
