package com.bl.enums;

import com.bl.model.Length;

public enum Unit {
    /**
     * declaring enum constatnts
     */
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4);
    /**
     * final constant variable
     */
    private final double baseUnitConversion;
    /**
     * Parameterized constructor to take one input value
     * @param baseUnitConversion
     */
    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }
    /**
     * This method comapre unit length of the current object with object of same or different type
     * @param l1, l2
     * @return true or false
     */
    public boolean compare(Length l1, Length l2){
        return  Double.compare(l1.value*l1.unit.baseUnitConversion, l2.value*l2.unit.baseUnitConversion) == 0;
    }

    public double add(Length l1, Length l2) {
        return Double.sum(l1.value*l1.unit.baseUnitConversion, l2.value*l2.unit.baseUnitConversion);
    }
}
