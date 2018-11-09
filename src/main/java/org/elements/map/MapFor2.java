package org.elements.map;

import org.elements.types.BiMapping;
import org.elements.types.Mapping;

public final class MapFor2<X, Y, Z> implements Mapping<Y, Z> {
    private final X x;
    private final BiMapping<X, Y, Z> bi;

    public MapFor2(X x, BiMapping<X, Y, Z> bi) {
        this.x = x;
        this.bi = bi;
    }

    @Override
    public Z map(Y y) {
        return bi.map(x, y);
    }
}
