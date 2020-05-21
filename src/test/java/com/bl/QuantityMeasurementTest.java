package com.bl;

import com.bl.exception.QuantityMeasurementException;
import com.bl.model.Feet;
import com.bl.model.Inch;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeets_WhenBothFeetAreEquals_ShouldReturnTrue() {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        boolean equals = feet1.equals(feet2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenTwoFeets_WhenBothFeetAreNotEquals_ShouldReturnFalse() {
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

    @Test
    public void givenFeets_WhenTypeOfFeetsAreEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        Assert.assertTrue(feet1.equals(feet2));
    }

    @Test
    public void givenFeets_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(3);
        Feet feet2 = new Feet(3);
        Assert.assertTrue(feet1.equals(feet2));
    }

    @Test
    public void givenTwoInch_WhenBothInchAreEquals_ShouldReturnTrue() {
        Inch inch = new Inch(0);
        Inch inch2 = new Inch(0);
        Assert.assertTrue(inch.equals(inch2));
    }

    @Test
    public void givenInches_WhenBothInchesAreNotEquals_ShouldReturnFalse() {
        Inch inch = new Inch(0);
        Inch inch2 = new Inch(2);
        Assert.assertFalse(inch.equals(inch2));
    }

    @Test
    public void givenInches_WhenInchesAreNull_ShouldReturnThrowException() {
        try {
            Inch inch = new Inch(null);
            Inch inch2 = new Inch(null);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenInches_WhenReferenceOfInchesAreEqual_ShouldReturnTrue() {
        Inch inch = new Inch(2);
        Assert.assertTrue(inch.equals(inch));
    }

}
