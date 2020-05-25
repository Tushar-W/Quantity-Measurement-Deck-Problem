 package com.bl;

import com.bl.enums.Unit;
import com.bl.exception.QuantityMeasurementException;
import com.bl.model.Length;
import com.bl.model.Volume;
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

    @Test
    public void given36InchAnd1Yard_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Unit.INCH, 36);
        Length yard1 = new Length(Unit.YARD, 1);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 1);
        Length feet1 = new Length(Unit.FEET, 3);
        boolean compareCheck = yard1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 3);
        Length yard1 = new Length(Unit.YARD, 1);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenTwoCentimeter_WhenBothAreEqual_ShouldReturnTrue() {
        Length cm1 = new Length(Unit.CENTIMETER, 0);
        Length cm2 = new Length(Unit.CENTIMETER, 0);
        Assert.assertTrue(cm1.equals(cm2));
    }

    @Test
    public void givenCentimeter_WhenBothCentimeterAreNotEquals_ShouldReturnFalse() {
        Length cm1 = new Length(Unit.CENTIMETER, 0);
        Length cm2 = new Length(Unit.CENTIMETER, 2);
        Assert.assertFalse(cm1.equals(cm2));
    }

    @Test
    public void givenTwoCentimeter_WhenCentimeterAreNegative_ShouldReturnThrowException() {
        try{
            Length cm1 = new Length(Unit.CENTIMETER, -1);
            Length cm2 = new Length(Unit.CENTIMETER, -2);
            boolean equals = cm1.equals(cm2);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenCentimeter_WhenCentimeterAreNull_ShouldReturnThrowException() {
        try {
            Length cm = new Length(Unit.CENTIMETER, null);
            Length cm2 = new Length(Unit.CENTIMETER, null);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void given1CentimeterAnd1Inch_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length cm1 = new Length(Unit.CENTIMETER, 1);
        Length inch1 = new Length(Unit.INCH, 1);
        boolean compareCheck = cm1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Centimeter_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length cm1 = new Length(Unit.CENTIMETER, 1);
        boolean compareCheck = feet1.compare(cm1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd1Centimeter_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length yard1 = new Length(Unit.YARD, 1);
        Length cm1 = new Length(Unit.CENTIMETER, 1);
        boolean compareCheck = yard1.compare(cm1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given5CentimeterAnd2Inch_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length cm1 = new Length(Unit.CENTIMETER, 5);
        Length inch1 = new Length(Unit.INCH, 2);
        boolean compareCheck = cm1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Unit.INCH, 2);
        Length cm1 = new Length(Unit.CENTIMETER, 5);
        boolean compareCheck = inch1.compare(cm1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd30Centimeter_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length cm1 = new Length(Unit.CENTIMETER, 30);
        boolean compareCheck = feet1.compare(cm1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd90Centimeter_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 1);
        Length cm1 = new Length(Unit.CENTIMETER, 90);
        boolean compareCheck = yard1.compare(cm1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAddBothLengthOfInches_ShouldReturnAddition() {
        Length inch1 = new Length(Unit.INCH, 2);
        Length inch2 = new Length(Unit.INCH, 2);
        double addition = inch1.add(inch2);
        Assert.assertEquals(4,addition,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAddBothLengthOfUnits_ShouldReturnAdditionInInch() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length inch2 = new Length(Unit.INCH, 2);
        double addition = feet1.add(inch2);
        Assert.assertEquals(14,addition,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAddBothLengthOfUnits_ShouldReturnAdditionInInch() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length feet2 = new Length(Unit.FEET, 1);
        double addition = feet1.add(feet2);
        Assert.assertEquals(24,addition,0.0);
    }

    @Test
    public void given2InchAnd2Centimeter_WhenAddBothLengthOfUnits_ShouldReturnAdditionInInch() {
        Length inch = new Length(Unit.INCH, 2);
        Length cm = new Length(Unit.CENTIMETER, 2);
        double addition = inch.add(cm);
        Assert.assertEquals(2.8,addition,0.0);
    }

    @Test
    public void givenLitre_WhenBothLitreAreEquals_ShouldReturnTrue() {
        Volume litre = new Volume(Unit.LITRE, 0.0);
        Volume litre2 = new Volume(Unit.LITRE, 0.0);
        boolean equals = litre.equals(litre2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenLitre_WhenBothLitreAreNotEquals_ShouldReturnFalse() {
        Volume litre = new Volume(Unit.LITRE, 0.0);
        Volume litre2 = new Volume(Unit.LITRE, 2.0);
        boolean equals = litre.equals(litre2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenTwoLitre_WhenLitreAreNegative_ShouldReturnThrowException() {
        try{
            Volume litre = new Volume(Unit.LITRE, -1.0);
            Volume litre2 = new Volume(Unit.LITRE, -2.0);
            boolean equals = litre.equals(litre2);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenLitres_WhenLitresAreNull_ShouldReturnThrowException() {
        try {
            Volume litre = new Volume(Unit.LITRE, null);
            Volume litre2 = new Volume(Unit.LITRE, null);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenLitre_WhenReferenceOfLitreAreEqual_ShouldReturnTrue() {
        Volume litre = new Volume(Unit.LITRE, 2.0);
        Assert.assertTrue(litre.equals(litre));
    }

    @Test
    public void givenLitre_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Volume litre = new Volume(Unit.LITRE, 3.0);
        Volume litre2 = new Volume(Unit.LITRE, 3.0);
        Assert.assertTrue(litre.equals(litre2));
    }

    @Test
    public void givenGallon_WhenBothGallonAreEquals_ShouldReturnTrue() {
        Volume gallon = new Volume(Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Unit.GALLON, 0.0);
        boolean equals = gallon.equals(gallon2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenLitreAndGallon_WhenCompareBothLengthAreEquals_ShouldReturnTrue() {
        Volume litre = new Volume(Unit.LITRE, 1.0);
        Volume gallon = new Volume(Unit.GALLON, 0.2);
        boolean equals = litre.compare(gallon);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenGallonAndLitre_WhenCompareBothLengthAreEquals_ShouldReturnTrue() {
        Volume gallon = new Volume(Unit.GALLON, 1.0);
        Volume litre = new Volume(Unit.LITRE, 5.0);
        boolean equals = gallon.compare(litre);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenMillilitres_WhenBothMillilitreAreEquals_ShouldReturnTrue() {
        Volume ml = new Volume(Unit.MILLILITRES, 0.0);
        Volume ml2 = new Volume(Unit.MILLILITRES, 0.0);
        boolean equals = ml.equals(ml2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenLitreAndMillilitres_WhenBothAreEquals_ShouldReturnTrue() {
        Volume litre = new Volume(Unit.LITRE, 1.0);
        Volume ml = new Volume(Unit.MILLILITRES, 1000.0);
        boolean equals = litre.compare(ml);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenMillilitresAndLitre_WhenBothAreEquals_ShouldReturnTrue() {
        Volume ml = new Volume(Unit.MILLILITRES, 1.0);
        Volume litre = new Volume(Unit.LITRE, 0.001);
        boolean equals = ml.compare(litre);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenGallonAndMillilitres_WhenBothAreEquals_ShouldReturnTrue() {
        Volume gallon = new Volume(Unit.GALLON, 1.0);
        Volume ml = new Volume(Unit.MILLILITRES, 5000.0);
        boolean equals = gallon.compare(ml);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenMillilitresAndGallon_WhenBothAreEquals_ShouldReturnTrue() {
        Volume ml = new Volume(Unit.MILLILITRES, 1.0);
        Volume gallon = new Volume(Unit.GALLON, 0.0002);
        boolean equals = gallon.compare(ml);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenGallonAndLitre_WhenAddBothUnitsValue_ShouldReturnAdditionInLitres() {
        Volume gallon = new Volume(Unit.GALLON, 1.0);
        Volume litre = new Volume(Unit.LITRE, 5.0);
        double addition = gallon.add(litre);
        Assert.assertEquals(10.0, addition, 0.0);
    }
}
