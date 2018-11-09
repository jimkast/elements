package org.elements.bimap;

import org.elements.types.BiMapping;

public final class BiMapFixed<X, Y, Z> implements BiMapping<X, Y, Z> {
    private final Z result;

    public BiMapFixed(Z result) {
        this.result = result;
    }

    @Override
    public Z map(X x, Y y) {
        return result;
    }
}
