package com.bl.model;

import java.util.Objects;

public class Inch {
    private final int value;

    public Inch(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Inch inch = (Inch) obj;
        return value == inch.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
