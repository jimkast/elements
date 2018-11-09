package org.elements.map;

import org.elements.types.Mapping;

public final class MappedValue<K, X, Y> implements Mapping<K, Y> {
    private final Mapping<X, Y> mapper;
    private final Mapping<K, X> origin;

    public MappedValue(Mapping<X, Y> mapper, Mapping<K, X> origin) {
        this.mapper = mapper;
        this.origin = origin;
    }

    @Override
    public Y map(K key) {
        return mapper.map(origin.map(key));
    }
}
