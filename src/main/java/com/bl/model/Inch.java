package com.bl.model;

import com.bl.exception.QuantityMeasurementException;

import java.util.Objects;

public class Inch {
    /**
     * value variable store the number entered by the user as the input
     */
    private final int value;
    /**
     * Parameterized constructor to take one input value
     * @param value
     */
    public Inch(Integer value) {
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
        Inch inch = (Inch) obj;
        return value == inch.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
