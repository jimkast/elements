package org.elements.bimap;

import org.elements.types.BiMapping;
import org.elements.types.Mapping;

public final class BiMap2<X, Y, Z> implements BiMapping<X, Y, Z> {
    private final Mapping<Y, Z> mapping;

    public BiMap2(Mapping<Y, Z> mapping) {
        this.mapping = mapping;
    }

    @Override
    public Z map(X x, Y y) {
        return mapping.map(y);
    }
}
