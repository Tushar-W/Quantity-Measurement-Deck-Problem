 package com.bl;

import com.bl.enums.Unit;
import com.bl.exception.QuantityMeasurementException;
import com.bl.model.Length;
import com.bl.model.Temperature;
import com.bl.model.Volume;
import com.bl.model.Weight;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    //Feet
    @Test
    public void givenTwoFeets_WhenBothFeetAreEquals_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenTwoFeets_WhenBothFeetAreNotEquals_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 2.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenTwoFeets_WhenFeetAreNegative_ShouldReturnThrowException() {
        try{
            Length feet1 = new Length(Unit.FEET, -1.0);
            Length feet2 = new Length(Unit.FEET, -2.0);
            Assert.assertTrue(feet1.equals(feet2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenFeets_WhenFeetsAreNull_ShouldReturnThrowException() {
        try {
            Length feet1 = new Length(Unit.FEET, null);
            Length feet2 = new Length(Unit.FEET, null);
            Assert.assertTrue(feet1.equals(feet2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenFeets_WhenReferenceOfFeetsAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 2.0);
        Assert.assertTrue(feet1.equals(feet1));
    }

    @Test
    public void givenFeets_WhenTypeOfFeetsAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        Assert.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenFeets_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 3.0);
        Length feet2 = new Length(Unit.FEET, 3.0);
        Assert.assertEquals(feet1.value, feet2.value, 0.0);
    }

    //Inch
    @Test
    public void givenTwoInch_WhenBothInchAreEquals_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 0.0);
        Assert.assertTrue(inch.equals(inch2));
    }

    @Test
    public void givenInches_WhenBothInchesAreNotEquals_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 2.0);
        Assert.assertFalse(inch.equals(inch2));
    }

    @Test
    public void givenTwoInches_WhenInchesAreNegative_ShouldReturnThrowException() {
        try{
            Length inch1 = new Length(Unit.INCH, -1.0);
            Length inch2 = new Length(Unit.INCH, -2.0);
            Assert.assertTrue(inch1.equals(inch2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenInches_WhenInchesAreNull_ShouldReturnThrowException() {
        try {
            Length inch = new Length(Unit.INCH, null);
            Length inch2 = new Length(Unit.INCH, null);
            Assert.assertTrue(inch.equals(inch2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenInches_WhenReferenceOfInchesAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 2.0);
        Assert.assertTrue(inch.equals(inch));
    }

    @Test
    public void givenInches_WhenTypeOfInchesAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 0.0);
        Assert.assertEquals(inch.getClass(), inch2.getClass());
    }

    @Test
    public void givenInches_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length inch2 = new Length(Unit.INCH, 2.0);
        Assert.assertEquals(inch.value, inch2.value, 0.0);
    }

    @Test
    public void givenFeetAndInch_WhenBothAreNotEquals_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length inch1 = new Length(Unit.INCH, 1.0);
        Assert.assertFalse(feet1.equals(inch1));
    }

    @Test
    public void given0FeetAnd0Inch_WhenCompareBothLengthAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length inch1 = new Length(Unit.INCH, 0.0);
        Assert.assertTrue(feet1.compare(inch1));
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length inch1 = new Length(Unit.INCH, 1.0);
        Assert.assertFalse(feet1.compare(inch1));
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompareBothLengthAreEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        Assert.assertTrue(feet1.compare(feet2));
    }

    @Test
    public void given1InchAnd1Inch_WhenCompareBothLengthAreEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        Length inch2 = new Length(Unit.INCH, 1.0);
        Assert.assertTrue(inch1.compare(inch2));
    }

    @Test
    public void given1InchAnd1Feet_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        Length feet1 = new Length(Unit.FEET, 1.0);
        Assert.assertFalse(inch1.compare(feet1));
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompare_ShouldReturnBothAreEqual() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length inch1 = new Length(Unit.INCH, 12.0);
        Assert.assertTrue(feet1.compare(inch1));
    }

    @Test
    public void given12InchAnd1Feet_WhenCompare_ShouldReturnBothAreEqual() {
        Length inch1 = new Length(Unit.INCH, 12.0);
        Length feet1 = new Length(Unit.FEET, 1.0);
        Assert.assertTrue(inch1.compare(feet1));
    }

    //Yard
    @Test
    public void givenTwoYard_WhenBothAreEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 0.0);
        Length yard2 = new Length(Unit.YARD, 0.0);
        Assert.assertTrue(yard1.equals(yard2));
    }

    @Test
    public void givenYard_WhenBothYardsAreNotEquals_ShouldReturnFalse() {
        Length yard = new Length(Unit.YARD, 0.0);
        Length yard2 = new Length(Unit.YARD, 2.0);
        Assert.assertFalse(yard.equals(yard2));
    }

    @Test
    public void givenTwoYard_WhenYardsAreNegative_ShouldReturnThrowException() {
        try{
            Length yard1 = new Length(Unit.YARD, -1.0);
            Length yard2 = new Length(Unit.YARD, -2.0);
            Assert.assertTrue(yard1.equals(yard2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenYards_WhenYardsAreNull_ShouldReturnThrowException() {
        try {
            Length yard = new Length(Unit.YARD, null);
            Length yard2 = new Length(Unit.YARD, null);
            Assert.assertTrue(yard.equals(yard2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenYards_WhenReferenceOfYardsAreEqual_ShouldReturnTrue() {
        Length yard = new Length(Unit.YARD, 2.0);
        Assert.assertTrue(yard.equals(yard));
    }

    @Test
    public void givenYard_WhenTypeOfYardAreEqual_ShouldReturnTrue() {
        Length yard = new Length(Unit.YARD, 0.0);
        Length yard2 = new Length(Unit.YARD, 0.0);
        Assert.assertEquals(yard.getClass(), yard2.getClass());
    }

    @Test
    public void givenYards_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Length yard = new Length(Unit.YARD, 2.0);
        Length yard2 = new Length(Unit.YARD, 2.0);
        Assert.assertEquals(yard.value, yard2.value, 0.0);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length yard1 = new Length(Unit.YARD, 1.0);
        Assert.assertFalse(feet1.compare(yard1));
    }

    @Test
    public void given1YardAnd1Yard_WhenCompareBothLengthAreEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 1.0);
        Length yard2 = new Length(Unit.YARD, 1.0);
        Assert.assertTrue(yard1.compare(yard2));
    }

    @Test
    public void given1InchAnd1Yard_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        Length yard1 = new Length(Unit.YARD, 1.0);
        Assert.assertFalse(inch1.compare(yard1));
    }

    @Test
    public void given1YardAnd36Inch_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 1.0);
        Length inch1 = new Length(Unit.INCH, 36.0);
        Assert.assertTrue(yard1.compare(inch1));
    }

    @Test
    public void given36InchAnd1Yard_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Unit.INCH, 36.0);
        Length yard1 = new Length(Unit.YARD, 1.0);
        Assert.assertTrue(inch1.compare(yard1));
    }

    @Test
    public void given1YardAnd3Feet_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 1.0);
        Length feet1 = new Length(Unit.FEET, 3.0);
        Assert.assertTrue(yard1.compare(feet1));
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 3.0);
        Length yard1 = new Length(Unit.YARD, 1.0);
        Assert.assertTrue(feet1.compare(yard1));
    }

    //Centimeter
    @Test
    public void givenTwoCentimeter_WhenBothAreEqual_ShouldReturnTrue() {
        Length cm1 = new Length(Unit.CENTIMETER, 0.0);
        Length cm2 = new Length(Unit.CENTIMETER, 0.0);
        Assert.assertTrue(cm1.equals(cm2));
    }

    @Test
    public void givenCentimeter_WhenBothCentimeterAreNotEquals_ShouldReturnFalse() {
        Length cm1 = new Length(Unit.CENTIMETER, 0.0);
        Length cm2 = new Length(Unit.CENTIMETER, 2.0);
        Assert.assertFalse(cm1.equals(cm2));
    }

    @Test
    public void givenTwoCentimeter_WhenCentimeterAreNegative_ShouldReturnThrowException() {
        try{
            Length cm1 = new Length(Unit.CENTIMETER, -1.0);
            Length cm2 = new Length(Unit.CENTIMETER, -2.0);
            Assert.assertTrue(cm1.equals(cm2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenCentimeter_WhenCentimeterAreNull_ShouldReturnThrowException() {
        try {
            Length cm = new Length(Unit.CENTIMETER, null);
            Length cm2 = new Length(Unit.CENTIMETER, null);
            Assert.assertTrue(cm.equals(cm2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenCentimeter_WhenReferenceOfCentimeterAreEqual_ShouldReturnTrue() {
        Length cm = new Length(Unit.CENTIMETER, 2.0);
        Assert.assertTrue(cm.equals(cm));
    }

    @Test
    public void givenCentimeter_WhenTypeOfCentimeterAreEqual_ShouldReturnTrue() {
        Length cm = new Length(Unit.CENTIMETER, 0.0);
        Length cm2 = new Length(Unit.CENTIMETER, 0.0);
        Assert.assertEquals(cm.getClass(), cm2.getClass());
    }

    @Test
    public void givenCentimeter_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Length cm = new Length(Unit.CENTIMETER, 2.0);
        Length cm2 = new Length(Unit.CENTIMETER, 2.0);
        Assert.assertEquals(cm.value, cm2.value, 0.0);
    }

    @Test
    public void given1CentimeterAnd1Inch_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length cm1 = new Length(Unit.CENTIMETER, 1.0);
        Length inch1 = new Length(Unit.INCH, 1.0);
        Assert.assertFalse(cm1.compare(inch1));
    }

    @Test
    public void given1FeetAnd1Centimeter_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length cm1 = new Length(Unit.CENTIMETER, 1.0);
        Assert.assertFalse(feet1.compare(cm1));
    }

    @Test
    public void given1YardAnd1Centimeter_WhenCompareBothLengthAreNotEqual_ShouldReturnFalse() {
        Length yard1 = new Length(Unit.YARD, 1.0);
        Length cm1 = new Length(Unit.CENTIMETER, 1.0);
        Assert.assertFalse(yard1.compare(cm1));
    }

    @Test
    public void given5CentimeterAnd2Inch_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length cm1 = new Length(Unit.CENTIMETER, 5.0);
        Length inch1 = new Length(Unit.INCH, 2.0);
        Assert.assertTrue(cm1.compare(inch1));
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Unit.INCH, 2.0);
        Length cm1 = new Length(Unit.CENTIMETER, 5.0);
        Assert.assertTrue(inch1.compare(cm1));
    }

    @Test
    public void given1FeetAnd30Centimeter_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length cm1 = new Length(Unit.CENTIMETER, 30.0);
        Assert.assertTrue(feet1.compare(cm1));
    }

    @Test
    public void given1YardAnd90Centimeter_WhenCompareBothLengthEqual_ShouldReturnTrue() {
        Length yard1 = new Length(Unit.YARD, 1.0);
        Length cm1 = new Length(Unit.CENTIMETER, 90.0);
        Assert.assertTrue(yard1.compare(cm1));
    }

    //addition of two length
    @Test
    public void given2InchAnd2Inch_WhenAddBothLengthOfInches_ShouldReturnAddition() {
        Length inch1 = new Length(Unit.INCH, 2.0);
        Length inch2 = new Length(Unit.INCH, 2.0);
        double addition = inch1.add(inch2);
        Assert.assertEquals(4, addition,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAddBothLengthOfUnits_ShouldReturnAdditionInInch() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length inch2 = new Length(Unit.INCH, 2.0);
        double addition = feet1.add(inch2);
        Assert.assertEquals(14, addition,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAddBothLengthOfUnits_ShouldReturnAdditionInInch() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        double addition = feet1.add(feet2);
        Assert.assertEquals(24, addition,0.0);
    }

    @Test
    public void given2InchAnd2Centimeter_WhenAddBothLengthOfUnits_ShouldReturnAdditionInInch() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length cm = new Length(Unit.CENTIMETER, 2.5);
        double addition = inch.add(cm);
        Assert.assertEquals(3, addition,0.0);
    }

    //Litre
    @Test
    public void givenLitre_WhenBothLitreAreEquals_ShouldReturnTrue() {
        Volume litre = new Volume(Unit.LITRE, 0.0);
        Volume litre2 = new Volume(Unit.LITRE, 0.0);
        Assert.assertTrue(litre.equals(litre2));
    }

    @Test
    public void givenLitre_WhenBothLitreAreNotEquals_ShouldReturnFalse() {
        Volume litre = new Volume(Unit.LITRE, 0.0);
        Volume litre2 = new Volume(Unit.LITRE, 2.0);
        Assert.assertFalse(litre.equals(litre2));
    }

    @Test
    public void givenTwoLitre_WhenLitreAreNegative_ShouldReturnThrowException() {
        try{
            Volume litre = new Volume(Unit.LITRE, -1.0);
            Volume litre2 = new Volume(Unit.LITRE, -2.0);
            Assert.assertTrue(litre.equals(litre2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenLitres_WhenLitresAreNull_ShouldReturnThrowException() {
        try {
            Volume litre = new Volume(Unit.LITRE, null);
            Volume litre2 = new Volume(Unit.LITRE, null);
            Assert.assertTrue(litre.equals(litre2));
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
    public void givenLitre_WhenTypeOfLitreAreEqual_ShouldReturnTrue() {
        Length litre = new Length(Unit.LITRE, 0.0);
        Length litre2 = new Length(Unit.LITRE, 0.0);
        Assert.assertEquals(litre.getClass(), litre2.getClass());
    }

    @Test
    public void givenLitre_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Volume litre = new Volume(Unit.LITRE, 3.0);
        Volume litre2 = new Volume(Unit.LITRE, 3.0);
        Assert.assertEquals(litre.value, litre2.value, 0.0);
    }

    @Test
    public void givenGallon_WhenBothGallonAreEquals_ShouldReturnTrue() {
        Volume gallon = new Volume(Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Unit.GALLON, 0.0);
        Assert.assertTrue(gallon.equals(gallon2));
    }

    @Test
    public void givenGallonAndLitre_WhenCompareBothLengthAreEquals_ShouldReturnTrue() {
        Volume gallon = new Volume(Unit.GALLON, 1.0);
        Volume litre = new Volume(Unit.LITRE, 4.54);
        Assert.assertTrue(gallon.compare(litre));
    }

    @Test
    public void givenMillilitres_WhenBothMillilitreAreEquals_ShouldReturnTrue() {
        Volume ml = new Volume(Unit.MILLILITRES, 0.0);
        Volume ml2 = new Volume(Unit.MILLILITRES, 0.0);
        Assert.assertTrue(ml.equals(ml2));
    }

    @Test
    public void givenLitreAndMillilitres_WhenBothAreEquals_ShouldReturnTrue() {
        Volume litre = new Volume(Unit.LITRE, 1.0);
        Volume ml = new Volume(Unit.MILLILITRES, 1000.0);
        Assert.assertTrue(litre.compare(ml));
    }

    @Test
    public void givenMillilitresAndLitre_WhenBothAreEquals_ShouldReturnTrue() {
        Volume ml = new Volume(Unit.MILLILITRES, 1.0);
        Volume litre = new Volume(Unit.LITRE, 0.001);
        Assert.assertTrue(ml.compare(litre));
    }

    @Test
    public void givenGallonAndMillilitres_WhenBothAreEquals_ShouldReturnTrue() {
        Volume gallon = new Volume(Unit.GALLON, 1.0);
        Volume ml = new Volume(Unit.MILLILITRES, 4540.0);
        Assert.assertTrue(gallon.compare(ml));
    }

    //addition
    @Test
    public void givenGallonAndLitre_WhenAddBothUnitsValue_ShouldReturnAdditionInLitres() {
        Volume gallon = new Volume(Unit.GALLON, 1.0);
        Volume litre = new Volume(Unit.LITRE, 4.54);
        double addition = gallon.add(litre);
        Assert.assertEquals(9.08, addition, 0.0);
    }

    @Test
    public void givenLitreAndMillilitres_WhenAddBothUnitsValue_ShouldReturnAdditionInLitres() {
        Volume litre = new Volume(Unit.LITRE, 1.0);
        Volume ml = new Volume(Unit.MILLILITRES, 1000.0);
        double addition = litre.add(ml);
        Assert.assertEquals(2, addition, 0.0);
    }

    //Gram
    @Test
    public void givenGram_WhenBothGramAreEquals_ShouldReturnTrue() {
        Weight gram = new Weight(Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Unit.GRAM, 0.0);
        Assert.assertTrue(gram.equals(gram2));
    }

    @Test
    public void givenGram_WhenBothGramAreNotEquals_ShouldReturnFalse() {
        Weight gram = new Weight(Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Unit.GRAM, 2.0);
        Assert.assertFalse(gram.equals(gram2));
    }

    @Test
    public void givenGram_WhenGramAreNegative_ShouldReturnThrowException() {
        try {
            Weight gram = new Weight(Unit.GRAM, -1.0);
            Weight gram2 = new Weight(Unit.GRAM, -2.0);
            Assert.assertFalse(gram.equals(gram2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }
    @Test
    public void givenGram_WhenGramAreNull_ShouldReturnThrowException() {
        try {
            Weight gram = new Weight(Unit.GRAM, null);
            Weight gram2 = new Weight(Unit.GRAM, null);
            Assert.assertFalse(gram.equals(gram2));
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenGram_WhenReferenceOfGramAreEqual_ShouldReturnTrue() {
        Weight gram = new Weight(Unit.GRAM, 2.0);
        Assert.assertTrue(gram.equals(gram));
    }

    @Test
    public void givenGram_WhenTypeOfGramAreEqual_ShouldReturnTrue() {
        Length gram = new Length(Unit.GRAM, 0.0);
        Length gram2 = new Length(Unit.GRAM, 0.0);
        Assert.assertEquals(gram.getClass(), gram2.getClass());
    }

    @Test
    public void givenGram_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Volume gram = new Volume(Unit.GRAM, 3.0);
        Volume gram2 = new Volume(Unit.GRAM, 3.0);
        Assert.assertEquals(gram.value, gram2.value, 0.0);
    }

    @Test
    public void givenGramAndKilogram_WhenBothAreEquals_ShouldReturnTrue() {
        Weight gram = new Weight(Unit.GRAM, 0.0);
        Weight kg = new Weight(Unit.KILOGRAM, 0.0);
        Assert.assertTrue(gram.compare(kg));
    }

    @Test
    public void given1KilogramAnd1000Gram_WhenBothAreEquals_ShouldReturnTrue() {
        Weight kg = new Weight(Unit.KILOGRAM, 1.0);
        Weight gram = new Weight(Unit.GRAM, 1000.0);
        Assert.assertTrue(kg.compare(gram));
    }

    @Test
    public void given1GramAndKilogram_WhenBothAreEquals_ShouldReturnTrue() {
        Weight gram = new Weight(Unit.GRAM, 1.0);
        Weight kg = new Weight(Unit.KILOGRAM, 0.001);
        Assert.assertTrue(gram.compare(kg));
    }

    @Test
    public void given1TonneAnd1000Kilogram_WhenBothAreEquals_ShouldReturnTrue() {
        Weight tonne = new Weight(Unit.TONNE, 1.0);
        Weight kg = new Weight(Unit.KILOGRAM, 1000.0);
        Assert.assertTrue(tonne.compare(kg));
    }

    @Test
    public void given1TonneAnd1000000Gram_WhenBothAreEquals_ShouldReturnTrue() {
        Weight tonne = new Weight(Unit.TONNE, 1.0);
        Weight gram = new Weight(Unit.GRAM, 1000000.0);
        Assert.assertTrue(tonne.compare(gram));
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAddBothWeightsValues_ShouldReturnAdditionInKilogram() {
        Weight tonne = new Weight(Unit.TONNE, 1.0);
        Weight gram = new Weight(Unit.GRAM, 1000.0);
        double addition = tonne.add(gram);
        Assert.assertEquals(1001, addition, 0.0);
    }

    //Temperature
    @Test
    public void givenCelsius_WhenBothAreEquals_ShouldReturnTrue() {
        Temperature cel = new Temperature(Unit.CELSIUS, 0);
        Temperature cel2 = new Temperature(Unit.CELSIUS, 0);
        Assert.assertTrue(cel.equals(cel2));
    }

    @Test
    public void givenCelsius_WhenBothAreNotEquals_ShouldReturnFalse() {
        Temperature cel = new Temperature(Unit.CELSIUS, 0);
        Temperature cel2 = new Temperature(Unit.CELSIUS, 2);
        Assert.assertFalse(cel.equals(cel2));
    }

    @Test
    public void givenCelsius_WhenCelsiusInNegative_ShouldReturnThrowException() {
        try{
            Temperature cel = new Temperature(Unit.CELSIUS, -1);
            Temperature cel2 = new Temperature(Unit.CELSIUS, -2);
            Assert.assertTrue(cel.equals(cel2));
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void givenCelsius_WhenCelsiusAreNull_ShouldReturnThrowException() {
        try {
            Temperature cel = new Temperature(Unit.CELSIUS, null);
            Temperature cel2 = new Temperature(Unit.CELSIUS, null);
            Assert.assertFalse(cel.equals(cel2));
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenCelsius_WhenTypeOfCelsiusAreEqual_ShouldReturnTrue() {
        Temperature cel = new Temperature(Unit.CELSIUS, 0);
        Temperature cel2 = new Temperature(Unit.CELSIUS, 0);
        Assert.assertEquals(cel.getClass(), cel2.getClass());
    }

    @Test
    public void givenCelsius_WhenValueOfObjectAreEqual_ShouldReturnTrue() {
        Temperature cel = new Temperature(Unit.CELSIUS, 3);
        Temperature cel2 = new Temperature(Unit.CELSIUS, 3);
        Assert.assertEquals(cel.value, cel2.value, 0.0);
    }

    @Test
    public void givenCelsiusAndFahrenheit_WhenBothAreEquals_ShouldReturnTrue() {
        Temperature cel = new Temperature(Unit.CELSIUS, 0);
        Temperature fah = new Temperature(Unit.FAHRENHEIT, 32);
        Assert.assertTrue(cel.equate(fah));
    }

    @Test
    public void givenFahrenheitAndCelsius_WhenBothAreEquals_ShouldReturnTrue() {
        Temperature fah = new Temperature(Unit.FAHRENHEIT, 32);
        Temperature cel = new Temperature(Unit.CELSIUS, 0);
        Assert.assertTrue(cel.equate(fah));
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenBothAreEquals_ShouldReturnTrue() {
        Temperature fah = new Temperature(Unit.FAHRENHEIT, 212);
        Temperature cel = new Temperature(Unit.CELSIUS, 100);
        Assert.assertTrue(fah.equate(cel));
    }
}
