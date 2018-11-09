package org.elements.map;

import org.elements.types.BiMapping;
import org.elements.types.Mapping;

public final class MapFor1<X, Y, Z> implements Mapping<X, Z> {
    private final Y y;
    private final BiMapping<X, Y, Z> bi;

    public MapFor1(Y y, BiMapping<X, Y, Z> bi) {
        this.y = y;
        this.bi = bi;
    }

    @Override
    public Z map(X x) {
        return bi.map(x, y);
    }
}
