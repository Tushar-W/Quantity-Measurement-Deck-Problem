package com.bl.enums;

import com.bl.model.Length;
import com.bl.model.Temperature;
import com.bl.model.Volume;
import com.bl.model.Weight;

public enum Unit {
    /**
     * declaring enum constants
     */
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4),
    LITRE(1.0), GALLON(4.54),MILLILITRES(0.001),
    GRAM(0.001), KILOGRAM(1.0), TONNE(1000.0),
    CELSIUS(0), FAHRENHEIT(32);
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
    public boolean compareLength(Length l1, Length l2){
        return  Double.compare(l1.value*l1.unit.baseUnitConversion, l2.value*l2.unit.baseUnitConversion) == 0;
    }
    /**
     * This method add unit length of the current object with object of same or different type
     * @param l1, l2
     * @return addition
     */
    public double addLength(Length l1, Length l2) {
        return Double.sum(l1.value*l1.unit.baseUnitConversion, l2.value*l2.unit.baseUnitConversion);
    }
    /**
     * This method comapre unit volume of the current object with object of same or different type
     * @param v1, v2
     * @return true or false
     */
    public boolean compareVolume(Volume v1, Volume v2){
        return  Double.compare(v1.value*v1.unit.baseUnitConversion, v2.value*v2.unit.baseUnitConversion) == 0;
    }
    /**
     * This method add value unit volume of the current object with object of same or different type
     * @param v1, v2
     * @return addition
     */
    public double addVolumes(Volume v1, Volume v2) {
        return Double.sum(v1.value*v1.unit.baseUnitConversion, v2.value*v2.unit.baseUnitConversion);
    }
    /**
     * This method compare unit weight of the current object with object of same or different type
     * @param w1, w2
     * @return true or false
     */
    public boolean compareWeight(Weight w1, Weight w2){
        return  Double.compare(w1.value*w1.unit.baseUnitConversion, w2.value*w2.unit.baseUnitConversion) == 0;
    }
    /**
     * This method add unit weight of the current object with object of same or different type
     * @param w1, w2
     * @return addition
     */
    public double addWeight(Weight w1, Weight w2) {
        return Double.sum(w1.value*w1.unit.baseUnitConversion, w2.value*w2.unit.baseUnitConversion);
    }

    public boolean equate(Temperature t1,  Temperature t2) {
        if (t1.unit.equals(Unit.CELSIUS) && t2.unit.equals(Unit.FAHRENHEIT))
            return ((t1.value * 9/5) + 32 == t2.value);
        if (t1.unit.equals(Unit.FAHRENHEIT) && t2.unit.equals(Unit.CELSIUS))
            return ((t1.value - 32) * 5/9 == (t2.value));
        return false;
    }
}
