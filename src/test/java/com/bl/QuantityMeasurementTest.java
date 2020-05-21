package com.bl;

import com.bl.model.Feet;
import com.bl.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeets_WhenBothFeetAreEquals_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenTwoFeets_WhenBothFeetAreNotEquals_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(2.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }
}
