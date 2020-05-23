package com.bl.enums;

import com.bl.model.Length;

public enum Unit {
    /**
     * declaring enum constatnts
     */
    FEET(12), INCH(1);
    /**
     * final constant variable
     */
    private final int baseUnitConversion;
    /**
     * Parameterized constructor to take one input value
     * @param baseUnitConversion
     */
    Unit(int baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }
    /**
     * This method comapre unit length of the current object with object of same or different type
     * @param l1, l2
     * @return true or false
     */
    public boolean compare(Length l1, Length l2){
        return  Integer.compare(l1.value*l1.unit.baseUnitConversion, l2.value*l2.unit.baseUnitConversion) == 0;
    }
}
