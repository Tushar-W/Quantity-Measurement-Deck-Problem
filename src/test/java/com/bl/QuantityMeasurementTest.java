package com.bl;

import com.bl.exception.QuantityMeasurementException;
import com.bl.model.Feet;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeets_WhenBothFeetAreEquals_ShouldReturnTrue() throws QuantityMeasurementException {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        boolean equals = feet1.equals(feet2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenTwoFeets_WhenBothFeetAreNotEquals_ShouldReturnFalse() throws QuantityMeasurementException {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(2);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenFeets_WhenFeetsAreNull_ShouldReturnThrowException() {
        try {
            Feet feet1 = new Feet(null);
            Feet feet2 = new Feet(null);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenFeets_WhenReferenceOfFeetsAreEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(2);
        Assert.assertTrue(feet1.equals(feet1));
    }
}
