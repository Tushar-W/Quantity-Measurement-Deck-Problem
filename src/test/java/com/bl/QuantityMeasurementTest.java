 package com.bl;

import com.bl.enums.Unit;
import com.bl.exception.QuantityMeasurementException;
import com.bl.model.Length;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeets_WhenBothFeetAreEquals_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 0);
        Length feet2 = new Length(Unit.FEET, 0);
        boolean equals = feet1.equals(feet2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenTwoFeets_WhenBothFeetAreNotEquals_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 0);
        Length feet2 = new Length(Unit.FEET, 2);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenTwoFeets_WhenFeetAreNegative_ShouldReturnThrowException() {
        try{
            Length feet1 = new Length(Unit.FEET, -1);
            Length feet2 = new Length(Unit.FEET, -2);
            boolean equals = feet1.equals(feet2);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenFeets_WhenFeetsAreNull_ShouldReturnThrowException() {
        try {
            Length feet1 = new Length(Unit.FEET, null);
            Length feet2 = new Length(Unit.FEET, null);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenFeets_WhenReferenceOfFeetsAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 2);
        Assert.assertTrue(feet1.equals(feet1));
    }

    @Test
    public void givenFeets_WhenTypeOfFeetsAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 0);
        Length feet2 = new Length(Unit.FEET, 0);
        Assert.assertTrue(feet1.equals(feet2));
    }

    @Test
    public void givenFeets_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 3);
        Length feet2 = new Length(Unit.FEET, 3);
        Assert.assertTrue(feet1.equals(feet2));
    }

    @Test
    public void givenTwoInch_WhenBothInchAreEquals_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 0);
        Length inch2 = new Length(Unit.INCH, 0);
        Assert.assertTrue(inch.equals(inch2));
    }

    @Test
    public void givenInches_WhenBothInchesAreNotEquals_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH, 0);
        Length inch2 = new Length(Unit.INCH, 2);
        Assert.assertFalse(inch.equals(inch2));
    }

    @Test
    public void givenTwoInches_WhenInchesAreNegative_ShouldReturnThrowException() {
        try{
            Length inch1 = new Length(Unit.INCH, -1);
            Length inch2 = new Length(Unit.INCH, -2);
            boolean equals = inch1.equals(inch2);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenInches_WhenInchesAreNull_ShouldReturnThrowException() {
        try {
            Length inch = new Length(Unit.INCH, null);
            Length inch2 = new Length(Unit.INCH, null);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenInches_WhenReferenceOfInchesAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 2);
        Assert.assertTrue(inch.equals(inch));
    }

    @Test
    public void givenInches_WhenTypeOfInchesAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 0);
        Length inch2 = new Length(Unit.INCH, 0);
        Assert.assertTrue(inch.equals(inch2));
    }

    @Test
    public void givenInches_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 2);
        Length inch2 = new Length(Unit.INCH, 2);
        Assert.assertTrue(inch.equals(inch2));
    }

    @Test
    public void givenFeetAndInch_WhenBothAreNotEquals_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length inch1 = new Length(Unit.INCH, 1);
        boolean equals = feet1.equals(inch1);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0FeetAnd0Inch_WhenCompareBothLengthAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 0);
        Length inch1 = new Length(Unit.INCH, 0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length inch1 = new Length(Unit.INCH, 1);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompareBothLengthAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length feet2 = new Length(Unit.FEET, 1);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_WhenCompareBothLengthAreEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Unit.INCH, 1);
        Length inch2 = new Length(Unit.INCH, 1);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH, 1);
        Length feet1 = new Length(Unit.FEET, 1);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompare_ShouldReturnBothAreEqual() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length inch1 = new Length(Unit.INCH, 12);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_WhenCompare_ShouldReturnBothAreEqual() {
        Length inch1 = new Length(Unit.INCH, 12);
        Length feet1 = new Length(Unit.FEET, 1);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenTwoYard_WhenBothAreEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 0);
        Length yard2 = new Length(Unit.YARD, 0);
        Assert.assertTrue(yard1.equals(yard2));
    }

    @Test
    public void givenYard_WhenBothYardsAreNotEquals_ShouldReturnFalse() {
        Length yard = new Length(Unit.YARD, 0);
        Length yard2 = new Length(Unit.YARD, 2);
        Assert.assertFalse(yard.equals(yard2));
    }

    @Test
    public void givenTwoYard_WhenYardsAreNegative_ShouldReturnThrowException() {
        try{
            Length yard1 = new Length(Unit.YARD, -1);
            Length yard2 = new Length(Unit.YARD, -2);
            boolean equals = yard1.equals(yard2);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenYards_WhenYardsAreNull_ShouldReturnThrowException() {
        try {
            Length yard = new Length(Unit.YARD, null);
            Length yard2 = new Length(Unit.YARD, null);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenYard_WhenTypeOfYardAreEqual_ShouldReturnTrue() {
        Length yard = new Length(Unit.YARD, 0);
        Length yard2 = new Length(Unit.YARD, 0);
        Assert.assertTrue(yard.equals(yard2));
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length yard1 = new Length(Unit.YARD, 1);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd1Yard_WhenCompareBothLengthAreEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 1);
        Length yard2 = new Length(Unit.YARD, 1);
        boolean compareCheck = yard1.compare(yard2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH, 1);
        Length yard1 = new Length(Unit.YARD, 1);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 1);
        Length inch1 = new Length(Unit.INCH, 36);
        boolean compareCheck = yard1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

}
