 package com.bl;

import com.bl.exception.QuantityMeasurementException;
import com.bl.model.Length;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeets_WhenBothFeetAreEquals_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Units.FEET, 0);
        Length feet2 = new Length(Length.Units.FEET, 0);
        boolean equals = feet1.equals(feet2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenTwoFeets_WhenBothFeetAreNotEquals_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Units.FEET, 0);
        Length feet2 = new Length(Length.Units.FEET, 2);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenTwoFeets_WhenFeetAreNegative_ShouldReturnThrowException() {
        try{
            Length feet1 = new Length(Length.Units.FEET, -1);
            Length feet2 = new Length(Length.Units.FEET, -2);
            boolean equals = feet1.equals(feet2);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenFeets_WhenFeetsAreNull_ShouldReturnThrowException() {
        try {
            Length feet1 = new Length(Length.Units.FEET, null);
            Length feet2 = new Length(Length.Units.FEET, null);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenFeets_WhenReferenceOfFeetsAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Units.FEET, 2);
        Assert.assertTrue(feet1.equals(feet1));
    }

    @Test
    public void givenFeets_WhenTypeOfFeetsAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Units.FEET, 0);
        Length feet2 = new Length(Length.Units.FEET, 0);
        Assert.assertTrue(feet1.equals(feet2));
    }

    @Test
    public void givenFeets_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Units.FEET, 3);
        Length feet2 = new Length(Length.Units.FEET, 3);
        Assert.assertTrue(feet1.equals(feet2));
    }

    @Test
    public void givenTwoInch_WhenBothInchAreEquals_ShouldReturnTrue() {
        Length inch = new Length(Length.Units.INCH, 0);
        Length inch2 = new Length(Length.Units.INCH, 0);
        Assert.assertTrue(inch.equals(inch2));
    }

    @Test
    public void givenInches_WhenBothInchesAreNotEquals_ShouldReturnFalse() {
        Length inch = new Length(Length.Units.INCH, 0);
        Length inch2 = new Length(Length.Units.INCH, 2);
        Assert.assertFalse(inch.equals(inch2));
    }

    @Test
    public void givenTwoInches_WhenInchesAreNegative_ShouldReturnThrowException() {
        try{
            Length inch1 = new Length(Length.Units.INCH, -1);
            Length inch2 = new Length(Length.Units.INCH, -2);
            boolean equals = inch1.equals(inch2);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenInches_WhenInchesAreNull_ShouldReturnThrowException() {
        try {
            Length inch = new Length(Length.Units.INCH, null);
            Length inch2 = new Length(Length.Units.INCH, null);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenInches_WhenReferenceOfInchesAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Length.Units.INCH, 2);
        Assert.assertTrue(inch.equals(inch));
    }

    @Test
    public void givenInches_WhenTypeOfInchesAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Length.Units.INCH, 0);
        Length inch2 = new Length(Length.Units.INCH, 0);
        Assert.assertTrue(inch.equals(inch2));
    }

    @Test
    public void givenInches_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Length.Units.INCH, 2);
        Length inch2 = new Length(Length.Units.INCH, 2);
        Assert.assertTrue(inch.equals(inch2));
    }

    @Test
    public void givenFeetAndInch_WhenBothAreEquals_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Units.FEET, 1);
        Length inch1 = new Length(Length.Units.INCH, 1);
        boolean equals = feet1.equals(inch1);
        Assert.assertFalse(equals);
    }
}
