package org.elements.bits;

import org.elements.types.IntIntMapping;
import org.elements.types.Quantity;

public final class IntMapped implements Quantity {
    private final int param;
    private final IntIntMapping mapping;

    public IntMapped(int param, IntIntMapping mapping) {
        this.param = param;
        this.mapping = mapping;
    }

    @Override
    public int length() {
        return mapping.map(param);
    }
}
