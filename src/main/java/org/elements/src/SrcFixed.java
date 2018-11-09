package org.elements.src;

import org.elements.types.Mapping;
import org.elements.types.Source;

public final class SrcFixed<T> implements Source<T> {
    private final T val;

    public SrcFixed(T val) {
        this.val = val;
    }

    @Override
    public <X> X feed(Mapping<T, X> target, X other) {
        return target.map(val);
    }
}