package org.elements.bisrc;

import org.elements.types.BiSource;
import org.elements.types.Mapping;
import org.elements.types.Source;

public final class BiSrcFor1<X, Y> implements Source<X> {
    private final BiSource<X, Y> bi;

    public BiSrcFor1(BiSource<X, Y> bi) {
        this.bi = bi;
    }

    @Override
    public <X1> X1 feed(Mapping<X, X1> target, X1 other) {
        return bi.feed((x, y) -> target.map(x), other);
    }
}
