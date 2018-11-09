package org.elements.bisrc;

import org.elements.types.BiMapping;
import org.elements.types.BiSource;
import org.elements.types.Mapping;
import org.elements.types.Source;

public final class BiSrcCombined2<X, Y> implements BiSource<X, Y> {
    private final Mapping<X, Y> mapping;
    private final Source<X> s1;

    public BiSrcCombined2(Mapping<X, Y> mapping, Source<X> s1) {
        this.mapping = mapping;
        this.s1 = s1;
    }

    @Override
    public <Z> Z feed(BiMapping<X, Y, Z> target, Z other) {
        return s1.feed(x -> target.map(x, mapping.map(x)), other);
    }
}
