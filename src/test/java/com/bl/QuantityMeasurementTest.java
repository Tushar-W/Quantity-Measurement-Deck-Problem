package com.bl;

import com.bl.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeets_WhenBothFeetAreZero_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        int feet1 = 0;
        int feet2 = 0;
        boolean isEqualFeets = quantityMeasurement.checkIsEqualFeets(feet1, feet2);
        Assert.assertTrue(isEqualFeets);
    }
}
