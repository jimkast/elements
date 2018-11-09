package org.elements.src;

import org.elements.map.MappedKey;
import org.elements.types.Mapping;
import org.elements.types.Source;

public final class SrcMapped<T, W> implements Source<W> {
    private final Mapping<T, W> mapping;
    private final Source<T> origin;

    public SrcMapped(Mapping<T, W> mapping, Source<T> origin) {
        this.mapping = mapping;
        this.origin = origin;
    }

    @Override
    public <X> X feed(Mapping<W, X> target, X other) {
        return origin.feed(new MappedKey<>(mapping, target), other);
    }
}
