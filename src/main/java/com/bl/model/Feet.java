/*******************************************************************************************
 * @Purpose: calculate quantity measurement
 * @author: Tushar W.
 * @date: 18-05-2020
 *******************************************************************************************/
package com.bl.model;

import com.bl.exception.QuantityMeasurementException;

public class Feet {
    /**
     * value variable store the number entered by the user as the input
     */
    private final double value;
    /**
     * Parameterized constructor to take one input value
     * @param value
     */
    public Feet(Integer value) throws QuantityMeasurementException {
        try{
            this.value = value;
        }catch (NullPointerException e) {
                throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "VALUES IS NULL");
        }
    }
    /**
     * This method compares the equality of the current object with the object of same type
     * @param obj
     * @return true or false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Feet feet = (Feet) obj;
        return Double.compare(feet.value, value) == 0;
    }
}
