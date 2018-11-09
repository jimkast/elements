package org.elements.bisrc;

import org.elements.types.BiSource;
import org.elements.types.Mapping;
import org.elements.types.Source;

public final class BiSrcFor2<X, Y> implements Source<Y> {
    private final BiSource<X, Y> bi;

    public BiSrcFor2(BiSource<X, Y> bi) {
        this.bi = bi;
    }

    @Override
    public <X1> X1 feed(Mapping<Y, X1> target, X1 other) {
        return bi.feed((x, y) -> target.map(y), other);
    }
}
