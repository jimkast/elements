package org.elements.bimap;

import org.elements.types.BiMapping;
import org.elements.types.Mapping;

public final class BiMap1<X, Y, Z> implements BiMapping<X, Y, Z> {
    private final Mapping<X, Z> mapping;

    public BiMap1(Mapping<X, Z> mapping) {
        this.mapping = mapping;
    }

    @Override
    public Z map(X x, Y y) {
        return mapping.map(x);
    }
}
