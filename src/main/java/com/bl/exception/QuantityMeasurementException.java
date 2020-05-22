package com.bl.exception;

public class QuantityMeasurementException extends RuntimeException {
    /**
     * object of enum class ExceptionType
     */
    public ExceptionType type;
    /**
     * enum for take constants Exception Types
     */
    public enum ExceptionType{
        NEGATIVE_VALUE, NULL_VALUE
    }
    /**
     * constructor to take two input values
     * @param type
     * @param message
     */
    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
